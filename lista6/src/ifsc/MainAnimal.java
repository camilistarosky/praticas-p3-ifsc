package ifsc;

import java.util.Set;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro xodo = new Cachorro();
		xodo.late();
		xodo.setNome("xoxo");
		xodo.setRaca("Xiuaua");
		xodo.setComprimento(32.2f);
		xodo.setNumpatas(4);
		xodo.setCor("preto");
		xodo.setEcossistema("terra");
		
		Gato xispa = new Gato();
		xispa.miau();
		xispa.setNome("pipa");
		xispa.setRaca("italiano");
		xispa.setComprimento(35.8f);
		xispa.setNumpatas(8);
		xispa.setCor("branco");
		xispa.setEcossistema("áquatico");
		
		System.out.println(xodo.getNome());
		System.out.println(xodo.getRaca());
		System.out.println(xodo.getComprimento());
		System.out.println(xodo.getNumpatas());
		System.out.println(xodo.getCor());
		System.out.println(xodo.getEcossistema());
		
		xodo.caminha();
		
		System.out.println(xispa.getNome());
		System.out.println(xispa.getRaca());
		System.out.println(xispa.getComprimento());
		System.out.println(xispa.getNumpatas());
		System.out.println(xispa.getCor());
		System.out.println(xispa.getEcossistema());
		
		xispa.caminha();
		
	}

}
