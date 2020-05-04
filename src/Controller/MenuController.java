/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MenuModel;
import View.MenuView;
import static View.MenuView.btnMenu;
import static View.MenuView.pnlMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.xml.transform.Source;

public class MenuController implements ActionListener {

    //Declarando variables
    private MenuView menuVista;
    private MenuModel menuModelo;

    /**
     * Metodo constructor que crea un menu con los parametros especificados
     *
     * @param menuVista parametro de tipo MenuView
     * @param menuModelo parametro de tipo MenuModel
     */
    public MenuController(MenuView menuVista, MenuModel menuModelo) {
        this.menuModelo = menuModelo;
        this.menuVista = menuVista;
        this.menuVista.btnCerrar.addActionListener(this);
        this.menuVista.btnMenu.addActionListener(this);

    }

    /**
     * Este metodo permite mostrar la Vista de Menu
     */
    public void Iniciar() {

        menuVista.setVisible(true);
        menuVista.setLocationRelativeTo(null);
        menuVista.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (menuVista.btnCerrar == e.getSource()) {
            System.exit(0);
        }
        if (menuVista.btnMenu == e.getSource()) {
            int posicion = btnMenu.getX();
            if (posicion == 5) {

                Animacion.Animacion.mover_derecha(5, 210, 2, 2, btnMenu);
                Animacion.Animacion.mover_derecha(-200, 5, 2, 2, pnlMenu);

            } else {

                Animacion.Animacion.mover_izquierda(211, 5, 2, 2, btnMenu);
                Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnlMenu);
            }
            
        }
    }
}
