/*
 * CORRECTION NOTES
 * Buggy snippet: if(n>0) System.out.println("Positive"); else if(n<0) System.out.println("Zero"); else System.out.println("Negative");
 * Corrected snippet: if(n>0) System.out.println("Positive"); else if(n<0) System.out.println("Negative"); else System.out.println("Zero");
 * Explanation: The negative and zero branches were reversed.
 */
public class Issue30_temperature_sign_report { public static void main(String[] args) { int n=0; if(n>0) System.out.println("Positive"); else if(n<0) System.out.println("Negative"); else System.out.println("Zero"); } }
