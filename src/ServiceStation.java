public class ServiceStation {


    public void check(Car car) {
        if (car == null) {
            throw new RuntimeException("Некорректное транспортное средство");

        }
        if (car != null) {
            car.check();
        }

    }

    public void check(Bicycle bicycle) {
        if (bicycle == null) {
            throw new RuntimeException("Некорректное транспортное средство");

        }
        if (bicycle != null) {
            bicycle.check();
        }
    }

    public void check(Truck truck) {
        if (truck == null) {
            throw new RuntimeException("Некорректное транспортное средство");

        }

        if (truck != null) {
            truck.check();
        }


    }

}