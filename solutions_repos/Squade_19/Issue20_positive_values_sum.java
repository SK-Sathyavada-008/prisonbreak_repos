/*
 * CORRECTION NOTES
 * Buggy snippet: if(n>=0)
 * Corrected snippet: if(n > 0)
 * Explanation: Positive values must be strictly greater than zero.
 */
public class Issue20_positive_values_sum { public static void main(String[] args) { int[] v=new int[]{9, -11, 15, 8, 2}; int sum=0; for(int n:v) if(n > 0) sum+=n;  System.out.println("Positive sum: "+sum); } }
