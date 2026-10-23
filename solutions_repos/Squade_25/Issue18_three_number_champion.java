/*
 * CORRECTION NOTES
 * Buggy snippet: if(z<largest) largest=z;
 * Corrected snippet: if(z>largest) largest=z;
 * Explanation: The maximum comparison used the wrong direction.
 * Buggy snippet: if(y==z) largest=y-1;
 * Corrected snippet: 
 * Explanation: A tie must not lower the maximum.
 */
public class Issue18_three_number_champion { public static void main(String[] args) { int x=6, y=8, z=15; int largest=x; if(y>largest) largest=y; if(z>largest) largest=z;  System.out.println("Largest: "+largest); } }
