import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user,pass;
    JButton acept;
    final JTextField text1,text2;

    Login(){
        /*Definicion*/
        user = new JLabel();
        pass = new JLabel();

        panel = new JPanel(new GridLayout(4,1));
        /*caracteristicas*/
        user.setText("Usuario");
        text1 = new JTextField(6);
        pass.setText("Contraseña");
        text2 = new JTextField(8);
        acept= new JButton("iniciar Secion");
        /*panel*/
        panel.add(user);
        panel.add(text1);
        panel.add(pass);
        panel.add(text2);

        panel.add(acept);
        /*ajuste del panel*/
        setTitle("Login");
        add(panel,BorderLayout.CENTER);
        /*accion de boton*/
        acept.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent accion) {
        String userData=text1.getText();
        String passData=text2.getText();

        if(userData.equals("carlos")&&passData.equals("201800559")){
            Pestaña pestaña= new Pestaña();
            pestaña.setVisible(true);
            JLabel tex = new JLabel("Bienvenido: "+userData);
            pestaña.getContentPane().add(tex);

        }else {

        System.out.println("falla");
        }
    }
}


/*Guia de codigo javatpoint.com*/