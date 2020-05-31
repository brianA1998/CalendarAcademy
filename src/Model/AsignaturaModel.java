package Model;

import Model.LoginModel;
import View.AsignaturaView;
import View.LoginView;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class AsignaturaModel {

    //Declaracion de variables
    Connection driverconnector;
    Connection conexion = Conectar();
    AsignaturaView VistaAsignatura = new View.AsignaturaView();
    static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    static final String URL_BASEDATOS = "jdbc:mysql://localhost/bd_calendar";
    // NombreAsignatura

    /**
     * Este metodo permite la conexion con la base de datos
     *
     * @return la conexion a la base de datos
     */
    public Connection Conectar() {
        try {
            Class.forName(CONTROLADOR);
            driverconnector = DriverManager.getConnection(URL_BASEDATOS, "root", "");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.err.print(e);
        }
        return driverconnector;

    }

    /**
     * Permite limpiar los campos de JPanelAsignatura
     */
    private void LimpiarCampos() {
        View.AsignaturaView.setTxtNombreAsignatura();
        View.AsignaturaView.setTxtNombreProfesor();
        View.AsignaturaView.setComboBoxCondicionPromocional();
        View.AsignaturaView.setComboBoxPeriodoDictado();
    }

    /**
     * Permite insertar una asignatura a la base de datos y verificacion si los
     * campos estan llenos
     */
    public void InsertarAsignatura() {
        try {
            if (View.AsignaturaView.getComboBoxCondicionPromocional().equals("") || View.AsignaturaView.getComboBoxPeriodoDictado().equals("") || View.AsignaturaView.getTxtNombreAsignatura().equals("") || View.AsignaturaView.getTxtNombreProfesor().equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
                LimpiarCampos();

            } else {
                PreparedStatement insertarAsignatura = conexion.prepareStatement("INSERT INTO asignatura(nombre_asignatura,nombre_profesor,periodo_dictado,condicion_promocional) values (?,?,?,?)");
                insertarAsignatura.setString(1, VistaAsignatura.getTxtNombreAsignatura());
                insertarAsignatura.setString(2, VistaAsignatura.getTxtNombreProfesor());
                insertarAsignatura.setString(3, VistaAsignatura.getComboBoxPeriodoDictado());
                insertarAsignatura.setString(4, VistaAsignatura.getComboBoxCondicionPromocional());
                insertarAsignatura.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cargado los datos correctamente");
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "No se pudieron cargar los datos");
        }
    }

    /**
     * Permite modificar los datos y actualizarlos en la base de datos
     */
    public void ModificarAsignatura() throws SQLException {

        String asignaturaModificar = View.AsignaturaView.getTxtBuscar();
        
        
        
        
        PreparedStatement consultaTabla = conexion.prepareStatement("SELECT nombre_asignatura, nombre_profesor, condicion_promocional, periodo_dictado from asignatura where nombre_asignatura like ?");
        consultaTabla.setString(1, asignaturaModificar);
        ResultSet resulset = consultaTabla.executeQuery();
        
        while(resulset.next()){
            
        }
        
        
    }

}
