package mission.controller;

import java.util.List;
import mission.model.StarPrinter;
import mission.model.starPrinterImpl.Level1StarPrinter;
import mission.model.starPrinterImpl.Level2StarPrinter;
import mission.model.starPrinterImpl.Level3StarPrinter;
import mission.model.starPrinterImpl.Level4StarPrinter;
import mission.model.starPrinterImpl.Level5StarPrinter;
import mission.model.starPrinterImpl.Level6StarPrinter;
import mission.model.starPrinterImpl.Level7StarPrinter;
import mission.model.starPrinterImpl.Level8StarPrinter;
import mission.model.starPrinterImpl.Level9StarPrinter;
import mission.view.InputView;
import mission.view.OutputView;

public class StarPrintingController {
    InputView inputView;
    OutputView outputView;

    public StarPrintingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        try {
            List<StringBuilder> star = switcher(inputView.getLevel()).getStar(inputView.getSize());
            outputView.printStar(star);
        } catch (OutOfMemoryError e) {
            throw new IllegalStateException("[ERROR] 메모리 초과");
        } catch (Exception e) {
            throw new IllegalStateException("[ERROR] 알 수 없는 에러가 발생했습니다.");
        }
    }

    private List<StarPrinter> composeStarPrinters() {
        return List.of(
                new Level1StarPrinter(), new Level2StarPrinter(), new Level3StarPrinter(),
                new Level4StarPrinter(), new Level5StarPrinter(), new Level6StarPrinter(),
                new Level7StarPrinter(), new Level8StarPrinter(), new Level9StarPrinter()
        );
    }

    public StarPrinter switcher(int level) {
        return composeStarPrinters().stream()
                .filter(printer -> printer.getLevel() == level)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 1~9 사이의 숫자가 아닙니다."));
    }
}
