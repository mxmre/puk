/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author jeffo
 */
public class HtmlBuilder {
    public static String UserPageMake(String login)
    {
        String html = new String("<!DOCTYPE html>\n<html lang = \"ru\">\n\t<head>\n\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n\t\t<title>WriToom - " +
                login + "</title>\n\t</head>\n\t<body>\n\t\t<p>Добро пожаловать, " +
                login + "!</p>\n\t</body>\n</html>");
        return html;
    }
    
}
