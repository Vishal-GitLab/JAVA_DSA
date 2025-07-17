package src.ProgramingChallenge_2;

public class CarFinal {
    final int noOfWheels;

    final String model;

    final String engineInLiters;

    public CarFinal(String engineInLiters, int noOfWheels, String model) {        // ye puri inmutable claas kyunki iski koi value edit nahi ki ja sakti hai
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;

    }
}
