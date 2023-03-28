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
public class CommunityDirectory {
    
    private ArrayList<Community> allCommunities;

    public CommunityDirectory() {
        this.allCommunities = new ArrayList<Community>();
    }

    
    public ArrayList<Community> getAllCommunities() {
        return allCommunities;
    }

    public void setAllCommunities(ArrayList<Community> allCommunities) {
        this.allCommunities = allCommunities;
    }
    
    public void addCommunity(Community aCommunity) {
        this.allCommunities.add(aCommunity);
    }

    public void removeHospital(Community aCommunity) {
        this.allCommunities.remove(aCommunity);
    }
}
