import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener{
	
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	
	//Construtor da Classe
	public Tela(){
		
		setTitle("Interface Gráfica"); //Para dar titulo a pagina
		setSize(390, 471); //Definido as dimensoes da tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para a tela poder ser desligada
		setResizable(false); //Serve para o usuario não poder alterar as dimensões
		setLocationRelativeTo(null); //Serve para a tela aparecer no meio da tela
		setLayout(null); //Reinicia o Layout
	
		
		/*************************JButton's*************************/
		JButton botao1 = new JButton("Calcular");
		botao1.setBounds(70, 357, 254, 65); //setBounds(x, y, width, height)
		botao1.setFont(new Font("Arial", Font.BOLD, 20/*Tamanho da fonte*/)); 
		botao1.setForeground(new Color(14, 65, 197)); //Define a cor da fonte
		botao1.setBackground(new Color(9, 10, 9)); //Define a cor do Background
		add(botao1);
		botao1.addActionListener(this); //Serve para o botão usar o metodo actionPerformed()		
		/***********************************************************/
		
		
		/************************JTextFields************************/
		num1.setBounds(195, 153, 129, 44);
		num1.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
		add(num1);
		
		num2.setBounds(195, 250, 129, 44);
		num2.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
		add(num2);
		/***********************************************************/
		
		
		/**************************JLabels**************************/
		JLabel titulo = new JLabel();
		titulo.setText("Soma de Números");
		titulo.setBounds(90, 36, 220, 29);
		titulo.setFont(new Font("Arial", Font.BOLD, 24));
		add(titulo);
		
		JLabel descricao1 = new JLabel();
		descricao1.setText("Numero 1:");
		descricao1.setBounds(70, 163, 112, 24);
		descricao1.setFont(new Font("Arial", Font.BOLD, 18));
		add(descricao1);
		
		JLabel descricao2 = new JLabel();
		descricao2.setText("Numero 2:");
		descricao2.setBounds(70, 260, 112, 24);
		descricao2.setFont(new Font("Arial", Font.BOLD, 18));
		add(descricao2);
		/***********************************************************/
		
		setVisible(true); //Para deixar a tela visivel
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer numero1 = Integer.parseInt(num1.getText());
		Integer numero2 = Integer.parseInt(num2.getText());
		
		Integer soma = numero1 + numero2;	
		
		JOptionPane.showMessageDialog(null, "A soma dos números é " + soma, 
				"Calculadora", JOptionPane.INFORMATION_MESSAGE);
	}

}
