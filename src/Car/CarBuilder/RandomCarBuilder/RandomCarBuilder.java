package Car.CarBuilder.SportCarBuilder;

import Car.Car;
import Car.CarBuilder.CarBuilder;

public class SportCarBuilder implements CarBuilder {
    Car car;
    public SportCarBuilder() {
        car = new Car();
    }

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Installing new Chassis onto the car");
        car.setChassis("Sport Chassis");
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Installing new body onto the car");
        car.setBody("Sport Body");
        return this;
    }

    @Override
    public CarBuilder fixPaint() {
        System.out.println("Repainting the car");
        car.setPaint("Sport Paint");
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Installing new Interior onto the car");
        car.setInterior("Sport Interior");
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
