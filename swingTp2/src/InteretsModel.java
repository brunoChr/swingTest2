/**
 * 
 */

/**
 * @author b.christol
 *
 */
public class InteretsModel {

	public double calculerMontant(double capital, double taux, int duree) {
		// TODO Auto-generated method stub
				
		return Math.pow(1+taux/100.0f, duree)*capital;
	}
}
