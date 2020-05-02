package Controller;

import View.LoginView;
import Model.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {

    //Declaracion de variables de tipo Modelo y Login
    private LoginModel m;
    private LoginView v;

    /**
     * Crea un login con los parametros especificados
     *
     * @param m parametro de tipo modelo
     * @param v parametro de tipo login
     */
    public LoginController(LoginModel m, LoginView v) {
        this.m = m;
        this.v = v;
        this.v.btn_registrar.addActionListener(this);
        this.v.btn_login.addActionListener(this);
    }

    /**
     * Este metodo permite mostrar la interfazAc Login
     */
    public void Iniciar() {

        v.setVisible(true);

    }

    /**
     * Captar los botones que se estan oprimiendo
     *
     * @param e evento capturado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (v.btn_registrar == e.getSource()) {
            try {
                m.RegistrarUsuarios();
                if(m.bandera==true){
                    v.dispose();
                }
            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "No se pudo cargar");
            }
        }
        if (v.btn_login == e.getSource()) {
            try {
                m.ValidarLogin();
                if (m.bandera == true) {
                    v.dispose();
                }

            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "No se pudo ingresar al sistema");
            }
        }
    }

}
