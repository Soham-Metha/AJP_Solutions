import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGround6 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround6() {
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
class exp6 implements ItemListener {
    BackGround6 bg = new BackGround6();
    Panel p = new Panel();
    JComboBox c1;
    JLabel l1;
    String[] items = {
        "Mumbai",
        "Pune",
        "Solapur",
        "Banglore"
    };
    exp6()
    {
        c1=new JComboBox(items);
        c1.setSelectedIndex(0);
        l1=new JLabel("you are in "+c1.getSelectedItem());
        c1.addItemListener(this);
        p.add(c1);
        p.add(l1);
        bg.innerPanel.add(p);
    } 
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==c1)
        {
            l1.setText("you are in "+c1.getSelectedItem());
        }
    }
    public static void main(String[] args) {
        new exp6();
    }
}
