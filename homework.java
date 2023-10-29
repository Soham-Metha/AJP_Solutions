import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class homework extends JFrame implements ActionListener
{
    Panel p = new Panel();

    JButton[] buttons = {
        new JButton("red"),
        new JButton("green"),
        new JButton("blue")
    };

    homework() {
        p.setPreferredSize(new Dimension(300,300));
        for (JButton button : buttons) {
            button.addActionListener(this);
            p.add(button);
        }
        this.add(p);
        this.setTitle("HW");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public void actionPerformed(ActionEvent ae)
    {
        System.out.println(ae.getActionCommand());
        switch(ae.getActionCommand())
        {
            case "red":
                p.setBackground(Color.RED);
                break;
            case "green":
                p.setBackground(Color.GREEN);
                break;
            case "blue":
                p.setBackground(Color.BLUE);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        new homework();
    }
}

