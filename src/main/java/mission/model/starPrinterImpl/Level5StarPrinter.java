package mission.model.starPrinterImpl;

import java.util.List;
import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level5StarPrinter implements StarPrinter {
    public int getLevel() {
        return 5;
    }

    public List<StringBuilder> getStar(int size) {
        return IntStream.range(0, size * 2)
                .mapToObj(row -> {
                    StringBuilder line = new StringBuilder();
                    IntStream.range(0, size).forEach(col -> {
                        line.append(((row + col) % 2 == 0) ? '*' : ' ');
                    });
                    return line;})
                .toList();
    }
}
