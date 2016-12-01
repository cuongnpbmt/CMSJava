/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

/**
 *
 * @author Windows 10 Version 2
 */
public class StringService {

    public static String ReplaceSpecials(String str) {
        String[] arr = {"+", "-", "&&", "||", "!", "(", ")", "{", "}",
            "[", "]", "^", "\"", "'", "~", "*", "?", ":", "\\", "AND", "OR"};

        for (int i = 0; i < arr.length; i++) {
            //'search' is my input string

            if (str.contains((String)arr[i])) {

                String oldString = arr[i];

                String newString = "\\" + arr[i];
                str = str.replaceAll(oldString, newString);

            }
        }
        return str;
    }
}
