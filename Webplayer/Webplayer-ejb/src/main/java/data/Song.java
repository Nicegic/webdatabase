/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;

/**
 *
 * @author leonmelnik
 */
public class Song implements Serializable{
    public int id;
    public String name;
    public String interpret;
    public String album;
    public String genre;
    public double dauer;
    public int bewertungUser;
    public int bewertungGesamt;
    
    public Song(String name, String interpret, String album, String genre, double dauer) {
        this.name = name;
        this.interpret = interpret;
        this.album = album;
        this.genre = genre;
        this.dauer = dauer;
    }
    
    public void play(){
        
    }
}
