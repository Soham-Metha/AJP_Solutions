import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGround10 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround10() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(50,25,300,350);
        BGimg.add(innerPanel);
		outerPanel.add(BGimg);
        this.setTitle("AJP Experiments");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(outerPanel);
    }
}

class exp10 {
    BackGround10 bg = new BackGround10();
    Label[] labels = {
        new Label("Enter First Number :"),
        new Label("Enter Second Number :"),
        new Label("Product of Numbers :")
    };
    TextField[] textFields = {
        new TextField(13),
        new TextField(10),
        new TextField(12),
    };
    Button b = new Button("Multiply");
    exp10() {
        for(int i = 0; i<3; i++) {
            bg.innerPanel.add(labels[i]);
            bg.innerPanel.add(textFields[i]);
        }
        bg.innerPanel.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.valueOf(textFields[0].getText());
                int b = Integer.valueOf(textFields[1].getText());
                int r = a*b;
                textFields[2].setText(" " + r);
            }
        });
    }
    public static void main(String[] args) {
        new exp10();
    }
}