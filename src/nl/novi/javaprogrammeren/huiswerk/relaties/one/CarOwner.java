package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarOwner{
    private String name;
    private String gender;
    private int leeftijd;
    private List<Car> carList;

    public CarOwner(String name, String gender) {
        this.name = name;
        this.gender = gender;
        carList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public boolean addCar(Car car){
        //? Ipv in de constructor hier pas carList instantieren? Best practice?
        if (leeftijd>=18){
            if (!CarDealer.existsInList(car,carList)){
                carList.add(car);
                car.setCarOwner(this); //NB Car.setCarOwner should never be called without also updating lists in which the Car object exists
                return true;
            }
        }
        else {
            System.out.println( name + " is te jong om een auto te hebben!");
        }
        return false;
    }

    public void removeCar(Car car){
        if (carList.contains(car)){
            carList.remove(car);
            car.setCarOwner(null); //NB Car.setCarOwner should never be called without also updating list in which the Car object exists
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naam : ").append(name);
        for (Car car: carList){
            sb.append("\r\n").append(car.getMerk());
            sb.append("\t").append(car.getKenteken());
            sb.append("\t").append(car.getAantalKmGereden());
        }
        return sb.toString();
    }
}