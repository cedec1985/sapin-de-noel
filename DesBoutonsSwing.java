import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class DesBoutonsSwing extends JPanel {
    public DesBoutonsSwing(DessinSwing d, JFrame j){
    setBackground(Color.lightGray);
    JButton bPeindre = new JButton("nouveau");
       bPeindre.addActionListener(new GestionAction(1, d, j));
this.add(bPeindre);
JButton bModèle = new JButton ("Modèle");
bModèle.addActionListener(new GestionAction (3,d,j));
this.add(bModèle);
JButton bQuitter = new JButton("quitter");
bQuitter.addActionListener(new GestionAction(2,d,j));
this.add(bQuitter);  
    }
}
