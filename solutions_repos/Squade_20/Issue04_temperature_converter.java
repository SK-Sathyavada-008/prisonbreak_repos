/*
 * CORRECTION NOTES
 * Buggy snippet: +30
 * Corrected snippet: +32
 * Explanation: Fahrenheit conversion uses the offset 32.
 * Buggy snippet: int fahrenheit=(celsius*9/5)+32;
 * Corrected snippet: int fahrenheit=(int)Math.round(celsius*9.0/5+32);
 * Explanation: Round the exact Celsius-to-Fahrenheit result to the nearest whole degree.
 */
public class Issue04_temperature_converter { public static void main(String[] args) { int celsius=28; int fahrenheit=(int)Math.round(celsius*9.0/5+32); System.out.println("Fahrenheit: "+fahrenheit); } }
