public enum EstadosDoBr{
	ACRE     ("Acre","AC","Rio Branco",1698.09),
	ALAGOAS  ("Alagoas","AL","Maceio",134.09),
	AMAPA    ("Amapa","AP","Macapá",1678.09),
	AMAZONAS ("Amazonas","AM","Manaus",19754.09);

	private final String nome;
	private final String sigla;
	private final String capital;
	private final double area;

	private EstadosDoBr(String n, String s, String c, double a){
		nome = n;
		sigla = s;
		capital = c;
		area = a;
	
	} 

	public double qualArea(){
		return area;
	}

	public String toString(){
		return nome+"("+sigla+"): capital "+capital+" e área "+area;
	}
}
