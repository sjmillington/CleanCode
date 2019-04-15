# Error Handling

*If error handling obscures logic, it is wrongly handled.*

## Use Exceptions Rather Than Return Codes

Return codes clutter the logic.

## Write Your `Try-Catch-Finally` Statement First

Exceptions in Java *define a scope*

In a way, `try` blocks are like transactions. Your `catch` and `finally` leave the program
in a consistent state, no matter what happens in the `try`.

Try to write tests that force exceptions, and then add behaviour to your handler to 
satisfy your tests.

## Use Unchecked Exceptions

Checked exceptions violate the Open/Closed principle.

*You must declare that exception in each level of a method that uses it*

This means that a change at the low level of the software can force signature changes on
many higher levels.

HIGH --> MED --> LOW LEVEL FUNCTION CALLS

All of the higher level calls must either handle the error or add the same `throws` to their
method signature.

## Provide Context with Exceptions

Create informative error messages and pass them along with your exceptions. 

## Define Exception Classes in Terms of a Caller's Needs.

i.e, when opening a port, we could list all of the possible errors:

```$xslt
ACME port = new ACMEPort(12);
try{
  port.open();
}catch(DeviceResponseException e){
 ..
}catch(ATM1212UnlockedException e){
 ..
}finally .... 
```

This leads to lots of duplication, we can use a wrapper to simplify this..

```$xslt
LocalPort port = new LocalPort(12);
try{
  port.open();
}catch(PortDeviceFailureException e){
 ..
}finally ....
```

Where `LocalPort` is just a wrapper class that catches all the individual exceptions

Wrapping like this can be very useful - in fact wrapping third party libraries is very useful.
We can switch libraries at any time with little penalty

## Define the Normal Flow

**Special Case Pattern.**

Rather than an exception, bake in the special case.

## Never return null

avoids all of the `if(x != null){` calls.

Throw an exception, or consider a special case object instead.

consider:

```$xslt
List<Employee> employees = getEmployees();
if(employees != null){
  for(Employee e : employees){
    totalPay += e.getPay();
  }  
}
```

If we make employees return an empty array by default instead:

```$xslt
List<Employee> employees = getEmployees();
for(Employee e : employees){
  totalPay += e.getPay();
}  

```

```$xslt
public List<Employee> getEmployees(){
  if(.. no employees ..){
    return Collections.emptyList();
  }
}    
```

## Never Pass Null

Returning null from a function is bad, but passing them in is worse.

In most programming languages, there is no good way to pass null. We could `assert` or
throw an `exception` when one is present - but this is a work around at best.

Best approach is to forbid passing null by default.

