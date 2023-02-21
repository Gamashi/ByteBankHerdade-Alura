public class ControleBonificacao {

    private double valorDaBonificacao;

    public void Resgistra (Funcionario funcionario){

        double bonificacao = funcionario.getBonificacao();
        this.valorDaBonificacao += bonificacao;
        
    }

    public double getValorDaBonificacao() {
        return valorDaBonificacao;
    }
    
}
