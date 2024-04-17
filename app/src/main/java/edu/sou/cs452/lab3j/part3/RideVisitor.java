package edu.sou.cs452.lab3j.part3;

public class RideVisitor implements Animal.Visitor<String> {
    public String visitSnake(Snake s) {
        if (s.species_.equals("Python")) {
            if (s.slitheriness_ < 0.5) {
                return "You're riding a Python!";
            } else {
                return "You slipped off.";
            }
        } else {
            return "You can't ride a " + s.species_ + ".";
        }
    }

    public String visitCow(Cow c) {
        return "Cow " + c.name_ + " rides a bicycle";
    }

    public String visitFish(Fish f) {
        if (f.saltwater_) {
            return "You can't ride a sea fish.";
        } else {
            return "You can't ride a freshwater fish.";
        }
    }

}
