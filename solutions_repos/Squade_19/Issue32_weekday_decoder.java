/*
 * CORRECTION NOTES
 * Buggy snippet: case 1: System.out.println("Tuesday")
 * Corrected snippet: case 1: System.out.println("Monday")
 * Explanation: The weekday labels were swapped.
 * Buggy snippet: case 2: System.out.println("Monday")
 * Corrected snippet: case 2: System.out.println("Tuesday")
 * Explanation: The weekday labels were swapped.
 */
public class Issue32_weekday_decoder { public static void main(String[] args) { int day=1; switch(day) { case 1: System.out.println("Monday"); break; case 2: System.out.println("Tuesday"); break; case 3: System.out.println("Wednesday"); break; case 4: System.out.println("Thursday"); break; case 5: System.out.println("Friday"); break; case 6: System.out.println("Saturday"); break; case 7: System.out.println("Sunday"); break; default: System.out.println("Invalid day"); } } }
