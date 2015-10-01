/**
 * 
 */

/**
 * @author b.christol
 *
 */

public class InteretsController {

	private InteretsView _interetsView;
	private InteretsModel _interetsModel;
	
	public InteretsController() {
		// TODO Auto-generated constructor stub
		_interetsView = new InteretsView(this);
		_interetsModel = new InteretsModel();
	}
	
	public void start() {
		// TODO Auto-generated method stub
		_interetsView.afficher(true);
	}
	
	public void boutonCalculer() {
		// TODO Auto-generated method stub
		System.out.println("On calcul ...");
		_interetsView.afficherMontant(_interetsModel.calculerMontant(_interetsView.getCapital(), _interetsView.getTaux(), _interetsView.getDuree()));
	}
}
