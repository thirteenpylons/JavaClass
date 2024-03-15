public class Pet {
    private String petType;
    private String petName;
    private int petAge;

    public Pet(String petType, String petName, int petAge) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
    }

    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
}
