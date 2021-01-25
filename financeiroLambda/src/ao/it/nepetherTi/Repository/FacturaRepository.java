package ao.it.nepetherTi.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import ao.it.nepetherTi.modelo.Factura;

public class FacturaRepository {
	
	public List<Factura>buscarFacturasVencidas(){
		// pegar no banco de dados futuramente
		
		Factura factura1 = new Factura("kenneth@ksl.com", 3000000.00, LocalDate.now().minusDays(10));
		Factura factura2 = new Factura("Cabata@ksl.com", 5000000.00, LocalDate.now().minusMonths(5).minusDays(2));
		Factura factura3 = new Factura("Landinho@ksl.com", 1000000.00, LocalDate.now().minusDays(20));
		
		return Arrays.asList(factura1, factura2, factura3);
		
	}

}
