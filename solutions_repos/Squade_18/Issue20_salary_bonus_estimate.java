/*
 * CORRECTION NOTES
 * Buggy snippet: (salary*bonus/100+1)
 * Corrected snippet: (salary*bonus/100)
 * Explanation: Do not add an extra one to the calculated bonus.
 * Buggy snippet: salary<1500?15:10
 * Corrected snippet: salary<1500?10:15
 * Explanation: The lower salary band receives the lower bonus percentage.
 */
public class Issue20_salary_bonus_estimate { public static void main(String[] args) { int salary=1500; int bonus=salary<1500?10:15; System.out.println("Bonus: "+(salary*bonus/100)); } }
