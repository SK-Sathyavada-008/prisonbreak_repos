/*
 * CORRECTION NOTES
 * Buggy snippet: salary=s-1;
 * Corrected snippet: salary=s;
 * Explanation: Store the supplied salary without changing it.
 * Buggy snippet: return salary-salary/10;
 * Corrected snippet: return salary+salary/10;
 * Explanation: A ten-percent pay addition increases salary.
 */
public class Issue84_employee_pay_object { public static void main(String[] args) { Employee e=new Employee("Ravi",2400); System.out.println("Name: "+e.name); System.out.println("Pay: "+e.pay()); } static class Employee { String name; int salary; Employee(String n,int s) { name=n; salary=s; } int pay() { return salary+salary/10; } } }
