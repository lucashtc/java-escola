package aula2_OO;

public class Pessoa extends Profissao{

    String Nome;
    String Telefone;

    public Pessoa(String nome, String telefone, String profissao){
        super(profissao);

        this.Nome = nome;
        this.Telefone = telefone;
    }
    
    @Override
    public void work(){
        System.out.println(this.Nome +"::"+this.Telefone);
    }
}
