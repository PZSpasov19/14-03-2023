public class Garage implements Iterator<Car> {
    private Car[] cars;

    public Garage(Car... cars) {
        this.cars = cars;
    }

    private final class garageIterator implements Iterator<Car> {

        private int index = 0;

        @Override
        public boolean hasNext(){
            return false;
        }
        @Override
        public Iterator<Car> iterator() {
            return null;
        }
    }
    public void test(){
        for (int i = 0; i < 10; i++)
        {

        }
    }

}
