import javax.swing.JOptionPane; // importação da classe JOptionPane do pacote javax.swing utilizado com JDK 1.3 / J2SE 1.3

public class Soma{
	public static void main(String[] args){
		String firstNumber, secondNumber;
		int number1;
		int number2;
		int sum;
		
		firstNumber = JOptionPane.showInputDialog("digite o primeiro número");
		secondNumber = JOptionPane.showInputDialog("digite o segundo número");
		
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		sum = number1 + number2;
		
		JOptionPane.showMessageDialog(
			 null,"a soma de " + number1 + " + " + number2 + " é igual a: " + sum
		);
		System.exit(0);
	}
	
	
}