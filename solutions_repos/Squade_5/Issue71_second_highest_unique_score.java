/*
 * CORRECTION NOTES
 * Buggy snippet: "Second largest: "+first
 * Corrected snippet: "Second largest: "+second
 * Explanation: Print the second-highest distinct score.
 */
public class Issue71_second_highest_unique_score { public static void main(String[] args) { int[] v=new int[]{4, -13, 5, 5, 7}; int first=v[0], second=v[1]; for(int n:v) { if(n>first) { second=first; first=n; } else if(n>second && n!=first) second=n; } System.out.println("Second largest: "+second); } }
