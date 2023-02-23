package View;
import Controller.Digitos;

public class Principal {

	public static void main(String[] args) {
        int n = 963854712;
        int qtdeDigitos = Digitos.contDig(n);
        
        System.out.println("O número " + n + " possui " + qtdeDigitos + " dígitos.");
    }
}

