public class Truck extends Vehicle implements ForVehicleWiithEngine, ForVehicleWiithTrailer, ForVehicleWiithTyre {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {

        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }


}