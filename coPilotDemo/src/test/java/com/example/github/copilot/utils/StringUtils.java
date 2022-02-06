package com.example.github.copilot.utils;

public class StringUtils {


    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String upperCase(String s){
        return s.toUpperCase();
    }
    public String lowerCase(String s){
        return s.toLowerCase();
    }
}



