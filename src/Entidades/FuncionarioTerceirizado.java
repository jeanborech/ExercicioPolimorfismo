package Entidades;

public class FuncionarioTerceirizado extends Funcionario {
	
	private Double descontoAdicional;	
	
	FuncionarioTerceirizado(){
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double descontoAdicional) {
		super(nome, horas, valorHora);
		this.descontoAdicional = descontoAdicional;
	}


	public Double getAdicional() {
		return descontoAdicional;
	}

	public void setAdicional(Double adicional) {
		this.descontoAdicional = adicional;
	}
	
	@Override
	public double Pagamento() {
		return super.Pagamento() + descontoAdicional * 1.1; //pagamento mais 110% do desconto adicional
	}
	
}
