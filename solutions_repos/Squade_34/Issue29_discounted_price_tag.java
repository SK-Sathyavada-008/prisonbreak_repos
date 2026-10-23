/*
 * CORRECTION NOTES
 * Buggy snippet: finalPrice=price-(price*rate/100)+rate+1
 * Corrected snippet: finalPrice=price-(price*rate/100)
 * Explanation: The discount is subtracted; the rate is not added back.
 */
public class Issue29_discounted_price_tag { public static void main(String[] args) { int price=130, rate=5; int finalPrice=price-(price*rate/100); System.out.println("Final price: "+finalPrice); } }
