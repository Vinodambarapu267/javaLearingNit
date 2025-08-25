package inheritance.ha_relation.car_has_relation;

public class Engine {
    private String model;
    private int engineCapacity;

    public Engine(String model, int engineCapacity) {
        if(engineCapacity<=0){
            System.err.println("enter the postive engine capacity");
            System.exit(0);
        }
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine[" +
                "model='" + model  +
                ", engineCapacity=" + engineCapacity +"cc"+
                ']';
    }
}
