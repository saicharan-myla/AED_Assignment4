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
public class Community {
    String Street_Name;
    int Community_Id;
    //int House_No;
    //String Zip_Code;
    //String City;
   String Community_name;
   String city ;
int hno1;

    public int getHno1() {
        return hno1;
    }

    public void setHno1(int hno1) {
        this.hno1 = hno1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
   public static ArrayList <City>  CityList =  new ArrayList <City> () ;


    public String getStreet_Name() {
        return Street_Name;
    }

    public void setStreet_Name(String Street_Name) {
        this.Street_Name = Street_Name;
    }

    public int getCommunity_Id() {
        return Community_Id;
    }

    public void setCommunity_Id(int Community_Id) {
        this.Community_Id = Community_Id;
    }

    /*public int getHouse_No() {
        return House_No;
    }

    public void setHouse_No(int House_No) {
        this.House_No = House_No;
    }*/

   /* public String getZip_Code() {
        return Zip_Code;
    }

    public void setZip_Code(String Zip_Code) {
        this.Zip_Code = Zip_Code;
    }*/

   /* public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }*/

    public String getCommunity_name() {
        return Community_name;
    }

    public void setCommunity_name(String Community_name) {
        this.Community_name = Community_name;
    }


}