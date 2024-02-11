
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

        cc = Math.floor(n * 100) / 100;
        
        if (cc == 0.00) {System.out.println("=== ERRO ==="+"\n"+"Valor de deposito não pode ser 0!");return;}
        else if (cc < 0.00) {System.out.println("=== ERRO ==="+"\n"+"Valor de deposito não pode ser negativo!");return;}
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
