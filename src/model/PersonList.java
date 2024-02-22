/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import candidates.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhs
 */
public class PersonList {
    
    private List<Person> personList = new ArrayList<>();

    public PersonList() {
    }
    

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public boolean addPerson(Person ps){
        for (Person person : personList){
            if (person.getId().equalsIgnoreCase(ps.getId())){
                return false;
            }
        }
        personList.add(ps);
        return true;
    }
}
