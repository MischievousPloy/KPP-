/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2regex;

/**
 *
 * @author Тарас
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class Lab2Regex {
    public static void main(String[] args) {
  String filePath = "Regex.txt"; 
        
        List<String> textLines = FileReader.readFile(filePath);
        System.out.println("=== Вміст файлу ===");
        for (String line : textLines) {
            System.out.println(line);
        }

        List<String> sentencesWithNestedParentheses = Regex.findNestedParentheses(textLines);

        System.out.println("\n=== Речення з вкладеними круглими дужками ===");
        if (!sentencesWithNestedParentheses.isEmpty()) {
            for (String sentence : sentencesWithNestedParentheses) {
                System.out.println(sentence);
            }
        } else {
            System.out.println("Немає речень з вкладеними круглими дужками.");
        }
    }
}
