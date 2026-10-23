/*
 * CORRECTION NOTES
 * Buggy snippet: && i>0
 * Corrected snippet: 
 * Explanation: The first character is also eligible to be counted.
 */
public class Issue70_character_frequency_search { public static void main(String[] args) { String s="traint", target="t"; int count=0; for(int i=0;i<s.length();i++) if(s.charAt(i)==target.charAt(0)) count++; System.out.println("Frequency: "+count); } }
