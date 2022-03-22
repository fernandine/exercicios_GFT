package entidade;

import entidadeInt.Imposto;

public class ContaCorrente extends Conta implements Imposto{

	public double rendimento() {
		return getSaldo() * 0.03;
	}
	
	@Override
	public String toString() {
		return "Rendimento Mensal: R$ " + String.format("%.2f", rendimento());
	}
	@Override
	public double calcularImposto() {
		return rendimento() * 0.25;
	
	}
	
}
