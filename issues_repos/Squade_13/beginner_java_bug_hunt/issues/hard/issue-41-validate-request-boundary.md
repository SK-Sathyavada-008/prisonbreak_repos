# Issue #41: Warehouse Stock Tracker: Reject a zero-quantity dispatch request

**Difficulty:** Hard  
**Scenario:** Warehouse Stock Tracker: Reject a zero-quantity dispatch request. The supplied example uses fixed values so the participant can focus on the behaviour of this one operation.  
**Topic:** logical errors, conditions, loops, arrays, strings, classes/objects, constructors, and methods  
**Starter file:** `src/main/java/hackathon/Issue41_WarehouseGoodsValidation.java`

## Scenario brief
Warehouse Stock Tracker: Reject a zero-quantity dispatch request. The supplied example uses fixed values so the participant can focus on the behaviour of this one operation.. This is a small, isolated exercise; keep the solution within beginner Java and do not add collections or external libraries.

## Task
The warehouse stock tracker accepts a request for 0 item units even though a request must be at least 1 and no more than the available quantity. For the supplied request (0 requested, 5 available), reject it.

## Expected output
The program should produce exactly:

```text
Request rejected
```

## Done when
- [ ] The program produces the expected output.
- [ ] The supplied scenario and test values are preserved.
- [ ] You test one additional sensible boundary case.
- [ ] Your pull request explains the behaviour changed and how you tested it.
