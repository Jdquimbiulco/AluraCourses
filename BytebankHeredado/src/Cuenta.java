public abstract class Cuenta {
	
	//ATRIBUTOS
	protected double saldo;
	private int agencia = 1;
	private int numero;
	Cliente titular = new Cliente();
	
	private static int total = 0;
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta");
		
		Cuenta.total++;
		System.out.println("Van creados " + total + " cuentas");
	}
	
	//METODOS
	
	public abstract void depositar(double valor);

//Metodo previo para retirar dnero sin excepcion.
//	public boolean retirar(double valor) {
//		if (this.saldo >= valor) {
//			this.saldo -= valor;
//			return true;
//		}else {
//			System.out.println("La cantidad ingresada es superior al saldo disponible");
//			return false;
//		}
//	}
	
	public void retirar (double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("No tiene saldo en su cuenta");
		}
			this.saldo -= valor;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
			
		}
		return false;
	}
	
	//SETTERS AND GETTERS
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setAgencia(int agencia){
		if (agencia > 0) {
		this.agencia = agencia;
	} else {
		System.out.println("No se permite valores negativos");
	}
  }
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getTotal() {
		return total;
	}
	
	public int getNumero() {
		return numero;
	}
}
