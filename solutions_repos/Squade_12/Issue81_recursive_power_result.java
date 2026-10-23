/*
 * CORRECTION NOTES
 * Buggy snippet: if(e==1) return 1;
 * Corrected snippet: if(e==1) return b;
 * Explanation: The power with exponent one is the base.
 * Buggy snippet: return b*power(b,e-1)+1;
 * Corrected snippet: return b*power(b,e-1);
 * Explanation: Repeated multiplication must not add an extra one.
 */
public class Issue81_recursive_power_result { public static void main(String[] args) { System.out.println("Power: "+power(3,2)); } static int power(int b,int e) { if(e==0) return 1; if(e==1) return b; return b*power(b,e-1); } }
