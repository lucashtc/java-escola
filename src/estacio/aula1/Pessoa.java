package estacio.aula1;

public class Pessoa {
    String Nome;
    String Telefone;
    Pessoa(String nome, String telefone){
        this.Nome = nome;
        this.Telefone = telefone;
    }
    
    void exibir(){
        System.out.println(this.Nome +"::"+this.Telefone);
    }
}
