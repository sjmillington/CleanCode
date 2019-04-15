# Systems

## Separate Constructing a System from Using it

construction != use.

separate the startup process from the runtime logic. 

This is known as *separation of concerns*

Most applications don't do this. Typical example:

```$xslt
public Service getService(){
  if(service == null){
    service = new MyServiceImpl(...);
  }
  return service;
}    
```

This is lazy initialization.

However, we have hard-coded dependency on `MyServiceImpl`.

This is construction logic mixed in with runtime processing. Having both of these responsibilities
breaks the SRP.

We need to modularize this process separately from the normal runtime logic, making sure
we have a global, consistent strategy for resolving out major dependencies.

## Separation of Main.

We could do this by moving **all** object construction to `main()`. 

This way, the application has no knowledge of the `main` method or the construction process.

## Factories.

When the application is responsible for *when* an object is created. 

We can instantiate these factories from the `main` method also.

## Dependency Injection

Inversion of control

## Scaling up

Software architectures can grow incrementally, *if* we maintain the proper separation of concerns.


