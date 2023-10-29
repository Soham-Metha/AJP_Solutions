import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGround11 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround11() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(10,10,380,380);
        innerPanel.setLayout(new GridLayout(10, 1));
        BGimg.add(innerPanel);
		//outerPanel.add(BGimg);
        this.setTitle("AJP Experiments");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(outerPanel);
    }
}

class exp11 implements MouseListener {
    BackGround11 bg = new BackGround11();
    exp11() {
        bg.outerPanel.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        bg.outerPanel.setBackground(Color.MAGENTA);
    }
    public void mousePressed(MouseEvent me)
    {
        bg.outerPanel.setBackground(Color.RED);

    }
    public void mouseReleased(MouseEvent me)
    {
        bg.outerPanel.setBackground(Color.CYAN);

    }
    public void mouseEntered(MouseEvent me)
    {
        bg.outerPanel.setBackground(Color.WHITE);

    }
    public void mouseExited(MouseEvent me)
    {
        bg.outerPanel.setBackground(new Color(41,45,62,255));
    }
    public static void main(String[] args) {
        new exp11();
    }
}