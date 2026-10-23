/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: v[i]%2==0
 * Corrected snippet: v[i]%2!=0
 * Explanation: Odd values have a non-zero remainder when divided by two.
 * Buggy snippet: incomplete odd-count loop
 * Corrected snippet: count each odd value and print once
 * Explanation: The loop must increment the counter for odd values and print after the loop.
 */
public class Issue10_odd_entry_counter { public static void main(String[] args) { int[] v=new int[]{1, 2, 4, 6, 9}; int count=0; for(int n:v) if(n%2!=0) count++; System.out.println("Odd count: "+count); } }