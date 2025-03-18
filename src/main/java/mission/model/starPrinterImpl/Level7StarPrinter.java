package mission.model.starPrinterImpl;

import java.util.ArrayList;
import java.util.List;
import mission.model.StarPrinter;

public class Level7StarPrinter implements StarPrinter {
    public int getLevel() {
        return 7;
    }

    private List<String> starRecur(int size) {
        if (size <= 1) {
            return List.of("***", "* *", "***");
        }
        List<String> preStar = starRecur(size - 1);
        List<String> curStar = new ArrayList<>();
        preStar.forEach(line -> {
            curStar.add(line.repeat(3));
        });
        preStar.forEach(line -> {
            curStar.add(line + " ".repeat((int) Math.pow(3, size - 1)) + line);
        });
        preStar.forEach(line -> {
            curStar.add(line.repeat(3));
        });

        return curStar;
    }

    public List<StringBuilder> getStar(int size) {
        return starRecur(size).stream().map(StringBuilder::new).toList();
    }
}
