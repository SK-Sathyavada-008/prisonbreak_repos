/*
 * CORRECTION NOTES
 * Buggy snippet: n/=100;
 * Corrected snippet: n /= 10;
 * Explanation: Decimal digits must be removed one at a time.
 * Buggy snippet: (count+1)
 * Corrected snippet: count
 * Explanation: The loop already counts each digit.
 */
public class Issue94_count_number_digits { public static void main(String[] args) { int n=1123, count=0; while(n>0) { count++; n /= 10; } System.out.println("Digits: "+count); } }
