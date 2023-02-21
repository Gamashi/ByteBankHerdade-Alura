public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("02511253062");
        nico.setSalario(1500.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
        System.out.println();

        Gerente gerente = new Gerente();

        gerente.setNome("Gustavo");
        gerente.setCpf("02411159064");
        gerente.setSalario(5000.0);

        boolean autenticou = gerente.autentica(222);
        System.out.println(autenticou);
        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacao());
        System.out.println(gerente.getBonificacao());
    }
    
}
