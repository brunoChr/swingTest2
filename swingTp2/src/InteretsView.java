import javax.swing.*;

import java.awt.*;

/**
 * 
 */

/**
 * @author b.christol
 *
 */
@SuppressWarnings("serial")
public class InteretsView extends JFrame {

	private JTextField _capitalTextField = new JTextField("0.0");
	private JTextField _tauxTextField = new JTextField("0.0");
	private JSpinner _dureeSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 50, 1));
	private JLabel _montantfinalLabel = new JLabel("0.0");
	
	private JRadioButton _selectInterets = new JRadioButton();

	public InteretsView(InteretsController interetsController) {
		// TODO Auto-generated constructor stub
		
		JLabel capitalLabel = new JLabel("Capital (en Euros");
		JLabel tauxLabel = new JLabel("Taux d'intérêts (en %)");
		JLabel dureeLabel = new JLabel("Durée (en années)");
		JLabel videLabel = new JLabel();
		JLabel montantLabel = new JLabel("Montant final : ");
		JButton calculerButton = new JButton("Calculer");
		
		Container pan = this.getContentPane();
		pan.setLayout(new GridLayout(5,2));
		
		pan.add(capitalLabel);
		pan.add(_capitalTextField);
		pan.add(tauxLabel);
		pan.add(_tauxTextField);
		pan.add(dureeLabel);
		pan.add(_dureeSpinner);
		pan.add(videLabel);
		pan.add(calculerButton);
		pan.add(montantLabel);
		pan.add(_montantfinalLabel);
		
		pan.add(_selectInterets);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			} catch (InstantiationException e1) {
			e1.printStackTrace();
			} catch (IllegalAccessException e1) {
			e1.printStackTrace();	
			} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
			}
		
			SwingUtilities.updateComponentTreeUI(this);
		
		this.pack();
		
		calculerButton.addActionListener(new InteretsEvent(interetsController));
		_dureeSpinner.addChangeListener(new InteretsEventRadioButton(interetsController));
		
	}
	
	public void afficher(boolean b) {
		// TODO Auto-generated method stub
		if(b) this.setVisible(true);
		else this.setVisible(false);
	}
	
	public void afficherMontant(double montantfinal)
	{
		String montantfinalText = String.valueOf(montantfinal);
		_montantfinalLabel.setText(montantfinalText);
	}
	
	public double getCapital()
	{
		return Double.parseDouble(_capitalTextField.getText());
	}
	
	
	public double getTaux()
	{
		return Double.parseDouble(_tauxTextField.getText());
	}
	
	public int getDuree()
	{
		return Integer.parseInt(_dureeSpinner.getValue().toString());
	}
	
}
