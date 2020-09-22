package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {
    private String name;
    private Dog dog;

    public DogOwner(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public DogOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        if (this.dog==null){
            this.dog = dog;
        }
    }

    public void ageDog(){
        if (this.dog!=null){
            int age= dog.getAge();
            age++;
            this.dog.setAge(age);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(this.name).append(" heeft een ").append(dog.getSex())
                .append(", deze is ").append(dog.getAge()).append(" jaar oud en van het soort: ")
                .append( dog.getSpecies())
                .append(" De hond heet: ").append(dog.getName());
        return sb.toString();
    }

}
