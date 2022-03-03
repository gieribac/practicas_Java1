
package colorapplet;
 import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ColorApplet extends Applet implements AdjustmentListener {

 Scrollbar s;
  Scrollbar j;
   Scrollbar y;
 int barra = 0;
 int barra2 = 0;
 int barra3 = 0;
       
 public ColorApplet() {
     
 s = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
  j = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
   y = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
   add(s);
    s.addAdjustmentListener(this);
    add(j);
    j.addAdjustmentListener(this);
   add(y);
    y.addAdjustmentListener(this);
 }

 public void adjustmentValueChanged(AdjustmentEvent ae) {
 barra = s.getValue();
   barra2=j.getValue();;
  barra3 = y.getValue();;
 repaint();
 }
  public void paint(Graphics g) {
   Color valor;
     valor= new Color(barra, barra2, barra3);
  
       g.drawRect(0,0, 1500, 2000);
      g.setColor  (valor) ;
      g.fillRect(0,0,1500,2000);

 }
}

