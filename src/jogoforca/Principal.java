package jogoforca;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {
		
		Forca f = new Forca();
		String palavraSorteada = f.getPalavraSorteada();
		StringBuilder palavraSecreta = new StringBuilder();
		for(int i = 0; i < palavraSorteada.length(); i++) {
			palavraSecreta.append("-");
		}
		
		JTextArea jt;		
		while(palavraSecreta.toString().contains("-") && f.getQtdErros() < 6) {
			
			jt = new JTextArea(10, 10);
			jt.setFont(new Font("Monoespaced", Font.BOLD, 20));
			jt.append(f.getForca());
			jt.append("\n\n" + palavraSecreta.toString());
			
			char letra = JOptionPane.showInputDialog(null,jt).charAt(0);
			
			if(palavraSorteada.contains(Character.toString(letra))) {
				
				StringBuilder palavraSecretaTemp = new StringBuilder();
				
				for(int j = 0; j < palavraSorteada.length(); j++) {
					if(palavraSorteada.charAt(j) == letra) {
						palavraSecretaTemp.append(letra);
					}else {
						palavraSecretaTemp.append(palavraSecreta.charAt(j));
					}					
				}
				palavraSecreta = new StringBuilder(palavraSecretaTemp.toString());
				
			}else {
				f.incrementaQtdErros();
			}
			
		}
		
		System.out.println(f.getQtdErros());
		String msg;
		if(f.getQtdErros() == 6) {
			msg = "YOU LOSE!\n\nA palavra era: "+palavraSorteada;			
		}else {
			msg = "YOU WIN!\n\nA palavra secreta: "+palavraSorteada;
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
