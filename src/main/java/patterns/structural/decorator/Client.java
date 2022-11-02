package patterns.structural.decorator;

import patterns.structural.decorator.decorators.concrete.LuxuryCar;
import patterns.structural.decorator.decorators.concrete.SportsCar;

public class Client {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new LuxuryCar(sportsCar);
        sportsLuxuryCar.assemble();
    }
}
