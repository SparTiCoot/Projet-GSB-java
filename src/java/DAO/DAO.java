/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Dep;
import Modele.Med;
import Modele.Spe;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author VILFEU VINCENT  
 */
public class DAO {

    public static Collection<Dep> getLesDeps() {
        try {
            Connection con = Connect.get();
            Statement reqDep;
            reqDep = con.createStatement();
            Collection<Dep> dep = new TreeSet<>();
            Collection lesMeds = getLesMeds();
            ResultSet rsDep = reqDep.executeQuery("SELECT DISTINCT departement FROM medecin");
            boolean encore = rsDep.next();
            while (encore) {
                Dep d = new Dep(rsDep.getString("departement"), lesMeds);
                dep.add(d);
                encore = rsDep.next();
            }
            rsDep.close();
            return dep;

        } catch (SQLException e) {
            System.out.println("Erreur SQL:" + e);
            System.exit(-1);
        }
        return null;
    }

    public static Collection<Spe> getLesSpes() {
        try {
            Connection con = Connect.get();
            Statement reqSpe;
            reqSpe = con.createStatement();
            Collection<Spe> spe = new HashSet<>();
            Collection lesMeds = getLesMeds();            
            ResultSet rsSpe = reqSpe.executeQuery("SELECT DISTINCT specialitecomplementaire FROM medecin WHERE specialitecomplementaire IS NOT null;");
            boolean encore = rsSpe.next();
            while (encore) {
                Spe s = new Spe(rsSpe.getString("specialitecomplementaire"), lesMeds);
                spe.add(s);
                encore = rsSpe.next();
                
            }
            return spe;
            
        } catch (SQLException e) {
            System.out.println("Erreur SQL:" + e);
            System.exit(-1);
        }
        return null;
    }

    public static Collection<Med> getLesMeds() {
        try {
            Connection con = Connect.get();
            Statement reqMed;
            reqMed = con.createStatement();
            Collection<Med> med = new TreeSet<>();
            ResultSet rsMed = reqMed.executeQuery("SELECT * FROM medecin");
            boolean encore = rsMed.next();
            while (encore) {
                Med collM = new Med(rsMed.getString("id"),
                        rsMed.getString("nom"),
                        rsMed.getString("prenom"),
                        rsMed.getString("adresse"),
                        rsMed.getString("tel"),
                        rsMed.getString("specialitecomplementaire"),
                        rsMed.getString("departement"));
                med.add(collM);
                encore = rsMed.next();
            }
            rsMed.close();
            return med;

        } catch (SQLException e) {
            System.out.println("Erreur SQL:" + e);
            System.exit(-1);
        }
        return null;
    }
}
