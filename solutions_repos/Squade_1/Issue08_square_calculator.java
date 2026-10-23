/*
 * CORRECTION NOTES
 * Buggy snippet: result=n+n+1;
 * Corrected snippet: result=n*n;
 * Explanation: A square is the number multiplied by itself.
 * Buggy snippet: if(n==0) result=1;
 * Corrected snippet: 
 * Explanation: Zero squared is zero.
 */
public class Issue08_square_calculator { public static void main(String[] args) { int n=9; int result=n*n;  System.out.println("Square: "+result); } }
