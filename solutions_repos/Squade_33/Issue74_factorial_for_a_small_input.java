/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=1;i<n;
 * Corrected snippet: for(int i=1; i<=n;
 * Explanation: Factorial multiplies through n inclusively.
 */
public class Issue74_factorial_for_a_small_input { public static void main(String[] args) { int n=4, f=1; for(int i=1; i<=n;i++) f*=i;  System.out.println("Factorial: "+f); } }
