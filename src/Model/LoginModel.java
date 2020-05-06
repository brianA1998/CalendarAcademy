package Model;

import Controller.LoginController;
import Controller.HomeController;
import View.LoginView;
import View.HomeView;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginModel {

    //Declaracion de variables
    Connection driverconnector;
    Connection conexion = Conectar();
    LoginView vista_login = new View.LoginView();
    static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    static final String URL_BASEDATOS = "jdbc:mysql://localhost/bd_calendar";
    public boolean bandera = true;

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
     * Este metodo permite registrar usuarios a la base de datos y limpiar los
     * campos una vez que se guardaron los datos en la bd
     */
    public void RegistrarUsuarios() {
        //Realizando un Query a la base de datos
        try {
            if (View.LoginView.getNombreUsuario().equals("") || View.LoginView.getPasswordUsuario().equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
            } else {

                PreparedStatement insertarUsuario = conexion.prepareStatement("INSERT INTO usuarios(user,password) VALUES (?,?)");

                insertarUsuario.setString(1, vista_login.getNombreUsuario());
                insertarUsuario.setString(2, vista_login.getPasswordUsuario());
                insertarUsuario.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cargado al sistema correctamente");
                bandera = true;
                MostrarMenu();
            }
        } catch (SQLException ex) {
            bandera = false;
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Insercion fallida");

        }
    }

    /**
     * Este metodo permite validar si el usuario existe en la base de datos o no
     * Nos va a redirrecionar al menuprincipal si existe el usuario Pero si no
     * existe nos va a pedir que nos registremos
     *
     */
    public void ValidarLogin() {
        int resultado = 0;

        try {

            if (View.LoginView.getNombreUsuario().equals("") || View.LoginView.getPasswordUsuario().equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
            } else {

                String usuario = View.LoginView.getNombreUsuario();
                String password = View.LoginView.getPasswordUsuario();

                //Query
                String sql = "SELECT * FROM usuarios where user ='" + usuario + "' and password='" + password + "'";
                Statement consultaSQL = driverconnector.createStatement();
                ResultSet rs = consultaSQL.executeQuery(sql);
                if (rs.next()) {
                    resultado = 1;
                    if (resultado == 1) {
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + usuario);
                        bandera = true;
                        MostrarMenu();

                    }
                } else {
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Usted no esta cargado en el sistema,registrese");
                    vista_login.setNombreUsuario();
                    vista_login.setPasswordUsuario();
                    vista_login.btn_login.setEnabled(false);
                }
            }

        } catch (Exception ex) {
            System.err.print(ex);
            JOptionPane.showMessageDialog(null, "No se puede ingresar al sistema");
        }
    }

    /**
     * Este metodo llama al metodo iniciar del controlador del menu y este
     * muestra la interfaz de menu
     */
    public void MostrarMenu() {
        HomeModel Homemodelo = new HomeModel();
        HomeView menu_vista = new HomeView();
        HomeController menu_controlador = new HomeController(menu_vista, Homemodelo);
        menu_controlador.IniciarMenu();
    }

}
