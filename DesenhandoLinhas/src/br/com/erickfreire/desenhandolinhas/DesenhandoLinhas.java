package br.com.erickfreire.desenhandolinhas;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhandoLinhas extends JPanel {
	
	public void paintComponent(Graphics g) 
	{
		int largura = getWidth();
		int altura = getHeight();
		int contador = 1;
		int passos = 0;

		while (altura - passos >= 0) {

            g.drawLine(0, 0, passos, altura - passos);
			
			//canto inferior direito
			g.drawLine(largura, altura, passos, altura - passos);
			
			//canto superior direito
			g.drawLine(largura, 0, passos, passos);
			
		    //canto inferior esquerdo
			g.drawLine(0, altura, passos, passos);
			
			passos = passos + 15;

		}
	}

}
