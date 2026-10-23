/*
 * CORRECTION NOTES
 * Buggy snippet: i<v.length-1
 * Corrected snippet: i<v.length
 * Explanation: The product must include every item in the array.
 */
public class Issue10_product_pack_calculator { public static void main(String[] args) { int[] v=new int[]{4, 2, 11}; int product=1; for(int i=0;i<v.length;i++) product*=v[i]; System.out.println("Product: "+product); } }
