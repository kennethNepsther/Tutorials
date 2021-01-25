package ao.it.nepetherTi.Teste;

import java.util.List;

import ao.it.nepetherTi.Repository.FacturaRepository;
import ao.it.nepetherTi.email.EnviarEmail;
import ao.it.nepetherTi.modelo.Factura;

public class FacturaTeste {

	public static void main(String[] args) {
		
		List<Factura>facturasVencidas = new FacturaRepository().buscarFacturasVencidas();
		
		EnviarEmail enviar = new EnviarEmail(); // é final, não pode ter mais de uma instancia
		
		/*
		 * for (Factura factura : facturasVencidas) {
		 * enviar.enviarEmail(factura.getEmailDevedor(), factura.resumoFactura()); }
		 */
		facturasVencidas.forEach(factura -> {enviar.enviarEmail(factura.getEmailDevedor(), factura.resumoFactura());
								factura.setNotificacao(true);
								});
		
	}

}
