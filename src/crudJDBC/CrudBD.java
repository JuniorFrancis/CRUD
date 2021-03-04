package crudJDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import primeirocrud.Pessoa;

public class CrudBD {

    Connection conn;
    Statement st;

    public boolean conexao() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cruddb", "root", "");
            st = conn.createStatement();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrudBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean salvar(Pessoa person) {
        try {
            String inserir;
            
            /*INSERT INTO cadastroPessoas VALUES (default, "CPF", "Nome" , "Contato1"*/
            inserir = "INSERT INTO cadastroPessoas VALUES(default,'" + person.getCPF() + "', "
                    + "'" + person.getNome() + "', " + person.getContato1() + ");";
            
            st.executeUpdate(inserir);
            return true;
        } catch (SQLException ex) {
           return false;
        }

    }
    
    public void desconect(){
        try {
            conn.close();
        }catch (SQLException ex) {
            
        }
    }

}

/*public boolean obterConexao() {
        //Atributo para conexão
        //Connection conexao = null;
        Connection conn;
        Statement st;

        try {
            //Designa o driver de conexão padrão para essa conexão:
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:localhost:3306/cruddb");
            st = (Statement) conn.createStatement();
            
           
            String schema = "smartdb"; //Nome do schema que será usado
            //URL para o driver JDBC:
           // String url = "jdbc:mysql:localhost:3306/cruddb";
            //Atenção: COLOQUE AQUI O SEU USUÁRIO E A SUA SENHA!
            String usuario = "root"; //Usuário da base, criado anteriormente no Workbench
            String senha = ""; //Senha do usuário
            
        
        } catch (ClassNotFoundException | SQLException ex) { //Caso não encontre o driver de conexão
            System.out.println("Driver de conexão não encontrado " + ex.toString());
           
        }
        return true;
   }
    
    
        public boolean salvar(Pessoa person){
       String inserir;
inserir = "INSER INTO cadastroPessoas VALUES('default','"+ person.getCPF()+"', "
               + "'"+ person.getNome()+ "', "+ person.getContato1()+" );";
        st.executeUpdate(inserir);
               
        return false;
                     }
 */
