package beans;

public class Car {
    private String model;
    private String brand;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
