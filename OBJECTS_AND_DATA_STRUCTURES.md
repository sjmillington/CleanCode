# Objects and Data Structures

## Data Abstraction

Hiding implementations is about abstractions. A class does not simply push it's variables
through getters and setters, but rather *exposes* abstract interfaces that allow users to manipulate
the essence of the data. 

consider: 

```$xslt
//concrete example
public interface Vehicle{
  double getFuelTankCapacityInGallons();
  double getGallonsOfGasoline();
}  
```

```$xslt
//abstract example
public interface Vehicle{
  double getPercentFuelRemaining();
}
``` 

The second does not expose the details of the data, rather it expresses it in abstract
terms. The fuel can be in litres or gallons - it doesn't matter.

The worst option is to blindly add getters - think about how to expose the data.

## Data/Object Anti-Symmetry

- Objects - hide their data behind abstractions and expose functions to operate on the data.
- Data structures - expose their data and offer no meaningful functions.

If we use a procedural method (everything is a data structure), when we add a new data 
structure, all of the functions have to change. If we use OOP, when we add new functions
to a base class, we have to implement them for every implementing object.

Knowing when to use data structures and objects is important. **Don't always just create
objects blindly**

If we're more likely to add new types - use [OOP](src/main/java/com/sjmillington/objects/polymorphic).  
If we're more likely to add new functions - use [data structs](src/main/java/com/sjmillington/objects/procedural)

## The law of demeter

A module should not know about the innards of the *objects* it manipulates.

more precisely, a method *f* of a class *C* should only call the methods of:

1. *C*
2. An object created by *f*
3. An object passed as an arg to *f*
4. An object held in an instance variable of *C*

The method should not invoke methods on objects returned by any of the allowed functions.

i.e this is bad.

`final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath()`

this is also called a **train wreck**, because it looks like coupled trains.

It's better to split the calls:

```
Options opts = ctxt.getOptions();
File scratchDir = opts.getScratchDir();
final String outputDir = scratchDir.getAbsolutePath();
```

This could also be a violation of demeter, if `ctxt, options and scratchDir` are objects.
If they are objects, their internal structs should be abstracted

## Hybrids

Try to avoid half-objects and half-data structures.

## Hiding Structure

To avoid violation, if `ctxt` is an Object, we could expose a meaningful method.

`final String outputDir = ctxt.getAbsolutePathOfScratchDirectoryOption()` 

but this would end up with a LOT of methods.

To solve:

Find the purpose of getting the `outputDir` and use that information.

`BufferedOutputStream bos = ctxt.createScratchFileStream(classFileName)`

## Data Transfer Objects(DTO) (Or POJO)

An object with private variables, and getters, but no setters. 

## Active records

A type of DTO with typical navigation methods like `save` and `find`

These should be treated as data structures and have no business logic inside.





