/*
 * CORRECTION NOTES
 * Buggy snippet: return a+b;
 * Corrected snippet: return a*b;
 * Explanation: Rectangle area is length multiplied by width.
 * Buggy snippet: return a*a+1;
 * Corrected snippet: return a*a;
 * Explanation: Square area is side multiplied by itself.
 */
public class Issue76_overloaded_area_calculator { public static void main(String[] args) { System.out.println("Rectangle: "+area(8,8)); System.out.println("Square: "+area(14)); } static int area(int a,int b) { return a*b; } static int area(int a) { return a*a; } }
