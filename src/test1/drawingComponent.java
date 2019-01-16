package test1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class drawingComponent extends JComponent {
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.RED);
		g2d.draw3DRect(50, 50, 150, 100, true);
		g2d.drawString("hello world", 60, 100);
		
		g2d.drawOval(100,10,60,60);//»­ÍÖÔ²
		g2d.setColor(Color.cyan);
		g2d.fillOval(100,10,60,60);//Í¿Ô²¿é
	}
}
