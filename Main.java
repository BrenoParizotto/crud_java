package classes_Funcionais;

public class Main {

	public static void main(String[] args) {
		pedido pedido1 = new pedido();
		pedido1.criarCliente("Breno", "459837938");
		pedido1.datacriacao = "25/05/2024";
		pedido1.adicionarItem("Produto 1", 5, 15);
		pedido1.adicionarItem("Produto 2", 6, 55);
		pedido1.adicionarItem("Produto 1", 5, 15);
		pedido1.adicionarItem("Produto 2", 6, 55);
		pedido1.adicionarItem("Produto 1", 5, 15);
		pedido1.adicionarItem("Produto 2", 6, 55);
		pedido1.adicionarItem("Produto 1", 5, 15);
		pedido1.adicionarItem("Produto 2", 6, 55);
		pedido1.adicionarItem("Produto 1", 5, 15);
		pedido1.adicionarItem("Produto 2", 6, 55);
		pedido1.apresentaTudoPedido();
		

		
	}

}
