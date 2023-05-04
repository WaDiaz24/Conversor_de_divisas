package Ventanas;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Principal frame = new Ventana_Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 442);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(new ImagenFondo());
		getContentPane().setLayout(null);

		JLabel labelTitle = new JLabel("Conversor de Divisas");
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 32));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(10, 33, 364, 65);
		getContentPane().add(labelTitle);

		JButton buttonIrConversor = new JButton("Ir al Conversor");
		buttonIrConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logica clasePr = new Logica();
				clasePr.menuOpciones();
			}
		});
		buttonIrConversor.setFont(new Font("Tahoma", Font.BOLD, 24));
		buttonIrConversor.setBounds(84, 136, 225, 37);
		buttonIrConversor.setFocusPainted(false);
		getContentPane().add(buttonIrConversor);

	}

	public class ImagenFondo extends JPanel {

		public void paint(Graphics g) {
			ImageIcon imagen = new ImageIcon(getClass().getResource("/img/fondodivisas.jpg"));
			g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);

			setOpaque(false);
			super.paint(g);
		}
	}

}
