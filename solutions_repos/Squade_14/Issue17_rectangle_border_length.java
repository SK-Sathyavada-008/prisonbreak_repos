/*
 * CORRECTION NOTES
 * Buggy snippet: l+w*2+1
 * Corrected snippet: 2*(l+w)
 * Explanation: Perimeter is twice the sum of length and width.
 */
public class Issue17_rectangle_border_length { public static void main(String[] args) { int l=9, w=6; int p=2*(l+w); System.out.println("Perimeter: "+p); } }
