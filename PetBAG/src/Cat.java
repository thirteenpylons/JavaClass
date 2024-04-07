public class Cat extends Pet {
    private String breed;
    private double catWeight;
    private int catSpaceNumber;
    private boolean grooming;

    public Cat(String name, int age, String breed, double catWeight, int catSpaceNumber, boolean grooming) {
        super(name, age);
        this.breed = breed;
        this.catWeight = catWeight;
        this.catSpaceNumber = catSpaceNumber;
        this.grooming = grooming;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(double catWeight) {
        this.catWeight = catWeight;
    }

    public int getCatSpaceNumber() {
        return catSpaceNumber;
    }

    public void setCatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }

    public boolean getGrooming() {
        return grooming;
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}
