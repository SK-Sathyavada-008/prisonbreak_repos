/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=1;i<n
 * Corrected snippet: for(int i=1;i<n+1
 * Explanation: The daily total includes the final day.
 */
public class Issue30_daily_savings_total { public static void main(String[] args) { int n=6, sum=0; for(int i=1;i<n+1;i++) sum+=i;  System.out.println("Total: "+sum); } }
