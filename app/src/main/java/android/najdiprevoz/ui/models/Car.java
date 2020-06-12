package android.najdiprevoz.ui.models;

public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private String color;
    private String photoUrl;

    public Car(int id, String manufacturer, String model, String color, String photoUrl) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.photoUrl = photoUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
