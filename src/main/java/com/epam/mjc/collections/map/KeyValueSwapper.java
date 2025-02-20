package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Integer key :
                sourceMap.keySet()) {
            if(result.containsKey(sourceMap.get(key))){
                if(result.get(sourceMap.get(key)) > key) {
                    result.put(sourceMap.get(key), key);
                }
            }else{
                result.put(sourceMap.get(key), key);
            }

        }
        return result;
    }

}
