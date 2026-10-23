/*
 * CORRECTION NOTES
 * Buggy snippet: if(n%3==0) System.out.println("Fizz"); else if(n%5==0) System.out.println("Fizz"); else if(n%15==0) System.out.println("FizzBuzz");
 * Corrected snippet: if(n%15==0) System.out.println("FizzBuzz"); else if(n%3==0) System.out.println("Fizz"); else if(n%5==0) System.out.println("Buzz");
 * Explanation: Check divisibility by 15 before 3 or 5.
 */
public class Issue94_fizz_buzz_practice_run { public static void main(String[] args) { int n=15; if(n%15==0) System.out.println("FizzBuzz"); else if(n%3==0) System.out.println("Fizz"); else if(n%5==0) System.out.println("Buzz"); else System.out.println(n); } }
