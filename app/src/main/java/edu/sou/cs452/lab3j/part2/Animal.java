package edu.sou.cs452.lab3j.part2;

public abstract class Animal {
    public static String ride(Animal a) {
        if (a instanceof Cow) {
            Cow c = (Cow) a;
            return "Cow " + c.name_ + " rides a bicycle";
        } else if (a instanceof Snake) {
            Snake s = (Snake) a;
            if (s.species_.equals("Python")) {
                if (s.slitheriness_ < 0.5) {
                    return "You're riding a Python!";
                } else {
                    return "You slipped off.";
                }
            } else {
                return "You can't ride a " + s.species_ + ".";
            }
        } else if (a instanceof Fish) {
            Fish f = (Fish) a;
            if (f.saltwater_) {
                return "You can't ride a sea fish.";
            } else {
                return "You can't ride a freshwater fish.";
            }
        } else {
            return "Unknown animal type.";
        }
    }
}
