
public class Gerente extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Gerente(){
        this.autenticador = new Autenticador();

    }
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        
    }
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
  
    }

    public double getBonificacao(){
        return  super.getSalario();
    }
}

