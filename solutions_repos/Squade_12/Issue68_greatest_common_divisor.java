/*
 * CORRECTION NOTES
 * Buggy snippet: (b+1)
 * Corrected snippet: a
 * Explanation: After the Euclidean loop, a contains the GCD.
 * Buggy snippet: a=16+1
 * Corrected snippet: a=16
 * Explanation: Use the supplied first number unchanged.
 */
public class Issue68_greatest_common_divisor { public static void main(String[] args) { int a=16, b=18; while(b!=0) { int t=a%b; a=b; b=t; } System.out.println("GCD: "+a); } }
