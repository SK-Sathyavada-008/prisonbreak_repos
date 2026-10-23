/*
 * CORRECTION NOTES
 * Buggy snippet: (count-1)
 * Corrected snippet: (count+1)
 * Explanation: Word count is one more than the spaces in a non-empty single-spaced line.
 * Buggy snippet: word count used the wrong space adjustment
 * Corrected snippet: words = spaces + 1 for non-empty text
 * Explanation: A non-empty line separated by single spaces has one more word than spaces.
 */
public class Issue69_count_words_in_a_line { public static void main(String[] args) { String s="book koob java"; int spaces=0; for(int i=0;i<s.length();i++) if(s.charAt(i)==' ') spaces++; int words=s.length()==0?0:spaces+1; System.out.println("Words: "+words); } }