/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.time.LocalDateTime;

/**
 *
 * @author saich
 */
public class Encounter {
    LocalDateTime date_time;
    String purpose;
    //Patient p;
    String Doc_comments;

    public LocalDateTime getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDateTime date_time) {
        this.date_time = date_time;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDoc_comments() {
        return Doc_comments;
    }

    public void setDoc_comments(String Doc_comments) {
        this.Doc_comments = Doc_comments;
    }



}
