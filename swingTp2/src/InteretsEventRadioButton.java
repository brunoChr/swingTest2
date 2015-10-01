import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * 
 */

/**
 * @author b.christol
 *
 */

public class InteretsEventRadioButton implements ChangeListener {

	private InteretsController _interetsController;
		
		public InteretsEventRadioButton(InteretsController _interetsController) {
			// TODO Auto-generated constructor stub
			this._interetsController = _interetsController;
		}

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Valeurs change...");
			_interetsController.boutonCalculer();
		}
}
