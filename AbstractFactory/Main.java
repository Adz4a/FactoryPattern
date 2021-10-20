
public class Main {

    public static void main(String[] args) {

        VehicleFactory factory = new LuxuryVehicleFactory();

        Car car = factory.getCar();

        System.out.println("Name: " + car.getCarName() + ", Features: " + car.getCarFeatures());


    }

}


