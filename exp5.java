import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BackGround5 extends JFrame {
    Panel outerPanel = new Panel();
    Panel innerPanel = new Panel();
    BackGround5() {
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
class exp5 {
    BackGround5 bg = new BackGround5();
    MenuShortcut ms = new MenuShortcut(KeyEvent.VK_X);
    MenuBar mb = new MenuBar();
    Menu[] menus = {
        new Menu("File"),
        new Menu("Colors")
    };
    MenuItem[][] items = {
        {
            new MenuItem("New..."),
            new MenuItem("Open..."),
            new MenuItem("Save As..."),
            new MenuItem("Exit",ms),
        },
        {
            new MenuItem("Red"),
            new MenuItem("Yellow"),
            new MenuItem("Orange"),
            new MenuItem("Blue"),
            new MenuItem("Black")
        }
    };
    exp5() {
        bg.setMenuBar(mb);
        for(int i = 0;i < menus.length ; i++)
        {
            for(int j = 0;j < items[i].length ;j++)
            {
                menus[i].add(items[i][j]);
                if (i == 0 && j == 2)
                    menus[i].addSeparator();
                if (i == 1 && j == 4)
                    menus[i].getItem(j).setEnabled(false);
            }
            mb.add(menus[i]);
        }
    }
    public static void main(String[] args) {
        new exp5();
    }
}
