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
public class Person_Directory {
    public static ArrayList<Person> person_list = new ArrayList<Person>();

    public static ArrayList<Person> getPerson_list() {
        return person_list;
    }

  /*  public static void setPerson_list(ArrayList<Person> person_list) {
        this.person_list = person_list;
    }*/


public Person_Directory (){

//person_list = new ArrayList<Person>();
}

public Person addPerson(){
 Person po = new Person ();
Person_Directory.person_list.add(po);
return po;
}

    public void deletePerson(Person selectedPerson) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBod
     person_list.remove(selectedPerson);
    }



/*public void addPatients(){

for (Person p : Person_Directory.person_list){

if (p.isPatient == true){
Patient e = new Patient();
e.setDOB(p.getDOB());
e.setCommunity_Id(p.getCommunity_Id());
e.setId(p.getId());
for(VitalSigns vs : p.getVitalSigns_List()){





}
Patient_Directory.patient_list.add(e);*/
 
//}







}
