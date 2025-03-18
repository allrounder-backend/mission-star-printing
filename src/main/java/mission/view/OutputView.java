package mission.view;

import java.util.List;

public class OutputView {
    public void printStar(List<StringBuilder> star) {
        star.forEach(line -> System.out.println(line.toString()));
    }
}
