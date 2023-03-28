/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adeda
 */
public class City {

    private String name;
    private CommunityDirectory allCommunities;

    public City() {

    }

    public String getName() {
        return name;
    }

    public CommunityDirectory getAllCommunities() {
        return allCommunities;
    }

    public void setAllCommunities(CommunityDirectory allCommunities) {
        this.allCommunities = allCommunities;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
