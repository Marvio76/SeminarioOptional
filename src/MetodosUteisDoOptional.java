import java.util.Optional;

public class MetodosUteisDoOptional {
    public static void main(String[] args) {

       // Exemplo 1 , of() e ofNullable()
        Optional<String> nome = Optional.of("Marvio"); // Valor presente
        Optional<String> sobrenome = Optional.ofNullable(null); // Aceita null

        System.out.println(nome.isPresent()); // true
        System.out.println(sobrenome.isEmpty()); // true

        // exemplo 2 , isPresent() e ifPresent()
        Optional<String> valor = Optional.of("Java");

        valor.ifPresent(v -> System.out.println("Valor: " + v)); // Executa a ação

        // exemplo 3, filter()
        Optional<Integer> idade = Optional.of(20);

        idade.filter(i -> i >= 18)
                .ifPresent(i -> System.out.println("Maior de idade")); // Executa


    }
}
