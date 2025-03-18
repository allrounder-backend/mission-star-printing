package mission.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility {
    public static <T> List<T> reverseConcat(List<T> list) {
        List<T> one = new ArrayList<>(list);
        List<T> result = new ArrayList<>(one);
        Collections.reverse(one);
        one.remove(0);
        result.addAll(one);
        return result;
    }
}
