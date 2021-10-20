public class StandardCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new StandardCar();
    }
}
