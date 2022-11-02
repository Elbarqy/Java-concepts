package patterns.structural.adaptor.service;

import patterns.structural.adaptor.inputs.RoundPeg;

public class RoundHole {
    private final double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
//    RoundPeg peg
    public boolean fits(RoundPeg peg){
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
