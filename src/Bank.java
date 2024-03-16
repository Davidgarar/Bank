import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Bank extends JFrame implements ActionListener {
    JButton b10, b11;
    JTextField  name_jt, print_name_jt;


    public Bank() {
        super("BancoGUI");
        setLayout(new BorderLayout());

        name_jt = new JTextField(10);
        add(name_jt, BorderLayout.NORTH);

        print_name_jt = new JTextField(10);
        add(print_name_jt, BorderLayout.CENTER);
        print_name_jt.setEditable(false);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));


        b10 = new JButton("Crear cuenta de ahorros");
        p.add(b10);
        b10.addActionListener(this);

        b11 = new JButton("Crear cuenta corriente");
        p.add(b11);
        b11.addActionListener(this);
        add(p,BorderLayout.SOUTH);

        setVisible(true);
        setSize(400, 400);
    }

    public void actionPerformed(ActionEvent ae) {}


    public static void main(String[] args) {
        new Bank();
    }
}