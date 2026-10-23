/*
 * CORRECTION NOTES
 * Buggy snippet: void deposit(int n) { balance-=n; }
 * Corrected snippet: void deposit(int n) { balance+=n; }
 * Explanation: Deposits increase the account balance.
 * Buggy snippet: balance-=n+1;
 * Corrected snippet: balance-=n;
 * Explanation: Withdraw exactly the requested amount.
 */
public class Issue72_bank_balance_update { public static void main(String[] args) { Account a=new Account(550); a.deposit(57); a.withdraw(31); System.out.println("Balance: "+a.balance); } static class Account { int balance; Account(int b) { balance=b; } void deposit(int n) { balance+=n; } void withdraw(int n) { balance-=n; } } }
