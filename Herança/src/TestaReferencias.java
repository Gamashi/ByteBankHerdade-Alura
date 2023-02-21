public class TestaReferencias {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente();
        gerente.setNome("Gamashi");
        gerente.setSalario(2000.0);

        EditorVideo edVideo = new EditorVideo();

        edVideo.setNome("Bruna");
        edVideo.setSalario(1500.0);

        Funcionario funcionario = new Gerente();
        funcionario.setNome("Julia");
        funcionario.setSalario(1000.0);

        ControleBonificacao controle = new ControleBonificacao();

        controle.Resgistra(gerente);
        controle.Resgistra(edVideo);
        controle.Resgistra(funcionario);

        System.out.println(controle.getValorDaBonificacao());
        
    }
    
}
