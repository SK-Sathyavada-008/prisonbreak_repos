/*
 * CORRECTION NOTES
 * Buggy snippet: else System.out.println(a)
 * Corrected snippet: else System.out.println(b)
 * Explanation: The else branch must print the longer second name.
 */
public class Issue25_longer_name_selector { public static void main(String[] args) { String a="level", b="levelextra"; if(a.length()>b.length()) System.out.println(a); else System.out.println(b); } }
