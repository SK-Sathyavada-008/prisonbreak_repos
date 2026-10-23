/*
 * CORRECTION NOTES
 * Buggy snippet: a+b<c
 * Corrected snippet: a+b<=c
 * Explanation: Triangle sides must satisfy a strict triangle inequality.
 * Buggy snippet: a+c<b
 * Corrected snippet: a+c<=b
 * Explanation: Triangle sides must satisfy a strict triangle inequality.
 * Buggy snippet: b+c<a
 * Corrected snippet: b+c<=a
 * Explanation: Triangle sides must satisfy a strict triangle inequality.
 * Buggy snippet: a==b || a==c)
 * Corrected snippet: a==b || a==c || b==c)
 * Explanation: Any two equal sides make an isosceles triangle.
 */
public class Issue01_triangle_category { public static void main(String[] args) { int a=3, b=4, c=4; if(a<=0 || b<=0 || c<=0 || a+b<=c || a+c<=b || b+c<=a) System.out.println("Invalid"); else if(a==b && b==c) System.out.println("Equilateral"); else if(a==b || a==c || b==c) System.out.println("Isosceles"); else System.out.println("Scalene"); } }
