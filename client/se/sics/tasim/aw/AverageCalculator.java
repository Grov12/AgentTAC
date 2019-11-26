package se.sics.tasim.aw;

public class AverageCalculator {
    public double randomNumber;
    public int length;

    public AverageCalculator(double randomNumber, int length) {
        this.randomNumber = randomNumber;
        this.length = length;
    }

    public double getRandomNumber() {
        return randomNumber;
    }

    public int getLength() {
        return length;
    }
}

