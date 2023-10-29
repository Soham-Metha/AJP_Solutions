import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class BackGround12 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround12() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(25,25,350,350);
        innerPanel.setLayout(new GridLayout(1,1));
        BGimg.add(innerPanel);
		outerPanel.add(BGimg);
        this.setTitle("AJP Experiments");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(outerPanel);
    }
}

class exp12 implements ActionListener{
    Panel p = new Panel();
    BackGround12 bg = new BackGround12();
    Label l1 = new Label("Enter Username : ");
    JTextField userName = new JTextField(15);
    Label l2 = new Label("Enter Password : ");
    JPasswordField password = new JPasswordField(15);
    JButton b = new JButton("Submit");
    exp12()
    {
        p.add(l1);
        p.add(userName);
        p.add(l2);
        p.add(password);
        p.add(b);
        b.addActionListener(this);
        bg.innerPanel.add(p);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(userName.getText().equals("Soham") && password.getText().equals("abcd"))
            JOptionPane.showMessageDialog(bg,"Authenticated user");
        else 
            JOptionPane.showMessageDialog(bg,"Not an authenticated user");
    }
    public static void main(String[] args) {
        new exp12();
    }
}
