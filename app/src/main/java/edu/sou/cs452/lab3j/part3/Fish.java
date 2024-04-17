package edu.sou.cs452.lab3j.part3;

public class Fish extends Animal {
    public Boolean saltwater_;

    public Fish(Boolean saltwater) {
        saltwater_ = saltwater;
    }

    public <T> T accept(Visitor<T> v) {
        return v.visitFish(this);
    }
}