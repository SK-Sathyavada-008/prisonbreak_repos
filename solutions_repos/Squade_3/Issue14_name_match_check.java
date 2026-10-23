/*
 * CORRECTION NOTES
 * Buggy snippet: a==b
 * Corrected snippet: a.equals(b)
 * Explanation: Strings must be compared by content with equals().
 */
public class Issue14_name_match_check { public static void main(String[] args) { String a=new String("hostel"), b=new String("hostel"); if(a.equals(b) && a.length()>0 && a.charAt(0)!=' ') System.out.println("Same"); else System.out.println("Different"); } }
