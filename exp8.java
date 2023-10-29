import java.awt.*;
import javax.swing.*;

class BackGround8 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround8() {
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

class exp8 {

    BackGround8 bg = new BackGround8();
    String[] heading = {"ID","NAME","SALARY"};
    Object[][] tabledata = {
        {"101","Amit","670000"},
        {"102","Jai","780000"},
        {"103","Sachin","700000"},
    };
    JTable table = new JTable(tabledata,heading);
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
    JScrollPane scrollPane = new JScrollPane(table, v, h);

    exp8() {
        bg.innerPanel.add(scrollPane);
    }

    public static void main(String[] args) {
        new exp8();
    }
}
