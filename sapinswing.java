import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.WindowListener;

public class sapinswing {
    public final static int HT = 300;
    public final static int LG = 300;
    public final static int X = 150;
    public final static int Y = 200;

    public static void main(String [] args){
        JFrame F = new JFrame("un sapin swing");
        F.setSize(HT,LG);
        F.getContentPane().add(new DessinSwing());
        F.setVisible(true);
        DessinSwing page = new DessinSwing();
        F.setBounds(X,Y,HT,LG);
        F.setBackground(Color.darkGray);
        F.getContentPane().add(page,"Center");
        F.addWindowListener(GestionFenetre());
        F.getContentPane().add(new DesBoutonsSwing(page, F),"South");
        F.setVisible(true);

    }

    private static WindowListener GestionFenetre() {
        return null;
    }
}
