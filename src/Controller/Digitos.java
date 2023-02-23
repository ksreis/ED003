package Controller;

public class Digitos {
	public Digitos() {
	super();
	}
	    public static int contDig(int n) {
	        // condição de parada
	        if (n / 10 == 0) {
	            return 1;
	        }
	        // é somado 1 ao resultado, aplicado ao quociente da divisão de N por 10
	        else {
	            return 1 + contDig(n / 10);
	        }
	    }
	}	
