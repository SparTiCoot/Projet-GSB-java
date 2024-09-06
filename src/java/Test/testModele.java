/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.Connect;
import Modele.Med;
import DAO.DAO;
import static DAO.DAO.getLesDeps;
import Modele.Dep;
import Modele.Pays;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author sio
 */
public class testModele {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {
        Pays p = new Pays();
        System.out.println(p.getLesSpes());
        System.out.println(p.getLesDeps());
        System.out.println("fin");
        Connect.close();
    }
}
