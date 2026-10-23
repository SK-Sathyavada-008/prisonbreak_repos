/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<marks.length-1
 * Corrected snippet: for(int i=0;i<marks.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: (total-1)
 * Corrected snippet: total
 * Explanation: Do not subtract one from the total.
 * Buggy snippet: String status=avg>=35?"Pass":"Needs review";
 * Corrected snippet: boolean allPassed=true; for(int mark:marks) if(mark<35) allPassed=false; String status=allPassed?"Pass":"Needs review";
 * Explanation: A passing summary requires every individual mark to meet the pass mark; the average alone is not enough.
 */
public class Issue81_student_result_summary { public static void main(String[] args) { int[] marks=new int[]{15, 60, 65}; int total=0; for(int i=0;i<marks.length;i++) total+=marks[i]; int avg=total/marks.length; boolean allPassed=true; for(int mark:marks) if(mark<35) allPassed=false; String status=allPassed?"Pass":"Needs review"; System.out.println("Total: "+total); System.out.println("Average: "+avg); System.out.println("Status: "+status); } }
