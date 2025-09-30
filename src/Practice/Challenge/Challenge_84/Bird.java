package src.Practice.Challenge.Challenge_84;

public abstract class Bird implements Flyable{
    public final String Breed;

    public Bird(String Breed) {
        this.Breed = Breed;
    }

    public String getBreed() {
        return Breed;
    }
}
