package model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Map<String,String> dictionary= new HashMap<>();
    static {
        dictionary.put("hello", " xin chao ");
        dictionary.put("cat", " con meo ");
        dictionary.put("dog", " con cho  ");
        dictionary.put("apple", " qua tao ");
        dictionary.put("iphone", "dien thoai");
    }
    public String getVietnamese(String english){
        return dictionary.get(english);
    }

}
