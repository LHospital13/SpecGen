public class ChangeCase {

  public static char changeCase(char c) {
    char result = ' ';    
    if (c > 'z') {
      result = c;
    } else if (c >= 'a') {
      result =  (char)(c - 'a' + 'A');
    } else if (c > 'Z') {
      result =  c;
    } else if (c >= 'A') {
      result =  (char)(c - 'A' + 'a');
    } else {
      result = c;
    }
    return result;
  }

  public static void main(String[] args) {
    changeCase('a');
    changeCase('b');
    changeCase('p');
    changeCase('z');
    changeCase('1');
    changeCase('?');
    changeCase('A');
    changeCase('N');
    changeCase('Z');
    changeCase('R');
    changeCase(' ');
    changeCase('+');
  }

}
