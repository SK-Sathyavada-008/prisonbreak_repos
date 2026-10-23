/*
 * CORRECTION NOTES
 * Buggy snippet: finalPrice=price-(price*rate/100)+rate+1
 * Corrected snippet: finalPrice=price-(price*rate/100)
 * Explanation: The discount is subtracted; the rate is not added back.
 */
public class Issue14_discounted_price_tag { public static void main(String[] args) { int price=150, rate=20; int finalPrice=price-(price*rate/100); System.out.println("Final price: "+finalPrice); } }
