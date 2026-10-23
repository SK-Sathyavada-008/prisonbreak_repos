/*
 * SOLUTION NOTES
 * Scenario: Even Item Total — A Computer Lab #03
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a computer lab, the program is used for a short beginner exercise. Make it follow the stated rule for the supplied values. Keep the solution within basic Java syntax, variables, conditions, loops, arrays, strings, and simple methods.
 * Expected sample output:
 * Even sum: 2
 */
public class Issue24_even_item_total { public static void main(String[] args) { int[] v=new int[]{2, -7, 13, 9, 0}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
