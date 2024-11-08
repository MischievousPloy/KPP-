package com.mycompany.lab2regex;

import java.util.ArrayList; 
import java.util.List;      
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Regex {
 
    public static List<String> findNestedParentheses(List<String> textLines) {
        List<String> result = new ArrayList<>();
        
        String regex = "\\([^\\)]*\\([^\\)]*\\)[^\\)]*\\)";
        Pattern pattern = Pattern.compile(regex);
        
        for (String line : textLines) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                result.add(matcher.group());
            }
        }
        
        return result;
    }
}
