/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=1;i<v.length-1
 * Corrected snippet: for(int i=1;i<v.length
 * Explanation: The loop skipped the final element.
 */
public class Issue93_highest_daily_score { public static void main(String[] args) { int[] v=new int[]{8, -4, 5, 0, 28}; int max=v[0]+1; for(int i=1;i<v.length;i++) if(v[i]>max) max=v[i]; System.out.println("Maximum: "+max); } }
