package mission;

import mission.controller.StarPrintingController;
import mission.view.InputView;
import mission.view.OutputView;

public class Application {
    public static void main(String[] args) {
        //Todo: 프로그램 구현
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        StarPrintingController starPrintingController = new StarPrintingController(inputView, outputView);

        starPrintingController.run();
    }
}
