package edu.sou.cs452.lab3j.part3;

public class Cow extends Animal {
    public String name_;

    public Cow(String name) {
        name_ = name;
    }

    public <T> T accept(Visitor<T> v) {
        return v.visitCow(this);
    }
}
