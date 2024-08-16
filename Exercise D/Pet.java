public class Pet {
    private int petId;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String feedingInstructions;
    private String medicationInstructions;

    public Pet(int petId, String name, String species, String breed, int age, String feedingInstructions, String medicationInstructions) {
        this.petId = petId;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.feedingInstructions = feedingInstructions;
        this.medicationInstructions = medicationInstructions;
    }

    // Getters and Setters
    public int getPetId() { return petId; }
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getFeedingInstructions() { return feedingInstructions; }
    public String getMedicationInstructions() { return medicationInstructions; }

    public void updatePetProfile(String name, String species, String breed, int age, String feedingInstructions, String medicationInstructions) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.feedingInstructions = feedingInstructions;
        this.medicationInstructions = medicationInstructions;
    }

    public void setFeedingInstructions(String feedingInstructions) {
        this.feedingInstructions = feedingInstructions;
    }

    public void setMedicationInstructions(String medicationInstructions) {
        this.medicationInstructions = medicationInstructions;
    }

    // Additional methods can be added here if needed
}
