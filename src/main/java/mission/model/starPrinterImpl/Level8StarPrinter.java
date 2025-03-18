package mission.model.starPrinterImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level8StarPrinter implements StarPrinter {
    public int getLevel() {
        return 8;
    }

    private List<StringBuilder> drawCanvas(int width, int height) {
        List<StringBuilder> temp = new ArrayList<>();
        IntStream.range(0, height).forEach(i ->temp.add(new StringBuilder(" ".repeat(width))));
        return temp;
    }

    private int getWidth(int size) {
        return (int) (Math.pow(2,2+size)-3);
    }

    private int getHeight(int size) {
        return (int) (Math.pow(2,1+size)-1);
    }

    private List<StringBuilder> getTriangle(int size) {
        List<StringBuilder> temp = new ArrayList<>();
        temp.add(new StringBuilder("*".repeat(getWidth(size))));
        IntStream.range(1, getHeight(size)).forEach(lineIndex -> {
            StringBuilder sb = new StringBuilder(" ".repeat(getWidth(size)));
            sb.setCharAt(lineIndex, '*');
            sb.setCharAt(getWidth(size) - (lineIndex+1), '*');
            temp.add(sb);
        });
        if (size % 2 == 0) {
            Collections.reverse(temp);
        }
        return temp;
    }

    private void concat(List<StringBuilder> base, List<StringBuilder> drawing, int startingXPos, int startingYPos) {
        IntStream.range(startingYPos, startingYPos + drawing.size()).forEach(lineIndex -> {
            base.set(lineIndex, base.get(lineIndex)
                    .replace(startingXPos, startingXPos + drawing.get(lineIndex - startingYPos).length(), drawing.get(lineIndex - startingYPos).toString()));
            }
        );
    }

    public List<StringBuilder>  getStar(int size) {
        List<StringBuilder> canvas = drawCanvas(getWidth(size-1), getHeight(size-1));
        AtomicInteger xPos = new AtomicInteger();
        AtomicInteger yPos = new AtomicInteger();
        IntStream.range(0, size)
                .forEach(drawingSize -> {
                    List<StringBuilder> triangle = getTriangle(size - drawingSize - 1);
                    concat(canvas, triangle, xPos.get(), yPos.get());

                    if ((size - drawingSize) % 2 != 0) {
                        yPos.addAndGet((triangle.size()-1) / 2 - 1);
                    }
                    yPos.addAndGet(1);
                    xPos.addAndGet((triangle.get(0).length()-1) / 4 + 1);
                }
        );

        return canvas;
    }
}
