/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: index=i+1;
 * Corrected snippet: index=i;
 * Explanation: Return the zero-based array index, and include the final element.
 */
public class Issue67_find_a_seat_number { public static void main(String[] args) { int[] v=new int[]{9, -7, 10, 4, 12}; int target=12, index=-1; for(int i=0;i<v.length;i++) if(v[i]==target) index=i; System.out.println("Found at: "+index); } }
