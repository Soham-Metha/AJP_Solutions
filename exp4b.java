import java.awt.*;
import javax.swing.*;
class BackGround4b extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround4b() {
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
class exp4b {
    BackGround4b bg = new BackGround4b();
    Panel p = new Panel();
    GridBagConstraints gbc = new GridBagConstraints();
    exp4b() {
        p.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 75;
        gbc.ipady = 50;
        gbc.gridx = 0;
        gbc.gridy = 0;
        p.add(new Button("Button 1"),gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        p.add(new Button("Button 2"),gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        p.add(new Button("Button 3"),gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        p.add(new Button("Button 4"),gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        p.add(new Button("Button 5"),gbc);

        bg.innerPanel.add(p);
    }
    public static void main(String[] args) {
        new exp4b();
    }
}
