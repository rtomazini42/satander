package banco;

public class main {

	public static void main(String[] args) {
		//testes aqui
		Conta conta1 = new Conta();
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
	}

}
