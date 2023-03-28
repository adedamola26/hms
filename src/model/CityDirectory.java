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
public class CityDirectory {

    private ArrayList<City> allCities;

    public CityDirectory() {
        this.allCities = new ArrayList<City>();
        inputDefault();
    }

    public ArrayList<City> getAllCities() {
        return allCities;
    }

    public void setAllCities(ArrayList<City> allCities) {
        this.allCities = allCities;
    }

    public void addCity(City city) {
        allCities.add(city);
    }

    public void inputDefault() {
        City newCity1 = new City();
        Object[] cities = new Object[2];

        CommunityDirectory allCommunities1 = new CommunityDirectory();

        Community newCommunity11 = new Community();
        Community newCommunity12 = new Community();

        City newCity2 = new City();
        CommunityDirectory allCommunities2 = new CommunityDirectory();

        Community newCommunity21 = new Community();
        Community newCommunity22 = new Community();

        newCity1.setName("Toronto");
        newCommunity11.setName("East York");
        newCommunity12.setName("North York");
        allCommunities1.addCommunity(newCommunity11);
        allCommunities1.addCommunity(newCommunity12);
        newCity1.setAllCommunities(allCommunities1);

        newCity2.setName("Hamilton");
        newCommunity21.setName("Bartonville");
        newCommunity22.setName("Blakely");
        allCommunities2.addCommunity(newCommunity21);
        allCommunities2.addCommunity(newCommunity22);
        newCity2.setAllCommunities(allCommunities2);

        cities[0] = newCity1;
        cities[1] = newCity2;

        for (Object o : cities) {
            City city = (City) o;
            for (Community co : city.getAllCommunities().getAllCommunities()) {
                HospitalDirectory allHospitals = new HospitalDirectory();
                Hospital newHospital1 = new Hospital();
                newHospital1.setName(co.getName() + " General Hospital");
                newHospital1.setAddress("Somewhere in " + city.getName());
                Hospital newHospital2 = new Hospital();
                newHospital2.setName(co.getName() + " Memorial Hospital");
                newHospital2.setAddress("Somewhere in " + co.getName());
                allHospitals.addHospital(newHospital1);
                allHospitals.addHospital(newHospital2);

                for (Hospital h : allHospitals.getAllHospitals()) {
                    DoctorDirectory allDoctors = new DoctorDirectory();
                    Doctor newDoctor1 = new Doctor();
                    newDoctor1.setFirstName("John");
                    newDoctor1.setLastName(co.getName());
                    newDoctor1.setUsername("John");
                    newDoctor1.setPassword(co.getName());
                    Doctor newDoctor2 = new Doctor();
                    newDoctor2.setFirstName("Jane");
                    newDoctor2.setUsername("Jane");

                    newDoctor2.setLastName(city.getName());
                    newDoctor2.setPassword(city.getName());

                    allDoctors.addDoctor(newDoctor1);
                    allDoctors.addDoctor(newDoctor2);
                    h.setAllDoctors(allDoctors);
                }
                co.setAllHospitals(allHospitals);
            }
            this.allCities.add(city);
        }
    }
}
