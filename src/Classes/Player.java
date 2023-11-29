/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Jordan
 */

public class Player {
    
    //Declaración de variables
    private String name;
    private String lastname;
    private String email;
    private String born;
    private String residence;
    private String nickname;
    
    //Constructor
     public Player(String name, String lastname, String email, String born, String residence, String nickname) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.born = born;
        this.residence = residence;
        this.nickname = nickname;
    }
     
     /*
        @Getters
     */
     public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getBorn() {
        return born;
    }

    public String getResidence() {
        return residence;
    }

    public String getNickname() {
        return nickname;
    }
    
}
