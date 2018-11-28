package banco;

public class main {

	public static void main(String[] args) {
		//testes aqui
		ContaCorrente conta1 = new ContaCorrente(133);
		conta1.setNome("Ronan");
		ContaCorrente conta2 = new ContaCorrente(133);
		conta2.creditar(815.30);
		System.out.println(conta1.getSaldo());
		conta1.creditar(20.30);
		System.out.println(conta1.getSaldo());
		conta1.sacar(5.10);
		System.out.println(conta1.getSaldo());
		System.out.println(conta1.getSaldo());
		conta1.sacar(90.10);
		System.out.println(conta1.getSaldo());
		conta2.transferir(conta1, 300);
		System.out.println(conta2.getSaldo());
		conta2.transferir(conta1, 1200);
		System.out.println(conta1.getAgencia());
		ContaPoupanca conta3 = new ContaPoupanca(234);
		System.out.println(conta1.getNumero());
		System.out.println(conta2.getNumero());
		System.out.println(conta3.getNumero());
		conta3.creditar(30);
		conta3.renderJuros();
		System.out.println(conta3.getSaldo());
		System.out.println(ContaCorrente.getQuantidade());
	}

}
