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
public class Dep  implements Comparable<Dep>{
    private String num;
    Collection<Med> lesMeds = new TreeSet<>();

    public Dep(String num, Collection<Med> lesMeds) {
        this.num = num;
        this.lesMeds = lesMeds;
        
        
    }

    public String getNum() {
        return num;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }

    public int compareTo(Dep d) {
        return num.compareTo(d.num);
    }

    public void addUnMed(Med unMed) {
        lesMeds.add(unMed);
    }
    

    
}
