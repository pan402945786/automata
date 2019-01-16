package test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class HandleControlButton implements ActionListener {
	private int buttonID;
	
	public HandleControlButton(int buttonID) {
		this.buttonID =  buttonID;
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE); 
//		drawingComponent dc = new drawingComponent();
//		getContentPane.add(dc);
	}
}
