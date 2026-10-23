/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=1;i<v.length;i+=2)
 * Corrected snippet: for(int i=0;i<v.length;i+=2)
 * Explanation: The requested positions correspond to zero-based indices 0, 2, 4.
 */
public class Issue07_even_position_total { public static void main(String[] args) { int[] v=new int[]{8, -11, 12, 7, 14}; int sum=0; for(int i=0;i<v.length;i+=2) sum+=v[i];  System.out.println("Position total: "+sum); } }
