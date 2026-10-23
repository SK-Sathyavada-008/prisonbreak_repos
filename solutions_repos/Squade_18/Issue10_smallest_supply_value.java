/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: if(v[i]>min) min=v[i]
 * Corrected snippet: if(v[i]<min) min=v[i]
 * Explanation: A minimum is updated when a smaller value is found.
 */
public class Issue10_smallest_supply_value { public static void main(String[] args) { int[] v=new int[]{2, -9, 13, 11, 0}; int min=v[0]; for(int i=0;i<v.length;i++) if(v[i]<min) min=v[i]; System.out.println("Minimum: "+min); } }
