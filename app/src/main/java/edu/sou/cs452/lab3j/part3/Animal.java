package edu.sou.cs452.lab3j.part3;

// An abstract class is a class that cannot be instantiated on its own, but must be subclassed.
// However, an abstract class can have abstract methods, which are methods that are declared but not implemented.
// And it can have concrete methods, which are methods that are implemented, making it different from an interface.
public abstract class Animal {

    // Define a Visitor interface that will be used to implement the Visitor pattern.
    // An interface is a contract that specifies the methods that a class must implement, but does not provide the implementation.
    interface Visitor<T> {
        T visitCow(Cow c);
        T visitSnake(Snake s);
        T visitFish(Fish f);
    }

     public abstract <T> T accept(Visitor<T> v);
}