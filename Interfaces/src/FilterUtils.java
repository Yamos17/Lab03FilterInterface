import java.util.ArrayList;
import java.util.List;

public class FilterUtils {
    public static List<Object> collectAll(Object[] objects, Filter filter) {
        List<Object> filteredList = new ArrayList<>();
        for (Object obj : objects) {
            if (filter.accept(obj)) {
                filteredList.add(obj);
            }
        }
        return filteredList;
    }
}

