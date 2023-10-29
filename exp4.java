import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BackGround4 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround4() {
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
class exp4 implements ActionListener {
    CardLayout card = new CardLayout(40,30);
    BackGround4 bg = new BackGround4();
    Checkbox c[] = {
        new Checkbox("Windows 7"),
        new Checkbox("Windows 10"),
        new Checkbox("Linux"),
        new Checkbox("UNIX")
    };
    Panel panels[] = {
        new Panel(), 
        new Panel(),
        new Panel(),
        new Panel()
    };
    Button b[] = {
        new Button("Windows"),
        new Button("Other")
    };
    exp4() {
        b[0].addActionListener(this);
        b[1].addActionListener(this);
        panels[3].setSize(200, 100);
        panels[3].setLayout(card);
        panels[2].add(c[3]);
        panels[2].add(c[2]);
        panels[1].add(c[1]);
        panels[1].add(c[0]);
        panels[0].add(b[0]);
        panels[0].add(b[1]);
        panels[3].add(panels[1],"Windows");
        panels[3].add(panels[2],"Other");
        panels[0].add(panels[3]);
        bg.innerPanel.add(panels[0]);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b[0])
            card.show(panels[3],"Windows");
        else
            card.show(panels[3],"Other");
    }
    public static void main(String[] args) {
        new exp4();
    }
}
