/*
 * CORRECTION NOTES
 * Buggy snippet: m>90
 * Corrected snippet: m>=90
 * Explanation: The top grade boundary includes 90.
 * Buggy snippet: m>75
 * Corrected snippet: m>=75
 * Explanation: The grade boundary is inclusive.
 */
public class Issue95_grade_boundary_review { public static void main(String[] args) { int m=90; String g; if(m>=90) g="A"; else if(m>=75) g="B"; else if(m>=60) g="C"; else if(m>=40) g="D"; else g="F"; System.out.println(g); } }
