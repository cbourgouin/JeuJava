/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbourgouin.me.jeudechasseautresors;

/**
 *
 * @author cbourgouin
 */
public class Joueur {
   private String nom;
   private String prenom;
   private int nmRole;
   private int positionX;
   private int positionY;

    public Joueur(String nom, String prenom, int nmRole, int positionX, int positionY) {
        this.nom = nom;
        this.prenom = prenom;
        this.nmRole = nmRole;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Joueur() {
        this.nom = "Ramdom";
        this.prenom = "Jonh";
        this.nmRole = 3;
        this.positionX = 5;
        this.positionY = 5;
    }
   
   
   
}
