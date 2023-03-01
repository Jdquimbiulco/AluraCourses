class Cuenta {
	
	//ATRIBUTOS
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	//METODOS
	
	void depositar(double valor){
		this.saldo += valor;
		//this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("La cantidad ingresada es superior al saldo disponible");
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo -  valor;
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
}
