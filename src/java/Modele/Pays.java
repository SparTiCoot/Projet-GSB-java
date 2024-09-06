/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import DAO.DAO;
import java.util.Collection;
/**
 *
 * @author sio
 */
public class Pays{
    private Collection<Dep> lesDeps;
    private Collection<Spe> lesSpes;

    public Pays() {
        lesDeps = DAO.getLesDeps();
        lesSpes = DAO.getLesSpes();
        this.assocMedecins(DAO.getLesMeds());
    }
    
    private void assocMedecins(Collection<Med> lesMeds){
        for (Med unMed : lesMeds){
            getLeDep(unMed.getDep()).addUnMed(unMed);
            Spe uneSpe = getLaSpe(unMed.getSpe());
            if (uneSpe != null){
                uneSpe.addUnMed(unMed);
            }
        }
    }

    public Collection<Dep> getLesDeps() {
        return lesDeps;
    }
    
    
    public Dep getLeDep(String numDep){
        for(Dep d : lesDeps){
            if(d.getNum().equals(numDep)){
                return d;
            }
        }
        return null;
    }

    public Spe getLaSpe(String nomSpe) {
        for(Spe s : lesSpes){
            if(s.getNom().equals(nomSpe)){
                return s;
            }
        }
        return null;
    }

    public Collection <Spe> getLesSpes() {
        return lesSpes;
    }
    
}
