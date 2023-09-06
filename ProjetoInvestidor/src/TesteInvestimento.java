import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteInvestimento {

	Investidor investidor = new Investidor();
	
	@Test
	void pequenoInvestTest() {
		assertEquals("Pequeno investidor", investidor.calculaInvestimento(1000, 0.04, 48));
		
	}
	
	@Test
	void medioInvestTest() {
		assertEquals("Médio investidor", investidor.calculaInvestimento(17265.74, 0.05, 36));
	}
	
	@Test
	void grandeInvestTest() {
		assertEquals("Grande investidor", investidor.calculaInvestimento(17265.75, 0.05, 36));
	}

}
