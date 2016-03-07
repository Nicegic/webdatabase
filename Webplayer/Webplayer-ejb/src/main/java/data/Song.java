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
    
    public String getName(){
        return name;
    }
    
    public String getInterpret(){
        return interpret;
    }
    
    public void play(){
        
    }
}
