/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author adeda
 */
public class Patient extends Person{
    
//    private String id;
    private String allergies;
    private String bloodGroup;
    private String genotype;
    private EncounterHistory allEncounter;

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public EncounterHistory getAllEncounter() {
        return allEncounter;
    }

    public void setAllEncounter(EncounterHistory allEncounter) {
        this.allEncounter = allEncounter;
    }
    
}
