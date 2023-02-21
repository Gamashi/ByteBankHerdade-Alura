public class TestaSistema { 

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(1234);

        SistemaInterno si = new SistemaInterno();
        si.autentica(adm);
        si.autentica(gerente);

    }
}
