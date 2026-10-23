/*
 * CORRECTION NOTES
 * Buggy snippet: case '+': result=x-y;
 * Corrected snippet: case '+': result=x+y;
 * Explanation: The addition case was using subtraction.
 * Buggy snippet: default: result=x*y+1;
 * Corrected snippet: default: result=x*y;
 * Explanation: The multiplication result included an extra one.
 */
public class Issue30_two_value_calculator { public static void main(String[] args) { int x=4, y=8; char op='+'; int result; switch(op) { case '+': result=x+y; break; case '-': result=x-y; break; default: result=x*y; } System.out.println("Answer: "+result); } }
