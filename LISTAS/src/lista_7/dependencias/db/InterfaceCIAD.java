package lista_7.dependencias.db;

import java.sql.Connection;

public interface InterfaceCIAD {
	
String URL = "jdbc:sqlite:fluxoCaixa.db";

	Connection conecta() ;
	void cria();
	void insere();
	void atualiza();
	void deleta(int id);

}
