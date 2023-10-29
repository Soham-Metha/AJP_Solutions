import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGround9a extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround9a() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(75,25,250,350);
        BGimg.add(innerPanel);
		outerPanel.add(BGimg);
        this.setTitle("AJP Experiments");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(outerPanel);
    }
}

class exp9a {

    int min = 0, max = 100, loadProgress = min;
    BackGround9a bg = new BackGround9a();
    JProgressBar MyBar = new JProgressBar(min, max);
    Button b = new Button("Load faster!!");

    exp9a() {
        b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                SetBarVal();
			} 
        });
        MyBar.setStringPainted(true);
        bg.innerPanel.add(MyBar);
        bg.innerPanel.add(b);
        progress();
    }

    void progress() {
        while ( SetBarVal() ) {
            try{ Thread.sleep(loadProgress*25); } catch(Exception e) {}
        }
    }

    boolean SetBarVal() {
        if ( loadProgress <= max ) {
            MyBar.setValue( loadProgress++ );
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        new exp9a();
    }
}
