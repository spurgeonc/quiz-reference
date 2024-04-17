package edu.sou.cs452.lab3j.part1;

public class Snake extends Animal {
    public String species_;
    public Double slitheriness_;

    public Snake(String species, Double slitheriness) {
        species_ = species;
        slitheriness_ = slitheriness;
    }

    public String ride() {
        if (species_.equals("Python")) {
            if (slitheriness_ < 0.5) {
                return "You're riding a Python!";
            } else {
                return "You slipped off.";
            }
        } else {
            return "You can't ride a " + species_ + ".";
        }
    }
}
