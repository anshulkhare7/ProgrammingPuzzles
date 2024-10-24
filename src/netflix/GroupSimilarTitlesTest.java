package netflix;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class GroupSimilarTitlesTest {

    @Test
    void testGroupTitles() {
        GroupSimilarTitles grouper = new GroupSimilarTitles();
        String[] titles = {"duel", "dule", "speed", "spede", "deul", "cars"};

        List<List<String>> result = grouper.groupTitles(titles);

        // Sort the lists and the overall result for consistent comparison
        for (List<String> group : result) {
            Collections.sort(group);
        }
        result.sort(Comparator.comparing(list -> list.get(0)));

        List<List<String>> expected = Arrays.asList(
            Arrays.asList("cars"),
            Arrays.asList("deul", "duel", "dule"),
            Arrays.asList("spede", "speed")
        );

        assertEquals(expected, result);
    }
}
