package mission.model.starPrinterImpl;

import java.util.List;
import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level1StarPrinter implements StarPrinter {
    public int getLevel() {
        return 1;
    }

    public List<StringBuilder> getStar(int size) {
        return IntStream.range(1, size+1)
                .mapToObj(i -> new StringBuilder("*".repeat(i)))
                .toList();
    }
}
