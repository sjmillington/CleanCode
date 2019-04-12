# Functions

[code](src/main/java/com/sjmillington/functions)

### Small

Uncle bob recommends no more than 20 lines.

### Functions should only do ONE thing.

Ensure statements in the function are at the same level of abstraction.

ie. `getHtml()` is a much higher level of abstraction than `String pagePathName = PathParse.render(pagePath)`

### The stepdown rule

Want code to read like a top-down narrative.

FUNC 1 (HIGH LEVEL) **--CALLS-->**<br> FUNC 2 (MED-LEVEL) **--CALLS-->**<br> FUNC 3(LOW-LEVEL)

## Switch

Switches, by their nature do N things. It's hard to make a function do ONE thing with a switch.

[BAD EXAMPLE using switch/case](src/main/java/com/sjmillington/functions/Payroll.java)

The answer is to bury the switch in an abstract factory, and never expose it.

After, the `calculatePay()`, `isPayday()` etc functions will be dispatched through an 
employee interface.

General rule: use switches only once.  

[Better example](src/main/java/com/sjmillington/functions/better)

## Naming

make the naming descriptive and consistent

## Arguments

MAX 3 arguments to a function, but 3 should be avoided.

0, 1 or 2 is prefered

0. niladic function
1. monadic function
2. dyadic function
3. tryadic (etc...)


### Common monadic forms

**transformation functions** - one input in, transform, and out.  
**event** - (or consumer) - one input in, but no return

### Flag arguments

Ugly - don't pass just a boolean into an argument. This immediately mean that
the function does more than one thing.

`render(true)` is confusing. What happens with `render(false)` ? 

Instead, split the function:

`renderForSuite()` and `renderForSingleTest()`

### Dyadic functions

Some dyadic functions are appropriate: `Point p = new Point(0,0)`

Some are problematic, but necessary `assertEquals(expected, actual)`

There are ways to get around it.

Consider `writeField(output-stream, name)`

Could make writeField a method of `outputStream`: `outputStream.writeField(name)`

Or make the outputStream a variable of the current class so you don't need to pass it.

Or make a `FieldWriter` class that takes the `outputStream` in the constructor, with a method 
called `write`

### Triads

Not really recommended - think long and hard before creating.

## Argument Objects

When a function needs more than two or three args, consider wrapping these into a class 
of their own.

`Circle makeCircle(double x, double y, double radius)`
`Circle makeCirlce(Point center, double radius)`

## Argument Lists

If multiple arguments are the same type, use a list

`void monad(Integer... args)`
`void dyad(String name, Integer... args)`
`void triad(String name, int count, Integer... args)`

## Verbs/Keywords

always use verb/keyword pair `writeField`.
for dyads consider being descriptive

i.e instead of `assertEquals(expected, actual)` - `assertExpectedEqualsActual(expected, actual)`

## Have no side effects

Only mutate what the method describes.

## Output Arguments

avoid output arguments

i.e `appendFooter(s)` does this append `s` to the `footer` or the `footer` to `s`? i.e is `s` an input or output?

Need to look at the function signature 

`public void appendFooter(StringBuffer report)`

Would be better as a `Report` class

`report.appendFooter()`

**if your function must change the state of something, change the state of it's owning object**

## Command Query Separation

Functions should do something, or answer something - **NEVER BOTH**

i.e this is bad

`public boolean set(String attr, String value)`

`if(set("username", "unclebob)){...` huh?

instead split them

```$xslt
if(attributeExists("username")){
  setAttribute("username", "unclebob");
}
```

## Use Exceptions over returning error codes.

```$xslt
try{....} catch(Exception e){ .. }
```

### Extract try/catch blocks

try/catch blocks are ugly. mixing normal processing with error processing

Extract try and catch blocks into their own functions

```$xslt
public void delete(Page page){
  try{
    deletePageAndAllReference(page);
  }
  catch(Exception e){
    logError(e);
  } 
}   
```

`delete` function is only about error handling. Other logic is handled by `logError` 
and `deletePAgeAndAllReference`.

If `try` exists in a function, it should be the very first word.

### Avoid an error *dependency magnet*.

`public enum Error { OK ,INVALID...}`

as most classes will use this, it becomes a *dependency magnet*. When the `Error` class
changes, all other classes need to be recompiled and deployed. This puts negative pressure
on the `Error` class.

## KEEP IT DRY (Don't repeat yourself)

## Structured Programming

> Every function, and every block within a function should have one entry
> and one exit.

Basically, avoid large large functions with multiple exit points and `breaks, continues ` etc..


**The occasional `return, break, continue` does no harm.**

## How to write functions like this?

Refactoring.


Write unit test -> pass unit test -> refactor code.

## Conclusion

Every system is built from a language.

Functions are the verbs, classes are the nouns.

Never forget your real goal is to tell the story of the system. 









