
public class CalculadoraDeImpuesto {
	
	private double TotalImpuesto;
	
	public void registra(Tributacion tributacion) {
		double valor = tributacion.getValorImpuesto();
		this.TotalImpuesto += valor;
	}
	
	public double getTotalImpuesto() {
		return TotalImpuesto;
	}
}
