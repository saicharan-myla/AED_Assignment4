/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.ArrayList;

/**
 *
 * @author saich
 */
public class Person {
    
static int Counter = 0;
int id ;
String name;
int age;
String phone_number;
String DOB;
String Address;
Community community;
int Community_Id;
String City;
int hno1;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getHno1() {
        return hno1;
    }

    public void setHno1(int hno1) {
        this.hno1 = hno1;
    }

boolean isPatient;


VitalSigns vs;
ArrayList<Encounter> Encounter_history;
Encounter enc;
ArrayList<VitalSigns> VitalSigns_List ;


public VitalSigns Addnew(){
 VitalSigns vs14 = new VitalSigns();
VitalSigns_List.add(vs14);
return vs14;

}
    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public Encounter getEnc() {
        return enc;
    }

    public void setEnc(Encounter enc) {
        this.enc = enc;
    }

    public ArrayList<VitalSigns> getVitalSigns_List() {
        return VitalSigns_List;
    }

    public void setVitalSigns_List(ArrayList<VitalSigns> VitalSigns_List) {
        this.VitalSigns_List = VitalSigns_List;
    }
   

    public static int getCounter() {
        return Counter;
    }

    public static void setCounter(int Counter) {
        Person.Counter = Counter;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

Person(){
        this.isPatient = false;
Counter++;
VitalSigns_List = new ArrayList<VitalSigns>();
}

    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Encounter> getEncounter_history() {
        return Encounter_history;
    }

    public void setEncounter_history(ArrayList<Encounter> Encounter_history) {
        this.Encounter_history = Encounter_history;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getCommunity_Id() {
        return Community_Id;
    }

    public void setCommunity_Id(int Community_Id) {
        this.Community_Id = Community_Id;
    }

    public String toString(){
return name;
}
}
