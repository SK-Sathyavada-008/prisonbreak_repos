/*
 * CORRECTION NOTES
 * Buggy snippet: ?"Odd":"Even"
 * Corrected snippet: ? "Even" : "Odd"
 * Explanation: The even and odd labels were reversed.
 * Buggy snippet: if(n==0) result="Odd";
 * Corrected snippet: 
 * Explanation: Zero is even; the special case was incorrect.
 */
public class Issue15_even_or_odd_check { public static void main(String[] args) { int n=10; String result=(n%2==0)? "Even" : "Odd";  System.out.println("Result: "+result); } }
