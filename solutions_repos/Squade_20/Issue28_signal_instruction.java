/*
 * CORRECTION NOTES
 * Buggy snippet: colour.equals("green")) System.out.println("Stop")
 * Corrected snippet: colour.equals("green")) System.out.println("Go")
 * Explanation: A green signal means go.
 */
public class Issue28_signal_instruction { public static void main(String[] args) { String colour="green"; if(colour.equals("green")) System.out.println("Go"); else if(colour.equals("yellow")) System.out.println("Ready"); else if(colour.equals("red")) System.out.println("Go"); else System.out.println("Invalid"); } }
