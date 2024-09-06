/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author sio
 */
public class Spe {
    private String nom;
    Collection<Med> lesMeds;
    
    public Spe(String nom, Collection<Med> lesMeds) {
        this.nom = nom;
        this.lesMeds = lesMeds;
    }

    public String getNom() {
        return nom;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }
    
    public void addUnMed(Med unMed) {
        lesMeds.add(unMed);
    }
}
