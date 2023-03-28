/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adeda
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> allEncounters;

    public EncounterHistory() {
        this.allEncounters = new ArrayList<>();
    }

    public ArrayList<Encounter> getAllEncounters() {
        return allEncounters;
    }

    public void setAllEncounters(ArrayList<Encounter> allEncounters) {
        this.allEncounters = allEncounters;
    }
    
    public void addEncounter(Encounter anEncounter) {
        this.allEncounters.add(anEncounter);
    }

    public void removeEncounter(Encounter anEncounter) {
        this.allEncounters.remove(anEncounter);
    }
}
