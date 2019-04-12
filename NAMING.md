# Meaningful Names

[code](src/main/java/com/sjmillington/naming)

### Use intention-revealing names

`elapsedTimeInDays` rather than `time`

### Avoid disinformation

Don't use datastructure names 

`accountsGroup` rather than `accountsList` unless it's actually a list.

### Avoid using names that vary slightly

i.e `XYZControllerForEfficientHandlingOfStrings` and `XYZControllerForEfficientStorageOfStrings`

### Avoid number series naming

`a1, a2, a3... aN`

### Avoid Noise words to create differences

`a, an, the, Info, Data`

`aZork ` because `zork` is taken.

never use `variable`

examples of violations:

`moneyAmount` and `money`
`customerInfo` and `customer`
`nameString` and `name`

### Use pronounceable names

`generationTimeStamp` and **NOT** `gentmstmp`

### Use searchable names

makes it easier to find variables

`MAX_CLASSES_PER_STUDENT` will only return one result whereas `e` will return many.

### Avoid encodings

#### Avoid member prefixes 

`AccountSettings mAccountSettings` !!

#### Interfaces/Implementations

`ShapeFactory` for the interface, `ShapeFactoryImpl` for impl

### Avoid mental mapping

Readers shouldn't have to translate your names.

Avoid single letter variable names, *except for loops.*

## Class Names

Should always be a noun. 

`Customer, Account, WikiPage`

Avoid words like

`Manager, Processor, Data` - should not be a verb

## Method names

Should always be a verb or verb phrase

`run, deletePage, postPayment`

accessors, muttors and predicatates should be 

`get, set, is`

When constructors are overloaded, should use static factory methods

i.e

`Complex fulcrumPoint = Complex.FromRealNumber(23.0)`

rather than

`Complex fulcrumPoint = new Complex(23.0)`

Consider making their corresponding constructors private.

Don't use colloquialisms or slang. Not everyone will understand the meaning

## Pick one word per concept

AND STICK WITH IT!

i.e when getting something, dont use `fetch, retrieve` and `get` in the same scope.

or `Manager` and `Controller`

`DeviceManger, DeviceController`

## NO PUNS

## Use solution domain names

Freely use algorithm names, pattern names, CS terms, math terms in the code used to solve the problem

`AccountVisitor` immediately points to the visitor pattern being used.

**Be technical**

## Use problem domain names

When there are no technical terms, use names from the problem.

## Add meaningful context

`firstName, lastName, street` are address variables, but state could be confusing.

prefixes could be used `addrFirstName, addrState`..





 

 

