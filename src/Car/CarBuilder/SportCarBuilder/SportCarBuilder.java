package Car.CarBuilder.ClassicCarBuilder;

import Car.Car;
import Car.CarBuilder.CarBuilder;

public class ClassicCarBuilder implements CarBuilder {
    Car car;
    public ClassicCarBuilder() {
        car = new Car();
    }

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Installing new Chassis onto the car");
        car.setChassis("Classic Chassis");
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Installing new body onto the car");
        car.setBody("Classic Body");
        return this;
    }

    @Override
    public CarBuilder fixPaint() {
        System.out.println("Repainting the car");
        car.setPaint("Classic Paint");
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Installing new Interior onto the car");
        car.setInterior("Classic Interior");
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
