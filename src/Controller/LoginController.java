package Controller;

import View.LoginView;
import Model.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {

    //Declaracion de variables de tipo Modelo y Login
    private LoginModel loginModelo;
    private LoginView loginVista;

    /**
     * Crea un login con los parametros especificados
     *
     * @param loginModelo parametro de tipo modelo
     * @param loginVista parametro de tipo login
     */
    public LoginController(LoginModel loginModelo, LoginView loginVista) {
        this.loginModelo = loginModelo;
        this.loginVista = loginVista;
        this.loginVista.btn_registrar.addActionListener(this);
        this.loginVista.btn_login.addActionListener(this);
    }

    /**
     * Este metodo permite mostrar la interfaz Login
     */
    public void Iniciar() {

        loginVista.setVisible(true);

    }

    /**
     * Captar los eventos que se estan realizando con los botones
     *
     * @param e evento capturado
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (loginVista.btn_registrar == e.getSource()) {
            try {
                loginModelo.RegistrarUsuarios();
                if (loginModelo.bandera == true) {
                    loginVista.dispose();
                }
            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "No se pudo cargar");
            }
        }
        if (loginVista.btn_login == e.getSource()) {
            try {
                loginModelo.ValidarLogin();
                if (loginModelo.bandera == true) {
                    loginVista.dispose();
                }

            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "No se pudo ingresar al sistema");
            }
        }

    }

}
