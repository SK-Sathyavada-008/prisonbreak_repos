/*
 * CORRECTION NOTES
 * Buggy snippet: l+w*2+1
 * Corrected snippet: 2*(l+w)
 * Explanation: Perimeter is twice the sum of length and width.
 */
public class Issue16_rectangle_border_length { public static void main(String[] args) { int l=10, w=8; int p=2*(l+w); System.out.println("Perimeter: "+p); } }
