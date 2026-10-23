/*
 * CORRECTION NOTES
 * Buggy snippet: interest=p*r/100+t
 * Corrected snippet: interest=p*r/100*t
 * Explanation: Simple interest multiplies principal, rate, and time.
 * Buggy snippet: interest=p*r/100*t
 * Corrected snippet: interest=p*r*t/100
 * Explanation: Simple interest is principal times rate times time divided by 100.
 */
public class Issue12_simple_interest_estimate { public static void main(String[] args) { int p=130, r=3, t=2; int interest=p*r*t/100;  System.out.println("Interest: "+interest); } }
