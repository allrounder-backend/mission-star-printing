package mission.model.starPrinterImpl;

import java.util.List;
import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level6StarPrinter implements StarPrinter {
    public int getLevel() {
        return 6;
    }

    public List<StringBuilder> getStar(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> new StringBuilder(" ".repeat(size-i-1) + "* ".repeat(i+1)))
                .toList();
    }
}
