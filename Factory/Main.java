
public class Main {

    public static void main(String[] args) {

        CarFactory newFactory = new SportCarFactory();

        Car newCar = newFactory.createCar();

        newCar.assemble();
        newCar.getBody();
        newCar.getTier();
        newCar.testDrive();


    }

}
