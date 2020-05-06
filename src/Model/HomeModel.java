/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the tempwwlate in the editor.
 */
package Model;

import Controller.AsignaturaController;
import Controller.HomeController;
import View.AsignaturaView;
import View.HomeView;

public class HomeModel {

    /**
     * Este metodo llama al metodo iniciar del controlador de la asignatura y
     * este muestra la interfaz de menu
     */
    public void MostrarAsignatura() {
        AsignaturaModel asignatura_modelo = new AsignaturaModel();
        AsignaturaView asignatura_vista = new AsignaturaView();
        AsignaturaController asignatura_controlador = new AsignaturaController(asignatura_vista, asignatura_modelo);
        asignatura_controlador.Iniciar();

    }
}
