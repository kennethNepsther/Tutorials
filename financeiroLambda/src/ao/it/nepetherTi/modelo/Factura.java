package ao.it.nepetherTi.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Factura {
	
	private String emailDevedor;
	private double valor;
	private LocalDate dataVencimento;
	private boolean notificacao;
	
	
	
	public boolean isNotificacao() {
		return notificacao;
	}

	public void setNotificacao(boolean notificacao) {
		this.notificacao = notificacao;
	}

	public Factura(String emailDevedor, double valor, LocalDate dataVencimento) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public String getEmailDevedor() {
		return emailDevedor;
	}
	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getdataVencimento() {
		return dataVencimento;
	}
	public void setdataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public String resumoFactura() {
		String dataVencimento = this.dataVencimento.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")); 
		return String.format("Valor AKZ %s, vencimento: %s", this.valor, dataVencimento);
	}
	

}
