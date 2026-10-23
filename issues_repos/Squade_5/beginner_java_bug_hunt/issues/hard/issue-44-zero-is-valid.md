# Issue #44: ATM Transaction Simulator: Accept a zero transaction amount adjustment

**Difficulty:** Hard  
**Scenario:** ATM Transaction Simulator: Accept a zero transaction amount adjustment. The supplied example uses fixed values so the participant can focus on the behaviour of this one operation.  
**Topic:** logical errors, conditions, loops, arrays, strings, classes/objects, constructors, and methods  
**Starter file:** `src/main/java/hackathon/Issue44_ATMAccountNonNegative.java`

## Scenario brief
ATM Transaction Simulator: Accept a zero transaction amount adjustment. The supplied example uses fixed values so the participant can focus on the behaviour of this one operation.. This is a small, isolated exercise; keep the solution within beginner Java and do not add collections or external libraries.

## Task
The atm transaction simulator allows a zero-valued transaction amount adjustment, for example when no additional charge is due. The current validation rejects 0. Keep negative values invalid while accepting zero.

## Expected output
The program should produce exactly:

```text
Value accepted
```

## Done when
- [ ] The program produces the expected output.
- [ ] The supplied scenario and test values are preserved.
- [ ] You test one additional sensible boundary case.
- [ ] Your pull request explains the behaviour changed and how you tested it.
