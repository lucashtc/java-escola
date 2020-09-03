package aula2_OO;
public abstract class Profissao {

  public String Profissao;
  public Profissao(String ProfissaoNome){
    this.Profissao = ProfissaoNome;
  }

  public abstract void work();

}