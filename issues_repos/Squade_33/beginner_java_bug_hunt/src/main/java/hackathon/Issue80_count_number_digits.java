public class Issue80_count_number_digits { public static void main(String[] args) { int n=1137, count=0; while(n>0) { count++; n/=100; } System.out.println("Digits: "+(count+1)); } }
