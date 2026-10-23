/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<a.length()-1
 * Corrected snippet: for(int i=0;i<a.length()
 * Explanation: The loop skipped the final character.
 * Buggy snippet: words were compared position by position
 * Corrected snippet: compare the frequency of each character
 * Explanation: Anagrams contain the same character counts even when the letters are in a different order.
 */
public class Issue85_anagram_word_pair { public static void main(String[] args) { String a="book", b="bkoo"; boolean same=a.length()==b.length(); for(int i=0;i<a.length() && same;i++) { int ca=0, cb=0; for(int j=0;j<a.length();j++) { if(Character.toLowerCase(a.charAt(j))==Character.toLowerCase(a.charAt(i))) ca++; if(Character.toLowerCase(b.charAt(j))==Character.toLowerCase(a.charAt(i))) cb++; } if(ca!=cb) same=false; } System.out.println(same?"Anagram":"Not anagram"); } }