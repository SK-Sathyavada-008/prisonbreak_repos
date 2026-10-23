/*
 * CORRECTION NOTES
 * Buggy snippet: i<=s.length()/2
 * Corrected snippet: i<s.length()/2
 * Explanation: Compare each mirrored pair only once.
 * Buggy snippet: s.charAt(s.length()-i)
 * Corrected snippet: s.charAt(s.length()-1-i)
 * Explanation: The mirrored index is length minus one minus i.
 */
public class Issue76_palindrome_word_test { public static void main(String[] args) { String s="kayak"; boolean ok=true; for(int i=0;i<s.length()/2;i++) if(s.charAt(i)!=s.charAt(s.length()-1-i)) ok=false; System.out.println(ok?"Palindrome":"Not palindrome"); } }
