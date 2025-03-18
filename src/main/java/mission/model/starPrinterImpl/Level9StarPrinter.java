package mission.model.starPrinterImpl;

import java.util.List;
import java.util.stream.IntStream;
import mission.model.StarPrinter;
import mission.utils.Utility;

public class Level9StarPrinter implements StarPrinter {
    public int getLevel() {
        return 9;
    }

    private List<StringBuilder> starX(int size) {
        int width = 4 * size - 3;
        List<StringBuilder> starX = IntStream.range(0, size).mapToObj(lineIndex -> {
            StringBuilder line = new StringBuilder(" ".repeat(width));
            if (lineIndex == 0) {
                line.replace(lineIndex, lineIndex + size - 1, "*".repeat(size));
                line.replace(width - size - lineIndex, width - lineIndex, "*".repeat(size));
            }
            line.setCharAt(lineIndex, '*');
            line.setCharAt(size + lineIndex - 1, '*');
            line.setCharAt(width - lineIndex - 1, '*');
            line.setCharAt(width - (size + lineIndex), '*');
            return line;
        }).toList();

        return Utility.reverseConcat(starX);
    }

    public List<StringBuilder> getStar(int size) {
        return starX(size);
    }
}

