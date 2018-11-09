package banco;

public class main {

	public static void main(String[] args) {
		//testes aqui
		Conta conta1 = new Conta();
		conta1.setNome("Ronan");
		Conta conta2 = new Conta();
		conta2.creditar(815.30);
		conta2.renderJuros(1.2);
		System.out.println(conta1.getSaldo());
		conta1.creditar(20.30);
		System.out.println(conta1.getSaldo());
		conta1.sacar(5.10);
		System.out.println(conta1.getSaldo());
		conta1.renderJuros(1.07);
		System.out.println(conta1.getSaldo());
		System.out.println(conta1.getAgencia());
		conta1.sacar(90.10);
		System.out.println(conta1.getSaldo());
		conta2.transferir(conta1, 300);
		System.out.println(conta2.getSaldo());
		conta2.transferir(conta1, 1200);
	}

}
