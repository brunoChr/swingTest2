import java.awt.event.*;

/**
 * 
 */

/**
 * @author b.christol
 *
 */

public class InteretsEvent implements ActionListener {

	private InteretsController _interetsController;
	
	public InteretsEvent(InteretsController _interetsController) {
		// TODO Auto-generated constructor stub
		this._interetsController = _interetsController;
	}
	
	@Override
	public void actionPerformed(ActionEvent es) {
		// TODO Auto-generated method stub
		System.out.println("Bouton cliquer ...");
		_interetsController.boutonCalculer();
	}
	
	
	
	
}
