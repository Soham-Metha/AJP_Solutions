import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGround10a extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround10a() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(50,25,300,350);
        innerPanel.setLayout(new GridLayout(10, 1));
        BGimg.add(innerPanel);
		outerPanel.add(BGimg);
        this.setTitle("AJP Experiments");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(outerPanel);
    }
}

class exp10a implements KeyListener {
    BackGround10a bg = new BackGround10a();
    Label l1 = new Label();
    exp10a() {
        bg.innerPanel.add(l1);
        bg.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        l1.setText("Key Pressed ");
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }
    public void keyReleased(KeyEvent ke)
    {
        
    }
    public static void main(String[] args) {
        new exp10a();
    }
}