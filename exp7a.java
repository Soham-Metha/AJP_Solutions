import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
class BackGround7a extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround7a() {
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
class exp7a {
    Panel p = new Panel();
    BackGround7a bg = new BackGround7a();
    JTree tr;
    DefaultMutableTreeNode root = new DefaultMutableTreeNode();
    DefaultMutableTreeNode[] mainNodes = {
        new DefaultMutableTreeNode("A"),
        new DefaultMutableTreeNode("B")
    };
    DefaultMutableTreeNode[][] subNodes = {
        {
            new DefaultMutableTreeNode("A1"),
            new DefaultMutableTreeNode("A2"),
        },{
            new DefaultMutableTreeNode("B1"),
        },
    };
    exp7a()
    {
        for(int i = 0;i < mainNodes.length ;i++)
        {
            for(int j = 0;j < subNodes[i].length ;j++)
            {
                mainNodes[i].add(subNodes[i][j]);
            }
            root.add(mainNodes[i]);
        }
        tr = new JTree(root);
        p.add(tr);
        bg.innerPanel.add(p);
    }
    public static void main(String[] args) {
        new exp7a();
    }
}
