package ml.pevgen.algo.others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        HashMap<Byte, Integer> sMap = new HashMap<>();
        for (byte b : s.getBytes()) {
            sMap.merge(b, 1, Integer::sum);
        }

        HashMap<Byte, Integer> tMap = new HashMap<>();
        for (byte b : t.getBytes()) {
            tMap.merge(b, 1, Integer::sum);
        }

        if (sMap.size() != tMap.size()) {
            return false;
        }

        for (Map.Entry<Byte, Integer> sEntry : sMap.entrySet()) {
            if (!Objects.equals(tMap.get(sEntry.getKey()), sEntry.getValue())) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramBySorting(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        var sBytes = s.getBytes();
        var tBytes = t.getBytes();
        Arrays.sort(sBytes);
        Arrays.sort(tBytes);

        return Arrays.equals(sBytes, tBytes);
    }
}
