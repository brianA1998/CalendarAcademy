/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AsignaturaModel;
import View.AsignaturaView;
import java.awt.event.ActionListener;

/**
 *
 * @author GARBARINO
 */
public class AsignaturaController {

    private AsignaturaModel asignaturaModelo;
    private AsignaturaView asignaturaVista;

    public AsignaturaController(AsignaturaView asignatura_vista, AsignaturaModel asignatura_modelo) {
        this.asignaturaModelo = asignatura_modelo;
        this.asignaturaVista = asignatura_vista;
    }

    /**
     * Este metodo permite mostrar la interfaz asignatura
     */
    public void Iniciar() {

        asignaturaVista.setVisible(true);
       
    }
    
    

}
