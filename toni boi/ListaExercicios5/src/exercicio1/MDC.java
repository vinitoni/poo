package exercicio1;

public class MDC implements IOperacaoInteira{
	
	public int executar(int valora, int valorb) {
		int resto;
		  
	    while(valorb != 0){
	      resto = valora % valorb;
	      valora = valorb;
	      valorb = resto;
	    }
	  
	    return valora;
	}
}
