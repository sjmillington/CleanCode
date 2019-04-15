# Classes

## Class Organization

Java convention, in order:

- public static constants
- private static variables
- private instance variables
- public functions
- private functions used by public functions at the bottom.

## Encapsulation

Sometimes, it's okay to make a private function protected so it can be accessed by tests.
But this is a last resort! Look to maintain privacy first

## Classes should be small!

Classes should be measured in responsibilities, not lines.

The more ambiguous the name, the more responsibilities it likely has. 

Should be able to describe the class in under 25 words, without using `if`,`and`,`or` 
or `but`.

## Single Responsibility Principle (SRP)

Classes should only have reason to change.

Many developers fear lots of small classes - however **a system with many small classes
has no more moing parts than a system with a few large classes.**

## Cohesion

Classes should have a small number of instance variables.

Each of the methods of a class should manipulate one or more of those variables.

The more variables a method mutates, the more cohesive the method is.

A class where every variable is mutated by each method is maximally cohesive.

**It is not advisable to make classes maximally cohesive**

**On the other hand, cohesion can be high - methods and variables hang together
as a logical whole**

If cohesion is low, we may need to refactor into more classes.

## Maintaining Cohesion Results in Many Small Classes

If a few functions want to share certain variables, that makes them a class in their own right


## Organizing for Change

In a clean system, we organize classes so as to reduce the risk of change. 

Subclassing is a good way of splitting many functions, such as sql statements.

instead of 

```$xslt
public String create();
public String insert(Object[] fields);
```

try:

```$xslt
public class CreateSql extends Sql{
  public CreateSql(...)
  @Override public String generate();
}  
```

This allows us to create more Sql-like queries without changing the code. O/C principle.

## Isolating from Change

Concrete classes - implementation
Abstract classes - represent concepts only.

Dependencies should be abstract classes or interfaces only - never concrete classes.







