package mission.model.starPrinterImpl;

import java.util.List;
import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level3StarPrinter implements StarPrinter {
    public int getLevel() {
        return 3;
    }

    public List<StringBuilder> getStar(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> new StringBuilder(" ".repeat(i) + "*".repeat(2 * (size - i) - 1)))
                .toList();
    }
}
