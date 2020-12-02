package gsb.vue;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JIFOffrir extends JInternalFrame implements ActionListener {

	private JPanel p;
	private JLabel JCodeVisiteur;
	private JTextField JRemplirCodeVisiteur;
	private JLabel JCodeMedicament;
	private JTextField JRemplirCodeMedicament;
	private JLabel JQte;
	private JTextField JRemplirQte;
	private JButton boutonAjouter;
	
	private JScrollPane scroll; 

	/**
	 * Create the frame. 
	 */
	public JIFOffrir(MenuPrincipal uneFenetreContainer) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		p = new JPanel();
		
		boutonAjouter = new JButton("Ajouter Quantité");
		
		JCodeVisiteur = new JLabel("Code Visiteur : ");
		JRemplirCodeVisiteur = new JTextField();
		JRemplirCodeVisiteur.setColumns(10);
		
		JCodeMedicament = new JLabel("Code Medicament : ");
		JRemplirCodeMedicament = new JTextField();
		JRemplirCodeMedicament.setColumns(10);
		
		JQte = new JLabel("Code Visiteur : ");
		JRemplirQte = new JTextField();
		JRemplirQte.setColumns(10);
		
		
		p.add(boutonAjouter);
		p.add(JCodeVisiteur);
		p.add(JRemplirCodeVisiteur);
		p.add(JCodeMedicament);
		p.add(JRemplirCodeMedicament);
		p.add(JQte);
		p.add(JRemplirQte);
		
		Container contentPane = getContentPane();
		contentPane.add(p);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
