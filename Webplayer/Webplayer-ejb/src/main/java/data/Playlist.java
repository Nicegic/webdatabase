/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author leonmelnik
 */
public class Playlist {
    public int id;
    public int songID;
    public String username;
    public String name;
    
    public Playlist(String name){
        this.name = name;
    }
}
