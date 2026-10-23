/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: if(v[i]>min) min=v[i]
 * Corrected snippet: if(v[i]<min) min=v[i]
 * Explanation: A minimum is updated when a smaller value is found.
 */
public class Issue23_smallest_supply_value { public static void main(String[] args) { int[] v=new int[]{7, -5, 13, 0, 0}; int min=v[0]; for(int i=0;i<v.length;i++) if(v[i]<min) min=v[i]; System.out.println("Minimum: "+min); } }
