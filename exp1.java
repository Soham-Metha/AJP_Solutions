import java.awt.*;
import javax.swing.*;
class BackGround1 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround1() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(50,25,300,400);
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
class exp1 {    
    public static void main(String[] args) {
        BackGround1 bg = new BackGround1();
        Panel p = new Panel();
        Component[] components = {
            new Label("Welcome to java"),
            new Checkbox("Marathi"),
            new Checkbox("Hindi"),
            new Checkbox("English"),
            new Checkbox("German"),
            new Button("OK"),
            new Button("Reset"),
            new Button("Cancel")
        };
        for (int i = 0; i < components.length ; i++) {
            components[i].setFont(new Font("Ubuntu condensed", Font.PLAIN, 30));
            p.add(components[i]);
        }
        bg.innerPanel.add(p);
    }
}
