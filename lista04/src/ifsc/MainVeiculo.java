package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		Veiculo um = new Veiculo();
		um.setNome("Corola");
		um.setAno(2010);
		um.setNumRodas(4);
		um.setFabricante("Toyota");
		um.setCor("Prata");
		
		Veiculo dois = new Veiculo();
		dois.setNome("Gol");
		dois.setAno(2015);
		dois.setNumRodas(4);
		dois.setFabricante("Volkswagen");
		dois.setCor("Preto");
		
		Veiculo tres = new Veiculo ();
		tres.setNome("Onix");
		tres.setAno(2020);
		tres.setNumRodas(4);
		tres.setFabricante("Chevrolet");
		tres.setCor("Vermelho");
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
			veiculos.add(um);
			veiculos.add(dois);
			veiculos.add(tres);		
			
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println(""); // pular uma linha
		}
	}

}
