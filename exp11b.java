import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGround11b extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround11b() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		//outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(10,10,480,480);
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

class exp11b implements MouseMotionListener {
    BackGround11b bg = new BackGround11b();
    Graphics g = bg.outerPanel.getGraphics();
    Label l1 = new Label(),l2 = new Label();
    exp11b() {
        l1.setBounds(5, 10, 125, 10);
        l2.setBounds(5, 22, 125, 10);
        bg.outerPanel.add(l1);
        bg.outerPanel.add(l2);
        bg.outerPanel.addMouseMotionListener(this);
        bg.outerPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me){
                switch(me.getClickCount()) {
                    case 1:
                        g.setColor(Color.CYAN);
                        break;
                    case 2:
                        g.setColor(Color.GREEN);
                        break;
                    case 3:
                        g.setColor(Color.RED);
                        break;
                }
                l2.setText(" ClickCount : "+me.getClickCount());
            }
        });
    }    
    public void mouseMoved(MouseEvent me) {
        l1.setText(" X : "+me.getX()+" Y : "+me.getY());
    }
    public void mouseDragged(MouseEvent me) {
        g.fillOval(me.getX(),me.getY(),20,20);
    }
    public static void main(String[] args) {
        new exp11b();
    }
}