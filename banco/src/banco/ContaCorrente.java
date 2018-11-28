package banco;


public class ContaCorrente extends ContaAbstrata{

	private static int quantidade;
	
	public static int getQuantidade() {
		return quantidade;
	}

	
			
	public ContaCorrente(int numero){
		this.numero = numero;
		ContaCorrente.quantidade++;
		System.out.println("conta numero" + numero);
	}
	
	
	public void transferir(ContaCorrente contaDestino, double valor) {
		if (sacar(valor) == true){
			System.out.println("Transferindo para " + contaDestino.getNome());
			contaDestino.creditar(valor);
		}else{
			System.out.println("Não tem saldo para transferencia ");
		}
			
	}
		

		
		
	

}
