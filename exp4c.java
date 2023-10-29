import java.awt.*;
import javax.swing.*;
class BackGround4c extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround4c() {
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
class exp4c {
    BackGround4c bg = new BackGround4c();
    Panel p = new Panel();
    GridBagConstraints gbc = new GridBagConstraints();
    exp4c() {

        p.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add_item(new Label("Name"),gbc,0,0,1,1,0,0);
        add_item(new TextField(10),gbc,1,0,1,1,0,20);
        add_item(new Label("Comments"),gbc,0,1,1,1,0,0);
        add_item(new TextArea(6,15),gbc,1,1,1,1,0,60);
        add_item(new Button("Submit"),gbc,0,2,2,1,0,20);

        bg.innerPanel.add(p);
    }
    
    void add_item(Component c,GridBagConstraints gbc,int x, int y, int w,int h,int wx, int wy)
    {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gbc.weightx = wx;
        gbc.weighty = wy;
        p.add(c,gbc);
    }
    public static void main(String[] args) {
        new exp4c();
    }
}
