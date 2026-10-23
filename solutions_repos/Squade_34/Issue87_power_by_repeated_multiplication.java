/*
 * CORRECTION NOTES
 * Buggy snippet: i<e-1
 * Corrected snippet: i<e
 * Explanation: Multiply by the base once for each exponent unit.
 * Buggy snippet: (r+1)
 * Corrected snippet: r
 * Explanation: Do not add one after computing the power.
 */
public class Issue87_power_by_repeated_multiplication { public static void main(String[] args) { int b=2, e=4, r=1; for(int i=0;i<e;i++) r*=b; System.out.println("Power: "+r); } }
