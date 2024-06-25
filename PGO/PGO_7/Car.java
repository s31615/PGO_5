public class Car implements Comparable<Car> {
    private String model;
    private int rokProdukcji;

    public Car(String model, int rokProdukcji) {
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public String getModel() {
        return model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.rokProdukcji, car.getRokProdukcji());
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', rokProdukcji=" + rokProdukcji + "}";
    }
}
