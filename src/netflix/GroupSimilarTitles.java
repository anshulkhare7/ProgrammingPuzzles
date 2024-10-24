package netflix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupSimilarTitles {
    public List<List<String>> groupTitles(String[] titles) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String title : titles) {
            String key = getFrequencyKey(title);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(title);
        }

        return new ArrayList<>(groups.values());
    }

    private String getFrequencyKey(String title) {
        int[] freq = new int[26];
        for (char c : title.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                freq[c - 'a']++;
            }
        }

        StringBuilder key = new StringBuilder();
        for (int count : freq) {
            key.append('#').append(count);
        }
        return key.toString();
    }
}
