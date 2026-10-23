/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: found=i+1;
 * Corrected snippet: found=i;
 * Explanation: Return the zero-based array index, and include the final element.
 * Buggy snippet: if(v[i]==target) found=i;
 * Corrected snippet: if(v[i]==target && found==-1) found=i;
 * Explanation: Keep the first matching index when the target appears more than once.
 */
public class Issue18_find_a_requested_number { public static void main(String[] args) { int[] v=new int[]{8, -5, 4, 1, 6}; int target=4, found=-1; for(int i=0;i<v.length;i++) if(v[i]==target && found==-1) found=i; System.out.println("Index: "+found); } }
