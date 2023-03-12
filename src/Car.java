public class Car extends Vehicle implements ForVehicleWiithTyre, ForVehicleWiithEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {

        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
    }


}