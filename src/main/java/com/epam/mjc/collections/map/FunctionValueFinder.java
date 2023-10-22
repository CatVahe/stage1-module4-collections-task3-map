package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer values:
                functionMap.values() ) {
            if(requiredValue == values)
                return true;
        }

        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer key :
                sourceList) {
            result.put(key, 5 * key +2);
        }
        return result;
    }
}
