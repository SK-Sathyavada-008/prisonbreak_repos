/*
 * CORRECTION NOTES
 * Buggy snippet: static int count=1;
 * Corrected snippet: static int count=0;
 * Explanation: The counter starts at zero before any objects are created.
 * Buggy snippet: Counter() { count++; count++; }
 * Corrected snippet: Counter() { count++; }
 * Explanation: Each object should increment the static counter exactly once.
 */
public class Issue65_static_visit_counter { public static void main(String[] args) { Counter a=new Counter(); Counter b=new Counter(); Counter c=new Counter(); System.out.println("Created: "+Counter.count); } static class Counter { static int count=0; Counter() { count++; } } }
