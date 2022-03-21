/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author saich
 */
public class VitalSigns {

    int Encounter_id;
    double temperature;
    int systolic_pressure;
   public static int Encounters_id=0;

    public int getEnc_id() {
        return Enc_id;
    }

    public void setEnc_id(int Enc_id) {
        this.Enc_id = Enc_id;
    }
    int Enc_id;

 public VitalSigns(){
  // Encounter_id +=1;
   VitalSigns.Encounters_id +=1;


  // this.setEncounter_id(Encounter_id);
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
int id ;

    public ArrayList<VitalSigns> getVslist() {
        return vslist;
    }

    public void setVslist(ArrayList<VitalSigns> vslist) {
        this.vslist = vslist;
    }
    int diastolic_pressure;
    int blood_oxygen;
    String doc_remarks;
   ArrayList<VitalSigns> vslist;

    public String getDoc_remarks() {
        return doc_remarks;
    }

    public void setDoc_remarks(String doc_remarks) {
        this.doc_remarks = doc_remarks;
    }
    LocalDateTime entry_time;

    public LocalDateTime getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(LocalDateTime entry_time) {
        this.entry_time = entry_time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getSystolic_pressure() {
        return systolic_pressure;
    }

    public void setSystolic_pressure(int systolic_pressure) {
        this.systolic_pressure = systolic_pressure;
    }

    public int getDiastolic_pressure() {
        return diastolic_pressure;
    }

    public void setDiastolic_pressure(int diastolic_pressure) {
        this.diastolic_pressure = diastolic_pressure;
    }

    public int getBlood_oxygen() {
        return blood_oxygen;
    }

    public void setBlood_oxygen(int blood_oxygen) {
        this.blood_oxygen = blood_oxygen;
    }
   public VitalSigns addVitalstoList (){
       VitalSigns vss = new VitalSigns();
       vslist.add(vss);
       return vss;

}

}
