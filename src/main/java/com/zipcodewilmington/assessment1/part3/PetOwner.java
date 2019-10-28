package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;
import com.zipcodewilmington.assessment1.part2.ArrayUtils;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        // this is gross, but my merge array doesn't work yet
        if (this.pets != null) {
            Pet[] petsNew = new Pet[this.pets.length + 1];
            for (int i = 0; i < this.pets.length; i++) {
                petsNew[i] = this.pets[i];
            }
            petsNew[this.pets.length] = pet;
        } else {
            this.pets = new Pet[1];
            this.pets[0] = pet;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if (ArrayUtils.getNumberOfOccurrences(this.pets, pet) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer min = Integer.MAX_VALUE;
        Integer age;
        for (Pet pet : this.pets) {
            age = pet.getAge();
            if (age < min) {
                min = age;
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer max = 0;
        Integer age;
        for (Pet pet : this.pets) {
            age = pet.getAge();
            if (age > max) {
                max = age;
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer[] ages = new Integer[this.pets.length];
        for (int i = 0; i < this.pets.length; i++) {
            ages[i] = this.pets[i].getAge();
        }

        return IntegerArrayUtils.getAverage(ages).floatValue();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
