/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Ingrediente;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class CreaIngrediente {
    
    private Ingrediente nuovo;
    
    public void nuovoIngrediente() {
        nuovo = new Ingrediente();
        nuovo.setNome("Sale");
    }
    
}
