package banco;

public class ContaPoupanca extends ContaAbstrata{

	
	public void renderJuros() {
		double novoValor;
		novoValor = getSaldo() * 0.02;
		creditar(novoValor);
		System.out.println("A implementar");
	}
	


}
