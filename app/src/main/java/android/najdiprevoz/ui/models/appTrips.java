package android.najdiprevoz.ui.models;

import java.time.LocalDateTime;

public class appTrips {
    private int id;
    private int driverId;
    private int carId;
    private Driver driver;
    private Car car;
    private int telNumber;
    private Long startTime;
    private int availableSeats;
    private int price;
    private String cityFrom;
    private String cityTo;
    private String status;
    private Long creationDate;

    public appTrips(int id, int driverId, int carId, Driver driver, Car car, int telNumber, Long startTime, int availableSeats, int price, String cityFrom, String cityTo, String status, Long creationDate) {
        this.id = id;
        this.driverId = driverId;
        this.carId = carId;
        this.driver = driver;
        this.car = car;
        this.telNumber = telNumber;
        this.startTime = startTime;
        this.availableSeats = availableSeats;
        this.price = price;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.status = status;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }
}
