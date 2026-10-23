/*
 * CORRECTION NOTES
 * Buggy snippet: (b+1)
 * Corrected snippet: a
 * Explanation: After the Euclidean loop, a contains the GCD.
 * Buggy snippet: a=12+1
 * Corrected snippet: a=12
 * Explanation: Use the supplied first number unchanged.
 */
public class Issue76_greatest_common_divisor { public static void main(String[] args) { int a=12, b=18; while(b!=0) { int t=a%b; a=b; b=t; } System.out.println("GCD: "+a); } }
