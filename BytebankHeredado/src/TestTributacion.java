
public class TestTributacion {
	public static void main(String[] args) {
		CuentaCorriente cuentaC = new CuentaCorriente(11, 11);
		cuentaC.depositar(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();
		
		calc.registra(seguro);
		calc.registra(cuentaC);
		
		System.out.println(calc.getTotalImpuesto());
	}
}
