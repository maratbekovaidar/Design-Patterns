package kz.maratbekovaidar;

public class Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            case "BMW":
                return new BMW();
            case "Lada":
                return new Lada();
            default: return null;
        }
    }
}
