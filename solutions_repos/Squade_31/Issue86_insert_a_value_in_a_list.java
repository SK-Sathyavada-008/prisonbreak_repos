/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length;i++) result[i]=v[i]; result[pos]=value;
 * Corrected snippet: for(int i=0;i<pos;i++) result[i]=v[i]; result[pos]=value; for(int i=pos;i<v.length;i++) result[i+1]=v[i];
 * Explanation: Shift the original values right from the insertion position.
 */
public class Issue86_insert_a_value_in_a_list { public static void main(String[] args) { int[] v=new int[]{6, -4, 12, 10}; int pos=2, value=10; int[] result=new int[v.length+1]; for(int i=0;i<pos;i++) result[i]=v[i]; result[pos]=value; for(int i=pos;i<v.length;i++) result[i+1]=v[i]; for(int i=0;i<result.length;i++) System.out.print(result[i]+(i==result.length-1?"":" ")); } }
