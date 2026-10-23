/*
 * CORRECTION NOTES
 * Buggy snippet: "Second smallest: "+min
 * Corrected snippet: "Second smallest: "+second
 * Explanation: Print the second-smallest distinct score.
 */
public class Issue96_second_smallest_unique_score { public static void main(String[] args) { int[] v=new int[]{5, -12, 12, 5, 14}; int min=v[0]+1, second=v[1]; for(int n:v) { if(n<min) { second=min; min=n; } else if(n<second && n!=min) second=n; } System.out.println("Second smallest: "+second); } }
