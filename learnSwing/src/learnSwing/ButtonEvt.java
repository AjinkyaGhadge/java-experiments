package learnSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvt implements ActionListener{
	private String message;
	public ButtonEvt (String message) {
		this.message = message;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(message);
	}
	
}
