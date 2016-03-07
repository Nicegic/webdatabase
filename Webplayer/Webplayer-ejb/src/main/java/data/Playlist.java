/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author leonmelnik
 */
@Entity
public class Playlist implements Serializable{
    @Id @GeneratedValue
    public int id;
    public int songID;
    public String username;
    public String name;
    
    public Playlist(){}
    
}
