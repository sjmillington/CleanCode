# Boundaries

## Third-Party Code

Third party APIs often provide more functionality than we need.

i.e if we want to use the `Map` interface and hand it around to different clients
, but don't want clients to be able to `clear()` entries. 

If we just pass around a `Map<Sensor>`, we'll have lots of places to fix if the 
interface ever changes.

It's better to hide the details of the `Map` usage..

```$xslt
public class Sensors{

  private Map sensors = new HashMap();
  
  public Sensor getById(String id){
    return (Sensor) sensors.get(id);
  }

  ...
}
```

This way, if the interface of map changes, we only need to change it in one place.
Also, the ability to clear entries is removed.

If using a boundary interface, such as `Map`, keep it inside the class, or close to the
family of classes for which it is used.

Avoid returning it from, or accepting as an argument to.

## Exploring and Learning Boundaries.

When using third-party code, it's a good idea to write some unit tests to explore how
it works. Jim Newkirk calls them *learning tests*.

Call the API as we'd expect to do in our application.

## Learning Tests Are Better Than Free

Learning tests cost nothing - we have to learn a new API anyway. Unit tests are an isolated
way to get that knowledge.

If the API changes, we can re-run it to see if there are any changes to the logic.

Whether learning or not, *boundary tests* can ease the migration of the code.

## Using Code That Does Not Exist Yet

This is another kind of boundary. 

Can create a dummy interface to work with. Adapters can be used to bridge the gap 
once the code is known.




