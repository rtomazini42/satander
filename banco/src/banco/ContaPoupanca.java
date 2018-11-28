package banco;

public class ContaPoupanca extends ContaAbstrata{

	
	public ContaPoupanca(int numero){
		this.numero = numero;
	}
	
	
	public void renderJuros() {
		double novoValor;
		novoValor = getSaldo() * 0.02;
		creditar(novoValor);
		System.out.println("A implementar");
	}
	


}
