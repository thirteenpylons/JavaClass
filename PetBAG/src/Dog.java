public class Dog extends Pet {
    private String breed;
    private double dogWeight;
    private int dogSpaceNumber;
    private boolean grooming;

    public Dog(String petType, String name, int age, int daysStay,String breed, double dogWeight, int dogSpaceNumber, boolean grooming) {
        super(petType, name, age, daysStay);
        this.breed = breed;
        this.dogWeight = dogWeight;
        this.dogSpaceNumber = dogSpaceNumber;
        this.grooming = grooming;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    public boolean getGrooming() {
        return grooming;
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}
