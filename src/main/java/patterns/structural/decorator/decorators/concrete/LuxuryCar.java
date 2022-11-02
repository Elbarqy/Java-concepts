package patterns.structural.decorator.decorators.concrete;

import patterns.structural.decorator.Car;
import patterns.structural.decorator.decorators.CarDecorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("it's also a luxury car");
    }
}
