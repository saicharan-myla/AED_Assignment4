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
public class Encounter_History {
    
public ArrayList <Encounter>  Encounters_List ;

    public ArrayList<Encounter> getEncounters_List() {
        return Encounters_List;
    }

    public void setEncounters_List(ArrayList<Encounter> Encounters_List) {
        this.Encounters_List = Encounters_List;
    }


public Encounter_History(){
   Encounters_List = new ArrayList<Encounter>();
}

public Encounter record_New_Encounter(){
 
Encounter enc = new Encounter();
Encounters_List.add(enc);

return enc;


}



}
