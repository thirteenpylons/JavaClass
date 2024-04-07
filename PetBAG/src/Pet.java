public class Pet {
    private static int dogSpaces = 30;
    private static int catSpaces = 12;
    private static double amountDue;

    private String petType;
    private String petName;
    private int petAge;
    private int daysStay;

    public Pet(String petType, String petName, int petAge, int daysStay) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
    }

    public Pet() {
        this.petType = "unknown";
        this.petName = "No name";
        this.petAge = 0;
        this.daysStay = 0;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public static int getDogSpaces() {
        return dogSpaces;
    }

    public static void setDogSpaces(int dogSpaces) {
        Pet.dogSpaces = dogSpaces;
    }

    public static int getCatSpaces() {
        return catSpaces;
    }

    public static void setCatSpaces(int catSpaces) {
        Pet.catSpaces = catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public static double getAmountDue() {
        return amountDue;
    }

    public static void setAmountDue(double amountDue) {
        Pet.amountDue = amountDue;
    }
}
