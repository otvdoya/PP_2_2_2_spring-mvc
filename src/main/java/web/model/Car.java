package web.model;

public class Car {
    private String model;
    private Integer run;
    private String ownerName;

    public Car() {
    }

    public Car(String model, Integer run, String ownerName) {
        this.model = model;
        this.run = run;
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", run=" + run +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
