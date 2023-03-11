public class ServiceStation {


    public void check(Car car) {
        if (car == null) {
            throw new RuntimeException("Некорректное транспортное средство");

        }
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }

    }

    public void check(Bicycle bicycle) {
        if (bicycle == null) {
            throw new RuntimeException("Некорректное транспортное средство");

        }
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

    public void check(Truck truck) {
        if (truck == null) {
            throw new RuntimeException("Некорректное транспортное средство");

        }

        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }


    }

}