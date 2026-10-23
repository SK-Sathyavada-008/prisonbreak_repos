/*
 * CORRECTION NOTES
 * Buggy snippet: && i>0
 * Corrected snippet: 
 * Explanation: The first character is a valid occurrence.
 * Buggy snippet: first matching character was skipped
 * Corrected snippet: count every matching character
 * Explanation: Every matching position, including index zero, must be counted.
 */
public class Issue05_letter_occurrence_counter { public static void main(String[] args) { String s="javaj", target="j"; int count=0; for(int i=0;i<s.length();i++) if(s.charAt(i)==target.charAt(0)) count++; System.out.println("Frequency: "+count); } }