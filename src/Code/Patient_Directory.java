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
public class Patient_Directory {


   public static  ArrayList<Patient> patient_list  =  new ArrayList<Patient>();


public Patient_Directory (){

// patient_list = new ArrayList<Patient>();
}

/*public Patient addPatient(){
 Patient p = new Patient ();
patient_list.add(p);
return p;
}*/

    public ArrayList<Patient> getPatient_list() {
        return patient_list;
    }

    public void setPatient_list(ArrayList<Patient> patient_list) {
        this.patient_list = patient_list;
    }

}
