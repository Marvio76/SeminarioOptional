import java.util.Optional;

public class ComparacaoComOptional {
    public static void main(String[] args) {
        Optional<String> nome = Optional.ofNullable(null);

        nome.map(String::length)
                .ifPresentOrElse(
                        length -> System.out.println("Tamanho: " + length),
                        () -> System.out.println("Nome é nulo")
                );

    }
}
