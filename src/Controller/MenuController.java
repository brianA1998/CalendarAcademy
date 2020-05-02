/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MenuModel;
import View.MenuView;

public class MenuController {

    private MenuView mv;
    private MenuModel mm;

    public MenuController(MenuView mv, MenuModel mm) {
        this.mm = mm;
        this.mv = mv;
    }

    /**
     * Este metodo permite mostrar la interfazAc Menu
     */
    public void Iniciar() {

        mv.setVisible(true);

    }
}
