public class SportCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new SportCar();
    }
}
