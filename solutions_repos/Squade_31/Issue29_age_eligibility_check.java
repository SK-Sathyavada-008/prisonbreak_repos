/*
 * CORRECTION NOTES
 * Buggy snippet: age>18
 * Corrected snippet: age>=18
 * Explanation: The minimum eligible age is inclusive.
 */
public class Issue29_age_eligibility_check { public static void main(String[] args) { int age=18; if(age>120) System.out.println("Invalid age"); else if(age>=18) System.out.println("Eligible"); else System.out.println("Not eligible"); } }
