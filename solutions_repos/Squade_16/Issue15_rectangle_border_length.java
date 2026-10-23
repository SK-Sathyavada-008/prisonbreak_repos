/*
 * CORRECTION NOTES
 * Buggy snippet: l+w*2+1
 * Corrected snippet: 2*(l+w)
 * Explanation: Perimeter is twice the sum of length and width.
 */
public class Issue15_rectangle_border_length { public static void main(String[] args) { int l=11, w=10; int p=2*(l+w); System.out.println("Perimeter: "+p); } }
