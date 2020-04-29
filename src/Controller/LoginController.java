package Controller;

import View.LoginView;
import Model.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class LoginController implements ActionListener {

    private LoginModel m;
    private LoginView v;

    public LoginController(LoginModel m, LoginView v) {
        this.m = m;
        this.v = v;
    }

    public void Iniciar() {

        v.setTitle("Calendar Academy");
        v.pack();
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }

    /**
     * Captar los botones que se estan oprimiendo
     *
     * @param e evento capturado
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
