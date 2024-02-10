This principle states that subtypes must be substitutable for their base types. 

If a program is using a base class, it should be able to use any of its subclasses without the program 
knowing it. Which means the objects of a superclass should be able to replace objects of the subclass
without affecting the correctness of the program.

If class B is a subclass of class A, then we should be able to replace A with B without disrupting the
behavior of our program.

Example: 

**Calculate Area**
1. Suppose we have a class `Rectangle` with properties `width` and `height` and methods to set and get these properties.
We also have a method `calculateArea()` that calculates the area of the rectangle.
2. Now, consider a subclass `Square` that extends `Rectangle`. In a square, the width and height are always equal.
So, if in our program, we have a `Rectangle` object and we substitute it with a `Square` object, it should work just fine.
3. But here's where the problem comes:
   1. If we use the `setWidth` and `setHeight` methods on the `Square` object, it would not behave correctly because in a square,
the width is always equal to the height. 
   2. This is a violation of the Liskov Substitution Principle. The `Rectangle` and `Square` relationship seems logical as a
square is a type of rectangle from a geometric point of view, but it doesn't work well in code because they have different
behaviors when it comes to width and height.
   3. A better approach would be to have a separate base class `Shape` with a method `calculateArea()`. 
The `Rectangle` and `Square` classes would both extend `Shape` and implement the `calculateArea()` method in their own way.



**Bicycle Problem**

Consider a `Vehicle` class with a method `accelerate()`. If we have a `Car` class that extends `Vehicle` and overrides the
`accelerate()` method to increase the speed and change gears, it should work normally. However, if we also have a `Bicycle`
class that extends `Vehicle` and overrides the `accelerate()` method, it might not work as expected because bicycles don't
have gears like cars do. If we substitute the `Vehicle` object in our program with a `Bicycle` object, it could lead to 
incorrect results or unexpected behavior.

A potential solution could be to refactor the design and remove the `accelerate()` method from the `Vehicle` class and
instead, create separate interfaces or abstract classes (depending on your exact need) that clearly define the abilities
of a vehicle.

For instance, we could have a `MotorVehicle` abstract class with an `accelerate()` method. The `Car` class would extend
the `MotorVehicle` class. For the `Bicycle`, it could just extend the `Vehicle` class and you could have a different method,
like `pedal()`. Now, `Car` and `Bicycle` are both `Vehicles `, but only `Car` is a `MotorVehicle`. This way, the
`accelerate()` method is only available to `MotorVehicle` and its subclasses, respecting both the Liskov Substitution
Principle and the Interface Segregation Principle.



Similar Use Cases

1. Consider a class `Bird` with a method `fly`. If we have a class `Penguin` that extends `Bird`,
but penguins can't fly, then this would violate the LSP if we called the `fly` method on a `Penguin`
instance. A better approach would be to have a separate `FlyableBird` class extending `Bird`,
and only birds that can fly would extend `FlyableBird`.

