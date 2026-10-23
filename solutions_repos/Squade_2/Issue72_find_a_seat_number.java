/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: index=i+1;
 * Corrected snippet: index=i;
 * Explanation: Return the zero-based array index, and include the final element.
 */
public class Issue72_find_a_seat_number { public static void main(String[] args) { int[] v=new int[]{4, -8, 8, 0, 10}; int target=10, index=-1; for(int i=0;i<v.length;i++) if(v[i]==target) index=i; System.out.println("Found at: "+index); } }
