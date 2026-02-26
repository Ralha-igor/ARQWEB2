package eu.ifsp.soc;

public class Main {

	public static void main(String[] args) {
		System.out.println("Salve bruno");
		
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.findById(2);
    
//		Cliente cliente = new 	Cliente();
//		cliente.setId(2);
//		cliente.loadFromDatabase();
//		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("E-mail: " + cliente.getEmail());
		
		System.out.println("\n");
		
		 ProdutoDAO produtoDAO = new ProdutoDAO();
	     Produto produto = produtoDAO.findById(2);

		System.out.println("Descriçao: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		
//		List<Cliente> clientes = 
		
		
	}
}
