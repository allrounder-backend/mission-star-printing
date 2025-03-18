package mission.model.starPrinterImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mission.model.StarPrinter;
import mission.utils.Utility;

public class Level4StarPrinter implements StarPrinter {
    public int getLevel() {
        return 4;
    }

    public List<StringBuilder> getStar(int size) {
        Level3StarPrinter level3StarPrinter = new Level3StarPrinter();

        List<StringBuilder> lines = new ArrayList<>(level3StarPrinter.getStar(size));
        Collections.reverse(lines);
        return Utility.reverseConcat(lines);
    }
}
