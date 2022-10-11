import java.awt.*;
public class Triangle {
    private int centreX =fenetreswing.LG/2;
    private int centreY = fenetreswing.HT/2;
    private int []xPoints ={centreX,centreX+10, centreX-10};
    private int []yPoints ={centreY -10, centreY+10, centreY+10};
    int nPoints =3;
    public Triangle(int i, int j, Graphics g, Color decoration){
        g.fillPolygon(xPoints,yPoints,nPoints);
    }
}
