import java.awt.*;
import javax.swing.*;
class BackGround2 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround2() {
        JLabel BGimg = new JLabel(new ImageIcon("img.png"));
		BGimg.setBounds(50,25,400,400);
        outerPanel.setLayout(null);
		outerPanel.setBackground(new Color(41,45,62,255));
        outerPanel.setSize(new Dimension(500,500));
        outerPanel.setBounds(0, 0, 500, 500);
        innerPanel.setBounds(50,25,300,400);
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
class exp2 {
    public static void main(String[] args) {
        BackGround2 bg = new BackGround2();
        Panel p = new Panel();
        List[] lists = { new List(4), new List(4,true), new List(5), new List(5,true) };
        String[][] ListContents = {
            { "Summer","Winter","Monsoon"},
            { "Maths" ,"Chemistry" ,"Physics" ,"c++" ,"java","python"},
            { "Pune" ,"Mumbai" ,"Kanpur" ,"Delhi" ,"Kolkata" ,"Hydrabad" ,"Banglore" ,"Nashik" ,"Satara" ,"Dhule"},
            { "Indian Express" ,"Times of India" ,"Hindustan Times"}
        };
        for(int i = 0; i < lists.length;i++) {
            for (int j = 0 ; j < ListContents[i].length;j++)
                lists[i].add(ListContents[i][j]);
            p.add(lists[i]);
        }
        String choices[] = {"Gujarat" ,"Maharastra" ,"Rajasthan" ,"Manipur","Uttrakhand"};
        Choice c1 = new Choice();
        for (String str : choices) 
            c1.add(str);
        p.add(c1);
        bg.innerPanel.add(p);
    }
}