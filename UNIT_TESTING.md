# Unit Tests

## The Three Laws of TDD

1. You may not write production code until you have written a failing unit test.
2. You may not write more of a unit test than is sufficient to fail - not compiling *is* failing
3. You may not write more production code than is sufficient to pass the currently failing test.

## Keeping Tests Clean

Dirty tests are equivalent to - or worse than - no tests.

Tests must change as the production code evolves. The dirtier tests are, the harder they
are to change. 

**Test code is just as important as production code.**

## Test Enable the -ilities

It is unit tests that keep code flexible, maintainable and reusable. If you have tests,
you're not scared of changing the code.

## Clean Tests

What makes a test clean? **Readability**.

What makes them readable? **Clarity, Simpliciy and density of expression**

Make use of the BDD *Given, When, Then* format. Also called Build-Operate-Check.

## Domain-Specific Testing Language.

Build up a set of functions and utilities that make the tests easier to read. 

Such as `assertResponseIsXML()`

The testing API is not designed up front, but evolves over time by refactoring.

## A Dual Standard

When setting up a unit test, consider splitting the setup into an initial function call.

Rather than:

```
@Test...
hw.setTemp(WAY_TOO_COLD);
controller.tic();
assertTrue(....)
assertTrue(...)
assertFalse(...)
```

split the logic to make it more readable.

```$xslt
@Test..
wayTooCold();
assertEquals("HBchL", hw.getState());
```

This hid the `tic` function, and concatenated the states together in an efficient way.

The HBchL seems to violate the rule about mental mapping though....

This is the nature of dual standard. Things than are no appropriate in production may
be appropriate in tests.

Usuaully they involve issues of memory or CPU efficiency. Where production has constraints
but test env does not.

## One Assert per Test

Most of the time...

## Single Concept per Test

Don't confuse concepts..

## F.I.R.S.T

Tests should be:

- Fast - no slow tests
- Independent - should not depend on each other
- Repeatable - repeatable in any environment
- Self-Validating - should have boolean output, they either pass or fail.
- Timely - should be written just before the production code that makes them pass.


