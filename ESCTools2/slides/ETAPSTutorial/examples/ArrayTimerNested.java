
//@ model import org.jmlspecs.lang.JMLDataGroup;

public class ArrayTimerNested{
  // public JMLDatagroup time, alarm; //@ in objectState;
  //@ model public JMLDatagroup time, alarm;

  char[] currentTime; //@ in time;
  //@ maps currentTime[*] \into time;

  char[] alarmTime; //@ in alarm;
  //@ maps alarmTime[*] \into alarm;

  //@ assignable time;
  public void tick() { currentTime[5]++; }

  //@ assignable alarm;
  public void setAlarm(int hrs, int mins, int secs)  {
    alarmTime[5] = 0;
  }
}

