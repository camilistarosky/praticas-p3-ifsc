package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		Produto camisa = new Produto();
		camisa.setNome("camisa praiana");
		camisa.setFornecedor("Hering");
		camisa.setPreco(29.99);
		camisa.setCodBarra(89326541l);

		Produto saia = new Produto();
		saia.setNome("saia jeans");
		saia.setFornecedor("You.com");
		saia.setPreco(59.99);
		saia.setCodBarra(78965412l);

		Produto jaqueta = new Produto();
		jaqueta.setNome("jaqueta de couro");
		jaqueta.setFornecedor("Versat");
		jaqueta.setPreco(159.99);
		jaqueta.setCodBarra(74412365l);

		ArrayList<Produto> produtos = new ArrayList<Produto>();
			produtos.add(camisa);
			produtos.add(saia);
			produtos.add(jaqueta);
			
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getFornecedor());
			System.out.println(produto.getPreco());
			System.out.println(produto.getCodBarra());
			System.out.println(" ");

		}
	}

}
