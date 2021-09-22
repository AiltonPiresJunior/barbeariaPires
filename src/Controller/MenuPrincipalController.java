/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author Ailton
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;
    
    public MenuPrincipalController(MenuPrincipal view){
        this.view = view;
    }
    
    public void navegarParaAgendar(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        this.view.dispose();
    }
}
