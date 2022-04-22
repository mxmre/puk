/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.io.IOException;

/**
 *
 * @author jeffo
 */
public class ApiGlobals{
    public static DataBase Base;
    public static String GetHash(String login, String password){
        return new String("" + password.hashCode() + login.hashCode());
    }
    public static void BaseInit() throws IOException{
        ApiGlobals.Base = new DataBase();
    }
}
