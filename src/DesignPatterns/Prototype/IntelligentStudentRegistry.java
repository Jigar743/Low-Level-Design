package DesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class IntelligentStudentRegistry {
    private Map<String, IntelligentStudent> map = new HashMap<>();
    void register(String key, IntelligentStudent i){
        map.put(key, i);
    }
    IntelligentStudent get(String key){
        return map.get(key);
    }
}
