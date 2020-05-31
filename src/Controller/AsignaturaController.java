/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AsignaturaModel;
import View.AsignaturaView;
import static View.AsignaturaView.panelesAsignatura;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsignaturaController implements ActionListener {

    private AsignaturaModel asignaturaModelo;
    private AsignaturaView asignaturaVista;

    public AsignaturaController(AsignaturaView asignatura_vista, AsignaturaModel asignatura_modelo) {
        this.asignaturaModelo = asignatura_modelo;
        this.asignaturaVista = asignatura_vista;
        this.asignaturaVista.btnMostrar.addActionListener(this);
        this.asignaturaVista.btnEditar.addActionListener(this);
        this.asignaturaVista.btnAgregar.addActionListener(this);
        this.asignaturaVista.btnEliminar.addActionListener(this);
        this.asignaturaVista.btnCargar.addActionListener(this);
        this.asignaturaVista.btnBuscar.addActionListener(this);

    }

    /**
     * Este metodo permite mostrar la interfaz asignatura
     */
    public void Iniciar() {
        asignaturaVista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (asignaturaVista.btnAgregar == e.getSource()) {
            CardLayout card = (CardLayout) panelesAsignatura.getLayout();
            card.show(panelesAsignatura, "PanelAgregarAsignatura");

        }
        if (asignaturaVista.btnMostrar == e.getSource()) {
            CardLayout card = (CardLayout) panelesAsignatura.getLayout();
            card.show(panelesAsignatura, "PanelMostrarAsignatura");

        }
        if (asignaturaVista.btnEditar == e.getSource()) {
            CardLayout card = (CardLayout) panelesAsignatura.getLayout();
            card.show(panelesAsignatura, "PanelEditarAsignatura");

        }
        if (asignaturaVista.btnEliminar == e.getSource()) {
            CardLayout card = (CardLayout) panelesAsignatura.getLayout();
            card.show(panelesAsignatura, "PanelElliminarAsignatura");

        }

        if (asignaturaVista.btnCargar == e.getSource()) {
            asignaturaModelo.InsertarAsignatura();
        }
        
        if(asignaturaVista.btnBuscar == e.getSource()){
            
        }
    }

}
