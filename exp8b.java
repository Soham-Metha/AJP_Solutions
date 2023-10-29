import java.awt.*;
import javax.swing.*;

class BackGround8b extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround8b() {
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

class exp8b {

    BackGround8b bg = new BackGround8b();
    String[] heading = {"NAME","PERCENTAGE","GRADE"};
    Object[][] tabledata = {
        {"Ajmal","75","C"},
        {"Nilesh","80","B"},
        {"Shreya","90","A"},
        {"Soham","92","A"},
        {"Siddhi","70","C"},
        {"Sania","82","B"},
        {"Kanish","84","B"},
        {"Vedant","72","C"},
        {"Sahil","78","C"},
        {"Riya","68","D"},
    };
    JTable table = new JTable(tabledata,heading);
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
    JScrollPane scrollPane = new JScrollPane(table, v, h);

    exp8b() {
        bg.innerPanel.add(scrollPane);
    }

    public static void main(String[] args) {
        new exp8b();
    }
}
