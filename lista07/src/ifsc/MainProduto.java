package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Desktop> desktop = new ArrayList<>();
		ArrayList<String> umpecas = new ArrayList<>();
		umpecas.add("Processador Intel");
		umpecas.add("Placa de Vídeo 3060");
		umpecas.add("Memória RAM: 16GB");

		Desktop um = new Desktop();
		um.setFabricante("Dell");
		um.setCodBarras(1234567890l);
		um.setGamer(false);
		um.setPecas(umpecas);
		desktop.add(um);

		ArrayList<String> doispecas = new ArrayList<>();
		doispecas.add("Processador Ryzen");
		doispecas.add("Placa de Vídeo 3080");
		doispecas.add("Memória RAM: 32GB");

		Desktop dois = new Desktop();
		dois.setFabricante("ASUS");
		dois.setCodBarras(9876543210l);
		dois.setGamer(true);
		dois.setPecas(doispecas);
		desktop.add(dois);

		ArrayList<String> trespecas = new ArrayList<>();
		trespecas.add("Processador Intel 630");
		trespecas.add("Placa de Vídeo 3060");
		trespecas.add("Memória RAM: 8GB");

		Desktop tres = new Desktop();
		tres.setFabricante("HP");
		tres.setCodBarras(1357924680l);
		tres.setGamer(false);
		tres.setPecas(trespecas);
		desktop.add(tres);

		ArrayList<Smartphone> smartphone = new ArrayList<>();

		Smartphone A = new Smartphone();
		A.setFabricante("Samsung");
		A.setModelo("Samsung Galaxy S21");
		A.setDimensoesTela("6.2 polegadas");
		A.setCodBarras(123456789012l);
		smartphone.add(A);

		Smartphone B = new Smartphone();
		B.setFabricante("Apple");
		B.setModelo("iPhone 13 Pro");
		B.setDimensoesTela("6.1 polegadas");
		B.setCodBarras(987654321098l);
		smartphone.add(B);

		Smartphone C = new Smartphone();
		C.setFabricante("Xiaomi");
		C.setModelo("Xiaomi Mi 11");
		C.setDimensoesTela("6.81 polegadas");
		C.setCodBarras(246813579024l);
		smartphone.add(C);

		for (Desktop desktops : desktop) {
			System.out.println(desktops.getFabricante());
			System.out.println(desktops.getCodBarras());
			System.out.println(desktops.getGamer());
			System.out.println(desktops.getPecas());
			System.out.println();
		}

		for (Smartphone smartphones : smartphone) {
			System.out.println(smartphones.getModelo());
			System.out.println(smartphones.getFabricante());
			System.out.println(smartphones.getDimensoesTela());
			System.out.println(smartphones.getCodBarras());
			System.out.println();
		}

	}

}
