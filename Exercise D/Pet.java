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

    public void updatePetProfile(String name, String species, String breed, int age, String feedingInstructions, String medicationInstructions) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.feedingInstructions = feedingInstructions;
        this.medicationInstructions = medicationInstructions;
    }
}
