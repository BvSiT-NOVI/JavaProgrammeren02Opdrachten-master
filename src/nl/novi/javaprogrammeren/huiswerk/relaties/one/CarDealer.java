package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import nl.novi.javaprogrammeren.lesopdrachten.relaties.two.Bird;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private String name;
    private String address;
    private String city;
    private List<Car> carList = new ArrayList<>();

    public CarDealer(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addCar(Car car){
        if (!existsInList(car,carList)){
            carList.add(car);
            car.setCarOwner(null);//TODO raise warning?
        }
    }

    //TODO create a separate static Util class for this
    public static boolean existsInList(Car carToFind, List<Car> carList){
        for (Car car:carList){
            if (car.getKenteken().equals(carToFind.getKenteken())) return true;
        }
        return false;
    }

    public void removeCar(Car car){
        carList.remove(car);
    }

    public boolean changeOwner(Car car,CarOwner carOwner){
        if (carList.contains(car)){
            if (carOwner.addCar(car)) {  //Also updates Car.carOwner
                carList.remove(car);
                System.out.println("Overschrijven auto geslaagd.");
                return true;
            }
        }
        System.out.println("Overschrijven auto niet geslaagd.");
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naam : ").append("name='").
                append(name).append('\'').
                append(", address='").append(address).append('\'').
                append(", city='").append(city);
        for (Car car: carList){
            sb.append("\r\n").append(car.getMerk());
            sb.append("\t").append(car.getKenteken());
            sb.append("\t").append(car.getAantalKmGereden());
        }
        return sb.toString();
    }

}
