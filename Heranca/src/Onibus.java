
public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos= assentos;		

		}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
	}

	@Override
	public void exibirDados() {
		System.out.println("Placas de Onibus: "+this.getPlaca());
		System.out.println("Ano: "+this.getAno());
		System.out.println("Assentos do onibus: "+this.getAssentos());
	}

	

}
