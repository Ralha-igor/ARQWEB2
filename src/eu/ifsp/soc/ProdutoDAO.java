package eu.ifsp.soc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO {
	
	public Produto findById(int id) {
		Produto produto = new Produto();
		
		try {
			Connection conn = DatabaseConnection.getConnection();
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select id, descricao, preco FROM produto "
					+ "WHERE id = " + id );
			
			if(rs.next()) {
				produto.setId(rs.getInt("id"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setPreco(rs.getDouble("preco"));
			}
			
			rs.close();
			stmt.close();
			conn.close();
		}catch  (SQLException e) {
			e.printStackTrace();
		}
		return produto;
	}
}
