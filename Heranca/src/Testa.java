import java.util.ArrayList;
public class Testa {

	public static void main(String[] args) {
		ArrayList<Veiculo> motorzao = new ArrayList<Veiculo>();
		
		Onibus busaoA = new Onibus("AAA-1111",2000,41);
		Onibus busaoB = new Onibus("ABC-1234",2005,45);
		Onibus busaoC = new Onibus("BBB-2222",2010,42);
		Onibus busaoD = new Onibus("CCC-3333",2015,43);
		Onibus busaoE = new Onibus("DDD-4444",2020,44);
		
		motorzao.add(busaoA);
		motorzao.add(busaoB);
		motorzao.add(busaoC);
		motorzao.add(busaoD);
		motorzao.add(busaoE);
		
		Caminhao scaniaA =  new Caminhao("EFG-5678",2022,9);
		Caminhao scaniaB =  new Caminhao("EEE-5555",1982,2);
		Caminhao scaniaC =  new Caminhao("FFF-6666",1992,3);
		Caminhao scaniaD =  new Caminhao("GGG-7777",2002,4);
		Caminhao scaniaE =  new Caminhao("HHH-8888",2012,7);
		
		motorzao.add(scaniaA);
		motorzao.add(scaniaB);
		motorzao.add(scaniaC);
		motorzao.add(scaniaD);
		motorzao.add(scaniaE);
		
		for(Veiculo r : motorzao) {
			r.exibirDados();
			
		}
		
		}
		

}

