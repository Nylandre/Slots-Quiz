/*
 * @author Hazal Buruk
 * @date 27/04/2015
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SlotsButton extends JButton {
	
	// constructors
	public SlotsButton(String label) {
	    super(label);

	    setPreferredSize(new Dimension(100, 100));
	    setContentAreaFilled(false);
	  }

	// methods
	public void paintComponent(Graphics g) {
	    if (getModel().isArmed()) {
	      g.setColor(Color.lightGray);
	    } else {
	      g.setColor(getBackground());
	    }
	    g.fillOval(0, 0, 100, 
	      100);
	    super.paintComponent(g);
	  }

	public void paintBorder(Graphics g) {
	    g.setColor(getForeground());
	    g.drawOval(0, 0, 100, 
	      100);
	  }
	// contains method
	Shape shape;
	public boolean contains(int x, int y) {
	
	    if (shape == null || 
	      !shape.getBounds().equals(getBounds())) {
	      shape = new Ellipse2D.Float(0, 0, 100, 100);
	    }
	    return shape.contains(x, y);
	  }
}
