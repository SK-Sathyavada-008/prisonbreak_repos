/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<s.length()-1
 * Corrected snippet: for(int i=0;i<s.length()
 * Explanation: The loop skipped the final character.
 */
public class Issue16_uppercase_letter_counter { public static void main(String[] args) { String s="Train"; int count=0; for(int i=0;i<s.length();i++) if(s.charAt(i)>='A' && s.charAt(i)<='Z') count++;  System.out.println("Uppercase: "+count); } }
