/*
 * CORRECTION NOTES
 * Buggy snippet: if(a>b) return b-1; return a;
 * Corrected snippet: return (a>b) ? a : b;
 * Explanation: The method must return the larger argument.
 */
public class Issue12_method_finds_the_leader { public static void main(String[] args) { System.out.println("Maximum: "+largest(2,9)); } static int largest(int a,int b) { return (a>b) ? a : b; } }
