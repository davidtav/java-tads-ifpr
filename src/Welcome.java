import javax.swing.JOptionPane; // importação da classe JOptionPane do pacote javax.swing utilizado com JDK 1.3 / J2SE 1.3
public class Welcome{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(
			null, "aprendendo Java com o livro \n 'Java como Programar'"
		);
		System.exit(0);
	}
}