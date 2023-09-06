public class Investidor {

private int tempoInvestimento;
private double taxaJuros;
private double investimentoInicial;
	
	public String calculaInvestimento(double investInicial, double taxJuros, int tmpInvest) {
		
		this.tempoInvestimento = tmpInvest;
		this.taxaJuros = taxJuros;
		this.investimentoInicial = investInicial;
		double jurosCompostos = investInicial*Math.pow(1+taxJuros, tmpInvest);	
		
		if (jurosCompostos < 10000) {
			return "Pequeno investidor";
		}else if (jurosCompostos > 10000 && jurosCompostos < 100000) {
			return "Médio investidor";
		}else {
			return "Grande investidor";
		}
	}
	
}
