#### Object-oriented programming four pillars:
1. Abstraction
2. Encapsulations
3. Inheritance
4. polymorphism

##### **Abstraction**: It is a representing software system in terms of idea.
Achieve by interfaces and abstract class:
* `Abstract class` It contain abstract and non-abstract methods, whereas `interface` can contain only abstract methods.
* `Abstract class` doesn't support multiple inheritance, but interfaces does.

##### **Encapsulations**: It's used to hide the values or state of a structured data object inside a class. To preventing direct access of the data by clients.
Access specifiers in java:
1. public - Access at class, package, subClass, globally.
2. Protected - Access at class, package, and subClass.
3. Default - Access at class, and package.
4. Private - Access at class only.

##### **Inheritance**: It's a mechanism wherein a new class is derived from an existing class.
Java inheritance types:
1. Single
2. Multiple
3. Hierarchical
4. Multiple (Through Interfaces Only)
5. Hybrid (Through Interfaces Only)

##### **Polymorphism**: It's means `many forms`, and it occurs when we have many classes that are related to each others.
Two types of polymorphism:
1. Compile time (Method Overloading)
2. Run time (Method Overriding)

##### **final** keyword is used for restrict the behaviour of class, method, and variables.
1. if `class` is declared with `final` then that class cannot be inherited by any other class.
2. if `method` is declared with `final` it means that method cannot be overridden by subclass
3. if `variables` are declare with `final` it means we cannot be reassigned their value after it's initialized.

Exception in java:
1. Checked
2. UnChecked
3. Error
