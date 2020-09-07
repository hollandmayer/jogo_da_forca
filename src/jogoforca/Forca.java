package jogoforca;

import java.util.Random;

public class Forca {
	
	private String[] palavras = {"abacate", "gengibrina", "eucalipto", "gatorade", "antuerpia"};
	private int qtdErros;
	private String palavraSorteada;
	
	public Forca() {
		Random r = new Random();
		palavraSorteada = palavras[r.nextInt(5)];
	}
	
	public String getPalavraSorteada() {
		return this.palavraSorteada;
	}
	
	public int getQtdErros() {
		return this.qtdErros;
	}
	
	public void incrementaQtdErros() {
		this.qtdErros++;
	}
	
	public String getForca() {
		
		String forca = " ___   \n"
				     + "|      \n"
				     + "|      \n"
				     + "|      \n"
				     + "|      \n"
				     + "|______\n"
				     + "\nInforme uma letra ";
		
		switch(qtdErros) {
			
			case 1 : forca = " ___   \n"
					       + "|   O  \n"
					       + "|      \n"
					       + "|      \n"
					       + "|      \n"
					       + "|______\n"
					     + "\nInforme uma letra ";
					 break;
			case 2 : forca = " ___   \n"
					       + "|   O  \n"
					       + "|   |  \n"
					       + "|      \n"
					       + "|      \n"
					       + "|______\n"
					       + "\nInforme uma letra ";
				     break;
			case 3 : forca = " ___   \n"
					       + "|   O  \n"
					       + "|  ||  \n"
					       + "|      \n"
					       + "|      \n"
					       + "|______\n"
					       + "\nInforme uma letra ";
			 	     break;
			case 4 : forca = " ___   \n"
					       + "|   O  \n"
					       + "|  ||| \n"
					       + "|      \n"
					       + "|      \n"
					       + "|______\n"
					     + "\nInforme uma letra ";
		 		     break;
			case 5 : forca = " ___   \n"
					       + "|   O  \n"
					       + "|  ||| \n"
					       + "|  _|  \n"
					       + "|      \n"
					       + "|______\n"
					     + "\nInforme uma letra ";
	 			     break;
			case 6 : forca = " ___   \n"
					       + "|   O  \n"
					       + "|  ||| \n"
					       + "|  _|_ \n"
					       + "|      \n"
					       + "|______\n"
					       + "\nInforme uma letra ";
					 break;
		}
		
		return forca;
	}
	
	

}
