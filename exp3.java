import java.awt.*;
import javax.swing.*;
class BackGround3 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround3() {
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
class exp3 {
    public static void main(String[] args) {
        BackGround3 bg = new BackGround3();
        bg.innerPanel.add(new exp3().PQ1());
    }
    Panel PQ1() {
        Panel p = new Panel();
        p.setLayout(new GridLayout(5, 5));
        for(int i = 0; i<5;i++)
            for(int j=0;j<5;j++)
                p.add(new Button(""+(i+1)+" : "+(j+1)));
        return p;
    }
    Panel PQ2() {
        Panel p = new Panel();
        int c = 1;
        p.setLayout(new GridLayout(3, 3));
        for(int i = 0; i<3;i++)
            for(int j=0;j<3;j++) {
                p.add(new Button("Button : "+ c));
                c++;
            }
        return p;
    }
    Panel EX1() {
        Panel p = new Panel();
        int c = 1;
        p.setLayout(new GridLayout(3, 2));
        for(int i = 0; i<3;i++)
            for(int j=0;j<2;j++) {
                if(c!=6)
                    p.add(new Button("Button : "+ c));
                c++;
            }
        return p;
    }
    Panel EX2() {
        Panel p = new Panel();
        p.setLayout(new BorderLayout(10, 10));
        p.add(new Button("North"),BorderLayout.NORTH);
        p.add(new Button("South"),BorderLayout.SOUTH);
        p.add(new Button("East"),BorderLayout.EAST);
        p.add(new Button("West"),BorderLayout.WEST);
        p.add(new Button("Center"),BorderLayout.CENTER);
        return p;
    }
}
