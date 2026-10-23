/*
 * CORRECTION NOTES
 * Buggy snippet: n/=100;
 * Corrected snippet: n /= 10;
 * Explanation: Decimal digits must be removed one at a time.
 */
public class Issue05_digit_sum_report { public static void main(String[] args) { int n=987654767, sum=0; while(n>0) { sum+=n%10; n /= 10; }  System.out.println("Digit sum: "+sum); } }
