
public class ComparacaoSemOptional {
    public static void main(String[] args) {
        // SEM OPTIONAL
        String nome = null;

        if (nome != null) {
            System.out.println(nome.length());
        } else {
            System.out.println("Nome é nulo");
        }


    }
}
