package principal;

import Controller.LoginController;
import Model.LoginModel;
import View.LoginView;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal {

    public static void main(String[] args) {
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

        LoginModel loginModelo = new LoginModel();
        LoginView loginVista = new LoginView();
        LoginController controladorLogin = new LoginController(loginModelo, loginVista);
        controladorLogin.Iniciar();
    }
}
