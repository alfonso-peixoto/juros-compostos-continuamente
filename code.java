import javax.swing.JOptionPane;
import static java.lang.Math.*;
public class CapitalizacaoContinua {
	public static void main (String[] args) {
		double P, j, t, r, Ai, A, L, Lp;
		
		JOptionPane.showMessageDialog(null, "Cálculo do montante de capitalização contínua", "Seja bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
		
		P = Float.parseFloat(JOptionPane.showInputDialog("Digite o investimento inicial."));
		j = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros em percentagem."));
		t = Float.parseFloat(JOptionPane.showInputDialog("Digite o período de tempo em anos da aplicação."));
		
		r = j / 100;
		
		Ai = P * pow (E, r * t);
		
		A = round(Ai * 100) / 100;
		
		L = round((A - P) * 100) / 100;
		
		Lp = round(100 * L / P) * 100 / 100;
		
		JOptionPane.showMessageDialog(null, "O montante do investimento de " + P + " a uma taxa de " + j + "% após " + t + " ano(s) é igual a " + A + " (lucro de " + L + ", ou seja, " + Lp + "%).", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
