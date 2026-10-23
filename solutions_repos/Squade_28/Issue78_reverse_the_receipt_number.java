/*
 * CORRECTION NOTES
 * Buggy snippet: n/=100;
 * Corrected snippet: n /= 10;
 * Explanation: Decimal digits must be removed one at a time.
 */
public class Issue78_reverse_the_receipt_number { public static void main(String[] args) { int n=1239, r=0; while(n>0) { r=r*10+n%10; n /= 10; } System.out.println("Reverse: "+r); } }
