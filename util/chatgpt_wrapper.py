import openai
import os
import signal
import time

def create_chatgpt_config(messages):
    config = {
        "model": "gpt-3.5-turbo",
        "temperature": 0.4,
        "messages": []
    }
    config["messages"] = messages
    return config

def handler(signum, frame):
    raise Exception("end of time")

def request_chatgpt_engine(config):
    ret = None
    while ret is None:
        try:
            signal.signal(signal.SIGALRM, handler)
            signal.alarm(100)
            ret = openai.ChatCompletion.create(**config)
            signal.alarm(0)  # cancel alarm
        except openai.error.InvalidRequestError as e:
            print(e)
            signal.alarm(0)  # cancel alarm
        except openai.error.RateLimitError as e:
            print("Rate limit exceeded. Waiting...")
            print(e)
            signal.alarm(0)  # cancel alarm
            time.sleep(5)  # wait for a minute
        except openai.error.APIConnectionError as e:
            print("API connection error. Waiting...")
            signal.alarm(0)  # cancel alarm
            time.sleep(5)  # wait for a minute
        except Exception as e:
            print(e)
            print("Unknown error. Waiting...")
            signal.alarm(0)  # cancel alarm
            time.sleep(1)  # wait for a minute
    return ret