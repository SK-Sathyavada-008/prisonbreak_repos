/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: shift stopped before the final source value
 * Corrected snippet: shift every following value one place left
 * Explanation: Removing an element requires copying all later values left.
 */
public class Issue91_remove_a_matching_value { public static void main(String[] args) { int[] v=new int[]{3, 5, 7, 9}; int target=5, pos=-1; for(int i=0;i<v.length;i++) if(v[i]==target) pos=i; if(pos>=0) for(int i=pos;i<v.length-1;i++) v[i]=v[i+1]; if(pos>=0) for(int i=0;i<v.length-1;i++) System.out.print(v[i]+(i==v.length-2?"":" ")); else for(int i=0;i<v.length;i++) System.out.print(v[i]+(i==v.length-1?"":" ")); } }