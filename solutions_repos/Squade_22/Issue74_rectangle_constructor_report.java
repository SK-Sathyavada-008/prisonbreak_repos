/*
 * CORRECTION NOTES
 * Buggy snippet: width=w+1;
 * Corrected snippet: width=w;
 * Explanation: Store the supplied width unchanged.
 * Buggy snippet: area=l+w;
 * Corrected snippet: area=l*w;
 * Explanation: Rectangle area is length multiplied by width.
 */
public class Issue74_rectangle_constructor_report { public static void main(String[] args) { Rectangle r=new Rectangle(11,6); System.out.println("Area: "+r.area); } static class Rectangle { int length,width,area; Rectangle(int l,int w) { length=l; width=w; area=l*w; } } }
