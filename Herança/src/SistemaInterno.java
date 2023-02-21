public class SistemaInterno {

    public int senha = 2222;

    public void autentica(Autenticavel fa){

        boolean autenticou = fa.autentica(this.senha);
        if (autenticou){

            System.out.println("Pode entrar!");
        }else{
            System.out.println("Não pode entrar!");
        }
    }
}
