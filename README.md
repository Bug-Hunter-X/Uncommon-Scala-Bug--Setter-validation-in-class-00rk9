# Uncommon Scala Bug: Setter Validation

This repository demonstrates a subtle bug that can easily occur when defining custom classes in Scala.

## The Bug
The `MyClass` class has a property `age` with both a getter and a setter. While the setter checks for negative ages, this check is not comprehensive and may lead to unexpected behavior under certain conditions.  The example code shows that using a negative value for the age throws an exception.