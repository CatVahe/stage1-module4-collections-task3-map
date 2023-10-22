package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String newSentence = sentence.replaceAll("\\p{Punct}", "");
        String[] words = newSentence.split(" ");
        Map<String, Integer> result= new HashMap<>();
        if(words.length == 1){
            return result;
        }
        for (String word:
               words ) {
            if(result.containsKey(word.toLowerCase())){
               int count =  result.get(word.toLowerCase());
               count++;
               result.put(word.toLowerCase(), count);
            }
            else {
                result.put(word.toLowerCase(), 1);
            }
        }
        return  result;
    }
}
