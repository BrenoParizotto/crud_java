package classes_Funcionais;

import java.util.ArrayList;

public class pedido {
	String datacriacao; // aprender a usar formato date 
	cliente cliente;
	ArrayList<itens_pedido> itens = new ArrayList<itens_pedido>();
	int quantidadeItens = 0;
	
	void criarCliente(String n, String t) {
		this.cliente = new cliente(n,t);
	}
	
	void adicionarItem(String n, int q, double v ) {
		itens_pedido item = new itens_pedido(n,q,v);
		itens.add(item);
		quantidadeItens ++;
	}
	
	double calculaValorTotal () {
		double total = 0;
		for (itens_pedido i: itens) {
			total += i.valor * i.quantidade;
		}
		return total;	
		}
	
	void apresentaItensPedido() {
		if(itens.size() > 0) {
			for (itens_pedido i : itens ) {
				 System.out.println("Item: " + i.nome + ". Quantidade: " + i.quantidade + ". Valor: " + i.valor + "." );
			}
		}
		else {
			System.out.println("Este pedido ainda não tem itens.");;
		}
	}
	
	void apresentaValorTotalPedido() {
		System.out.println("Valor total do pedido: " + calculaValorTotal());
	}
	
	void removeItemPedido(int i) {
		if (i > (itens.size() - 1) || i < 0 || itens.isEmpty()) {
			System.out.println("Não existe itens na lista ou o indice está invalido.");
		} else {
			itens.remove(i);	
			quantidadeItens --;
		}
	}
	
	void removetodosItensPedido() {
		itens.clear();
	}
	
	void apresentaTudoPedido() {
		System.out.println("Apresentando os dados do pedido... ");
		System.out.println("Data de criacação = " + datacriacao);
		System.out.println("Nome Cliente: " + cliente.nome);
		System.out.println("Telefone Cliente: " + cliente.telefone);
		System.out.println("Quantidade de itens: "+ quantidadeItens);
		apresentaItensPedido();
		apresentaValorTotalPedido();
		}
	}

