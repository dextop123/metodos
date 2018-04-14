public class CalculosMatematicos{

	public static double polegadasParaCentimetros(double polegadas){
		//Na classe prrincipal: +CalculosMatematicos.polegadasParaCentimetros(20);
		double centimetros = polegadas*2.54;
		return centimetros;
	}

	public static double pesParaCentimetros(double pes){
		double centimetros = pes*30.48;
		return centimetros;
	}

	public static double milhasParaKm(double milhas){
		double km = milhas*1.609;
		return km;
	}
	
