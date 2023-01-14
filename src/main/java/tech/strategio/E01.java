package tech.strategio;

import java.util.*;

public class E01 {
    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
    public int getNthFib(int n) {

        if (n == 0) {
            return 1;
        }

        else if (n == 1) {
            return 0;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = getNthFib(n-1) + getNthFib(n-2);

        memo.put(n, result);

        return result;
    }
}
