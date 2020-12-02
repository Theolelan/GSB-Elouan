package gsb.vue;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JIFStocker extends JInternalFrame implements ActionListener {

	private JPanel p;
	private JLabel JCode;
	private JTextField JRemplirCode;
	private JTable table;
	private String[] title= {"colonne1", "colonne2", "colonne3"};  //entete du tableau
	private Object[][] data= {                                 //données du tableau
			{"ligne1", "encore ligne1", "tjrs ligne1"},
			{"ligne2", "encore ligne2", "tjrs ligne2"}
			
	};
	private JScrollPane scroll; 

	/**
	 * Create the frame. 
	 */
	public JIFStocker(MenuPrincipal uneFenetreContainer) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		p = new JPanel();
		
		
		JCode = new JLabel("Code du visiteur");
		JRemplirCode = new JTextField();
		JRemplirCode.setColumns(10);
		
		table= new JTable(data, title);   //initialiser le tableau
		scroll= new JScrollPane(table);
		
		p.add(JCode);
		p.add(JRemplirCode);
		
		Container contentPane = getContentPane();
		contentPane.add(p);
		
		p.add(scroll);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
