# Issue #64: Write `isValidTransferRequest` for Wallet System with Transfers and Refunds

**Difficulty:** Very Hard  
**Scenario:** Wallet System with Transfers and Refunds: Return true only when the requested amount is at least 1 and does not exceed the available amount.  
**Topic:** method-writing with variables, conditions, loops, arrays, strings, and basic classes  
**Starter file:** `src/main/java/hackathon/Issue64_VH20_WalletSystemWithTransfersAndRefunds.java`

## Scenario brief
Wallet System with Transfers and Refunds: Return true only when the requested amount is at least 1 and does not exceed the available amount.. This is a small, isolated exercise; keep the solution within beginner Java and do not add collections or external libraries.

## Task
The starter calls `isValidTransferRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.

## Expected output
The program should produce exactly:

```text
Transfer request valid: true
```

**Required method signature:** `static boolean isValidTransferRequest(int requested, int available)`

## Done when
- [ ] The program produces the expected output.
- [ ] The supplied scenario and test values are preserved.
- [ ] You test one additional sensible boundary case.
- [ ] Your pull request explains the behaviour changed and how you tested it.
