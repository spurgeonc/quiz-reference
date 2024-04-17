package edu.sou.cs452.lab3j.part1;

public class Cow extends Animal {
    public String name_;

    public Cow(String name) {
        name_ = name;
    }

    public String ride() {
        return "You are riding " + name_ + ", a cow that is riding a bicycle";
    }
}
