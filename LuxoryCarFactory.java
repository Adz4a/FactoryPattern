public class LuxoryCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new LuxoryCar();
    }
}
