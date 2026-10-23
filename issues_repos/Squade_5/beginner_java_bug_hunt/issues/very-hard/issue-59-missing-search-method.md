# Issue #59: Write `calculateRemainingDispatchLimit` for Warehouse with Purchase and Dispatch Orders

**Difficulty:** Very Hard  
**Scenario:** Warehouse with Purchase and Dispatch Orders: Calculate how many dispatch limit remain after the occupied amount is deducted from the total capacity.  
**Topic:** method-writing with variables, conditions, loops, arrays, strings, and basic classes  
**Starter file:** `src/main/java/hackathon/Issue59_VH10_WarehouseWithPurchaseAndDispatchOrders.java`

## Scenario brief
Warehouse with Purchase and Dispatch Orders: Calculate how many dispatch limit remain after the occupied amount is deducted from the total capacity.. This is a small, isolated exercise; keep the solution within beginner Java and do not add collections or external libraries.

## Task
The starter calls `calculateRemainingDispatchLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many dispatch limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.

## Expected output
The program should produce exactly:

```text
Remaining Dispatch limit: 5
```

**Required method signature:** `static int calculateRemainingDispatchLimit(int capacity, int occupied)`

## Done when
- [ ] The program produces the expected output.
- [ ] The supplied scenario and test values are preserved.
- [ ] You test one additional sensible boundary case.
- [ ] Your pull request explains the behaviour changed and how you tested it.
