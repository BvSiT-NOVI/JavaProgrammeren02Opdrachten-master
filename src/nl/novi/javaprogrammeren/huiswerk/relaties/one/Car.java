package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class Car {
    private String kenteken;
    private String merk;
    private int aantalKmGereden;
    private CarOwner carOwner;

    public Car(String kenteken, String merk, int aantalKmGereden) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.aantalKmGereden = aantalKmGereden;
    }

    public Car(String kenteken, String merk, int aantalKmGereden, CarOwner carOwner) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.aantalKmGereden = aantalKmGereden;
        this.carOwner = carOwner;
    }

    public String getKenteken() {
        return kenteken;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public String getMerk() {
        return merk;
    }

    public int getAantalKmGereden() {
        return aantalKmGereden;
    }

    public void setAantalKmGereden(int aantalKmGereden) {
        this.aantalKmGereden = aantalKmGereden;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner=carOwner;
    }

}