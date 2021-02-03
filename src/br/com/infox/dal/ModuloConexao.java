package br.com.infox.dal;
// importando bibliotecas

import java.sql.*;

public class ModuloConexao {
    //criando um m�todo respons�vel por estabelecer
    //uma conex�o com o banco

    public static Connection conector() {
        //criando uma vari�vel especial para 
        //estabelecer uma conex�o com o banco
        java.sql.Connection conexao = null;
        //carregando o driver correspondente
        //ao banco (n�o esque�a de importar ele
        // em libraries 
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informa��es referente ao 
        //banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabelecendo a conex�o com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }

    }
}
