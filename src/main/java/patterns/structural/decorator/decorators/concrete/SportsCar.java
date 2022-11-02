package patterns.structural.decorator.decorators.concrete;

import patterns.structural.decorator.Car;
import patterns.structural.decorator.decorators.CarDecorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("It's also a sports car");
    }
}
