Classes / Software Entities should be open for extension but closed for modification.
In doing so, we stop ourselves from modifying existing code and causing potential new bugs.

Always use the existing class properties to extend on to other classes - Open for Extension
Until unless the current class is buggy - don't modify the code - closed for modification.

the **one exception to the rule is when fixing bugs in existing code**




Use Cases

1. Consider a `Shape` class and a method `AreaCalculator` that calculates the area of a given shape. 
If we need to aad a new shape, we would have to modify the  `AreaCalculator` method to add a new shape.
This violates OCP. A better approach would be to have the `Shape` abstract class and `Area` method in each
class that extends the `Shape` (eg: `Circle`, `Rectangle` etc.).

2. In a shopping cart system, you can add a new discount strategy without modifying the existing code, by 
creating a new class for the new discount strategy.



