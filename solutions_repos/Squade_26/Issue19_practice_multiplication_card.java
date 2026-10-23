/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=1;i<5
 * Corrected snippet: for(int i=1;i<5+1
 * Explanation: The loop omitted the final multiplication row.
 * Buggy snippet: (n*i+1)
 * Corrected snippet: (n*i)
 * Explanation: The product must not include an extra one.
 */
public class Issue19_practice_multiplication_card { public static void main(String[] args) { int n=4; for(int i=1;i<5+1;i++) System.out.println(n+" x "+i+" = "+(n*i)); } }
