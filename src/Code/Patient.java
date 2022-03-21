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
public class Patient extends Person  {



public static ArrayList<Patient> SearchList =  new ArrayList<Patient>();

public static ArrayList<Patient> AbnoRMAL_patientsList =  new ArrayList<Patient>();

public static  ArrayList<Patient> Patient_List  =  new ArrayList<Patient>();
    /*VitalSigns vs;
    Encounter enc;
   ArrayList<VitalSigns> VitalSigns_List ;*/

   /* public ArrayList<VitalSigns> getVitalSigns_List() {
        return VitalSigns_List;
    }

    public void setVitalSigns_List(ArrayList<VitalSigns> VitalSigns_List) {
        this.VitalSigns_List = VitalSigns_List;
    }
   
 ArrayList<Patient> Patient_List ;


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
        this.enc = enc;*/
    //}
public Patient(){
  
 //Patient_List = new ArrayList<Patient>();
}

    public Encounter_History getEnchis() {
        return enchis;
    }

    public void setEnchis(Encounter_History enchis) {
        this.enchis = enchis;
    }
    Encounter_History enchis;
    //String date_of_birth;

   
    //public String getDate_of_birth() {
       // return date_of_birth;
   // }

   // public void setDate_of_birth(String date_of_birth) {
       // this.date_of_birth = date_of_birth;
  //  }

   /* public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
 

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

  /*  public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }*/

public Patient addPatient(Patient p){
 /*Patient p = new Patient ();*/
 Patient_List.add(p);
return p;
}

    public ArrayList<Patient> getPatient_List() {
        return Patient_List;
    }

    public void setPatient_List(ArrayList<Patient> Patient_List) {
        this.Patient_List = Patient_List;
    }
    

/*public  static ArrayList<Patient> total_Patients (){

for (Person p :Person_Directory.person_list){
  
if (p.isIsPatient() == true){
  Patient_List.add((Patient) p);}

}
 return Patient_List;
}*/



}
