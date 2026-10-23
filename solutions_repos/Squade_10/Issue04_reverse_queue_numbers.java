/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<values.length/2-1;i++) { int t=values[i]; values[i]=values[values.length-1-i]; values[values.length-1-i]=values[i]; }
 * Corrected snippet: for(int i=0;i<values.length/2;i++) { int t=values[i]; values[i]=values[values.length-1-i]; values[values.length-1-i]=t; }
 * Explanation: Reverse the array by swapping both ends inward.
 * Buggy snippet: swap overwrote the saved value
 * Corrected snippet: swap both endpoints using a temporary variable
 * Explanation: Reverse the array by swapping from both ends inward.
 */
public class Issue04_reverse_queue_numbers { public static void main(String[] args) { int[] values=new int[]{6, -11, 8, 5}; for(int i=0;i<values.length/2;i++) { int t=values[i]; values[i]=values[values.length-1-i]; values[values.length-1-i]=t; } for(int i=0;i<values.length;i++) System.out.print(values[i]+(i==values.length-1?"":" ")); } }