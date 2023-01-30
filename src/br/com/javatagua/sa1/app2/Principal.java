package br.com.javatagua.sa1.app2;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciando obejetos
		CalculoBO cbo = new CalculoBO();
		
		// Retorna mensagem
		JOptionPane.showMessageDialog(null, cbo.resultado());
		
	}

}
