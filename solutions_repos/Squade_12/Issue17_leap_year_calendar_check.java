/*
 * CORRECTION NOTES
 * Buggy snippet: year%4==0 && year%100!=0
 * Corrected snippet: (year%400==0 || (year%4==0 && year%100!=0))
 * Explanation: Leap years follow the Gregorian 4/100/400 rule.
 */
public class Issue17_leap_year_calendar_check { public static void main(String[] args) { int year=2000; if(year<1) System.out.println("Invalid year"); else if((year%400==0 || (year%4==0 && year%100!=0))) System.out.println("Leap year"); else System.out.println("Not a leap year"); } }
