/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author leonmelnik
 */
@Entity
public class Song implements Serializable{
    @Id @GeneratedValue
    public int id;
    public String name;
    public String interpret;
    public String album;
    public String genre;
    public double dauer;
    public int bewertungUser;
    public int bewertungGesamt;
    
    
    public Song(){
        
    }
    
    //get-Methoden
    public String getName(){
        return name;
    }
    public String getInterpret(){
        return interpret;
    }
    public String getAlbum(){
        return album;
    }
    public String getGenre(){
        return genre;
    }
    public double getDauer(){
        return dauer;
    }
    public int getBewertungUser(){
        return bewertungUser;
    }
    public int getBewertungGesamt(){
        return bewertungGesamt;
    }
    
    //set-Methoden
    public void setName(String name){
        this.name = name;
    }
    public void setInterpret(String interpret){
        this.interpret = interpret;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setDauer(double dauer){
        this.dauer = dauer;
    }
    public void setBewertungUser(int bewertungUser){
        this.bewertungUser = bewertungUser;
    }
    public void setBewertungGesamt(int bewertungGesamt){
        this.bewertungGesamt = bewertungGesamt;
    }
    
    public void play(){
        
    }
}
