package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BirdOwner {
    private String name;
    private String sex;
    private List<Bird> birdList;

    public BirdOwner(String name,String sex){
        this.name=name;
        this.sex=sex;
        birdList = new ArrayList<>();  //? best practice hier meteen instantieren of in methode addBird?
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void addBird(Bird bird){
        if (!birdList.contains(bird)){
            birdList.add(bird);
        }
    }

    public String chooseRandomBirds(int max){
        List<Bird> randomBirds= new ArrayList<>();
        List<Bird> cloneBirds = new ArrayList<>(birdList);

        Random random=new Random();
        for (int i=0;i < max;i++){
            if (cloneBirds.size()==0) break;
            Bird bird= cloneBirds.get(random.nextInt(cloneBirds.size()));
            randomBirds.add(bird);
            cloneBirds.remove(bird);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Willekeurig gekozen vogels (max. ").append(max+"):");
        for (Bird bird: randomBirds){
            sb.append("\r\n").append(bird.getNickname());
            sb.append("\t").append(bird.getSpecies());
            sb.append("\t").append(bird.getRingNumber());
        }
        return sb.toString();

    }

    @Override
    public String toString(){
        //aam van eigenaar en van elke vogel de nickname en
        //    serienummer.
        StringBuilder sb = new StringBuilder();
        sb.append("Naam eigenaar: ").append(this.name);
        if (birdList.size()>0) sb.append("\r\nVogels van deze eigenaar:");
        for (Bird bird: birdList){
            sb.append("\r\n").append(bird.getNickname());
            sb.append("\t").append(bird.getSpecies());
            sb.append("\t").append(bird.getRingNumber());
        }
        return sb.toString();
    }
}
