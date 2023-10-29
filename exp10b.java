import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGround10b extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround10b() {
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

class exp10b implements KeyListener {
    BackGround10b bg = new BackGround10b();
    Label l1 = new Label();
    exp10b() {
        bg.innerPanel.add(l1);
        bg.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke) {
        switch(ke.getKeyCode()) {
            case KeyEvent.VK_F1: 
            case KeyEvent.VK_F2: 
            case KeyEvent.VK_F3: 
            case KeyEvent.VK_F4: 
            case KeyEvent.VK_F5: 
                l1.setText("Function Key Pressed");
                break;
            case KeyEvent.VK_UP: 
            case KeyEvent.VK_DOWN: 
            case KeyEvent.VK_LEFT: 
            case KeyEvent.VK_RIGHT: 
                l1.setText("Arrow Key Pressed");
                break;

        }
    }
    public void keyTyped(KeyEvent ke) { }
    public void keyReleased(KeyEvent ke) { }
    public static void main(String[] args) {
        new exp10b();
    }
}