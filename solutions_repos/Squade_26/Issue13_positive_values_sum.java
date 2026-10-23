/*
 * CORRECTION NOTES
 * Buggy snippet: if(n>=0)
 * Corrected snippet: if(n > 0)
 * Explanation: Positive values must be strictly greater than zero.
 */
public class Issue13_positive_values_sum { public static void main(String[] args) { int[] v=new int[]{7, -3, 10, 10, 12}; int sum=0; for(int n:v) if(n > 0) sum+=n;  System.out.println("Positive sum: "+sum); } }
