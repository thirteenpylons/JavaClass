public class Dog extends Pet{
    private int dogSpaceNumber;
    private double dogWeight;
    private boolean grooming;

    public Dog(String petType, String petName, int petAge, double dogWeight, int dogSpaceNumber, boolean grooming) {
        super(petType, petName, petAge);
        this.dogWeight = dogWeight;
        this.dogSpaceNumber = dogSpaceNumber;
        this.grooming = grooming;
    }

    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public boolean getGrooming() {
        return grooming;
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}
