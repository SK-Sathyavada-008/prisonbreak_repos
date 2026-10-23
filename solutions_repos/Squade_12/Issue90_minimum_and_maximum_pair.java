/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: if(n<min) min=n; if(n<max) max=n;
 * Corrected snippet: if(n<min) min=n; if(n>max) max=n;
 * Explanation: Minimum and maximum comparisons must point in opposite directions.
 */
public class Issue90_minimum_and_maximum_pair { public static void main(String[] args) { int[] v=new int[]{8, -3, 13, 11, 0}; int min=v[0], max=v[0]; for(int i=0;i<v.length;i++) { int n=v[i]; if(n<min) min=n; if(n>max) max=n; } System.out.println(min+" "+max); } }
