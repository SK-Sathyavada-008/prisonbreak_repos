/*
 * CORRECTION NOTES
 * Buggy snippet: y=y;
 * Corrected snippet: y=temp;
 * Explanation: The second variable must receive the saved first value.
 */
public class Issue02_swap_desk_values { public static void main(String[] args) { int x=3, y=7; int temp=x; x=y; y=temp; System.out.println(x+" "+y); } }
