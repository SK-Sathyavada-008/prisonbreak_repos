/*
 * CORRECTION NOTES
 * Buggy snippet: marks>90
 * Corrected snippet: marks>=90
 * Explanation: The top grade boundary includes 90.
 * Buggy snippet: marks>75
 * Corrected snippet: marks>=75
 * Explanation: The grade boundary is inclusive.
 */
public class Issue18_exam_grade_label { public static void main(String[] args) { int marks=90; String grade; if(marks>=90) grade="A"; else if(marks>=75) grade="B"; else if(marks>=60) grade="C"; else if(marks>=40) grade="D"; else grade="F"; System.out.println("Grade: "+grade); } }
