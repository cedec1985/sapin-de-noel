import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class GestionAction implements ActionListener{
    private int n;
    private DessinSwing d;
    private static int modèle = 0;
    private JFrame j;
    public GestionAction(int n, DessinSwing d, JFrame j){
        this.n=n;
        this.d=d;
        this.j=j;
    }
public void actionPerformed(ActionEvent e){
switch(n){
case 1: d.nouveau();
break;
case 2: System.exit(0);
break;
case 3: gestionModèle();
break;
}
}
private void gestionModèle(){
    String LAndF ="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    try{
switch(modèle){
    case 0: LAndF="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
System.out.println("modèle motif");
break;
case 1: LAndF = "javax.swing.plaf.metal.MetalLookAndFeel";
System.out.println("modèle métal");
break;
case 2: LAndF = "javax.swing.plaf.mac.MacLookAndFeel";
System.out.println("modèle mac");
break;
case 3: LAndF = "javax.swing.plaf.windows.WindowsLookAndFeel";
System.out.println("modèle windows");
break;
}
UIManager.setLookAndFeel(LAndF);
SwingUtilities.updateComponentTreeUI(j);
}
catch (UnsupportedLookAndFeelException ex){
    System.out.println("exception : modèle non disponible");   
}
catch(IllegalAccessException ex){
    System.out.println("exception : modèle non accessible");   
}
catch(ClassNotFoundException ex){
    System.out.println("exception : modèle non trouvé");   
}
catch(InstantiationException ex){
    System.out.println("exception : modèle non instanciable");   
}
catch(Exception ex){
    System.out.println("exception : erreur d'exécution");   
}
modèle ++;
modèle=modèle %4;
}}



