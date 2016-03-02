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
public class User implements Serializable{
    public String name;
    public String password;
    public String email;
    
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public void login(){
        
    }
    
    public void logout(){
        
    }
    
}
