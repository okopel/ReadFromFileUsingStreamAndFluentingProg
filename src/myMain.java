import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class myMain {
    public static void main(String[] args) throws IOException {
        Stream<String> file = Files.lines(Paths.get("fileName.txt"));

        List<String> lines =
                file.
                        filter(s -> !s.isBlank()).
                        filter(s -> !s.startsWith("#")).
                        collect(Collectors.toList());
        file.close();
        lines.stream().forEach(System.out::println);

    }
}
