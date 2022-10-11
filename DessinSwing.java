import java.awt.*;
import javax.swing.*;

    public class DessinSwing extends JPanel{
        private Color couleur = Color.green;
        public final static Color Couleurfond = Color.white;
        private Arbre A;
        public DessinSwing(){
        setBackground(Couleurfond);
        setForeground(couleur);
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        A = new Arbre(8,Color.yellow);}
        public void nouveau (){
    A =new Arbre (6,Color.red);
    repaint();
    }
public void paintComponent(Graphics g){
    super.paintComponent(g);
    A.dessine(g);

}
}
