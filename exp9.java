import java.awt.*;
import javax.swing.*;

class BackGround9 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround9() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(25,25,350,350);
        BGimg.add(innerPanel);
		outerPanel.add(BGimg);
        this.setTitle("AJP Experiments");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(outerPanel);
    }
}

class exp9 {
    int min = 0, max = 100, loadProgress = min;
    BackGround9 bg = new BackGround9();
    JProgressBar MyBar = new JProgressBar( min, max );
    
    exp9() {
        MyBar.setStringPainted(true);
        bg.innerPanel.add(MyBar);
        progress();
    }

    void progress() {
        while( loadProgress<=max ) {
            MyBar.setValue( loadProgress++ );
            try{ Thread.sleep(loadProgress*25); } catch( Exception e ) {}
        }
    }

    public static void main(String[] args) {
        new exp9();
    }
}
