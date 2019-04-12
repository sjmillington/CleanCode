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
  double getPerfectFuelRemaining();
}
``` 

The second does not expose the details of the data, rather it expresses it in abstract
terms. The fuel can be in litres or gallons - it doesn't matter.

The worst option is to blindly add getters - think about how to expose the data.

## Data/Object Anti-Symmetry

- Objects - hide their data behind abstractions and expose functions to operate on the data.
- Data structures - expose their data and offer no meaningful functions.



