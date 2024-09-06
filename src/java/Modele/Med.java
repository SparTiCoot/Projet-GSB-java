/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author sio
 */
public class Med  implements Comparable<Med>{
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String spe;
    private String id;
    private String dep;

    public Med(String id, String nom, String prenom, String adresse, String tel, String spe, String dep) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.spe = spe;  
        this.dep = dep;    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDep() {
        return dep;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public String getSpe() {
        return spe;
    }

    public int compareTo(Med m) {
        
        if (nom.compareTo(m.nom) == 0){
            return nom.compareTo(m.nom);
        }else{
            return id.compareTo(m.id);
        }
    }
    
    
}
