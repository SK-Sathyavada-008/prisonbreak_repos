public class Issue15_salary_bonus_estimate { public static void main(String[] args) { int salary=2000; int bonus=salary<1500?15:10; System.out.println("Bonus: "+(salary*bonus/100+1)); } }
