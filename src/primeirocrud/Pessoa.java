
package primeirocrud;
import crudJDBC.CrudBD; 

 public class Pessoa {
    
    //Definindo os atributos a serem inseridos
    private String CPF;
    private String nome;
    private int contato1;
    private int contato2;

  /*  public Pessoa() { // Método Construtor
        String CPF = "000.000-00";
        String nome ="";
        int contato1 = 955555555;
        int contato = 900000000;
    }*/

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContato1() {
        return contato1;
    }

    public void setContato1(int contato1) {
        this.contato1 = contato1;
    }

    public int getContato2() {
        return contato2;
    }

    public void setContato2(int contato2) {
        this.contato2 = contato2;
    }    
     //Método com o comando SQL para inserção de dados
     
   /* public boolean salvar(Pessoa person) {
        String inserir;
        /*INSERT INTO cadastroPessoas VALUES (default, "CPF", "Nome" , "Contato1"*//*
        inserir = "INSERT INTO cadastroPessoas VALUES(default,'" + person.getCPF() + "', "
                + "'" + person.getNome() + "', " + person.getContato1() + ");";
        return false;
    
  */
}

