/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<s.length()-1
 * Corrected snippet: for(int i=0;i<s.length()
 * Explanation: The loop skipped the final character.
 * Buggy snippet: count+=2;
 * Corrected snippet: 
 * Explanation: Count each vowel once rather than adding a fixed extra amount.
 */
public class Issue26_vowel_counter { public static void main(String[] args) { String s="hello"; int count=0; for(int i=0;i<s.length();i++) { char ch=s.charAt(i); if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') count++; }  System.out.println("Vowels: "+count); } }
