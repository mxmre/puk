/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DataBase {
    public DataBase() throws IOException
    {
        this._file = new File("database.txt");
        this._writer = new FileWriter(this._file.getAbsoluteFile(), true);
        this._reader = new FileReader(this._file);
        this._login_data = new HashSet<>();
        this._r_buffer = new BufferedReader(this._reader);
        
        this._data = new HashMap<>();
        this.OpenDataFromFile();
        
    }
    public void Log(){
        for(String key : this._data.keySet()){
            System.out.println("{" + key + "} " + this._data.get(key));
        }
    }
    public boolean checkUser(String token){
        return this._data.containsKey(token);
    }
    public boolean checkLogin(String login){
        return this._login_data.contains(login);
    }
    public void addUser(String token, String login) throws IOException{
        this._data.put(token, login);
        this._login_data.add(login);
        _writer.write(token + " " + login + "\n");
        _writer.flush();
    }
    public String getUserLogin(String token){
        return this._data.get(token);
    }
    private final File _file;
    private final FileWriter _writer;
    private FileReader _reader;
    private BufferedReader _r_buffer;
    
    private Map<String, String> _data;
    private HashSet<String> _login_data;
    
    private void SaveDataToFile(String hash, String login){
        
    }
    private void OpenDataFromFile() throws IOException{
        String line = this._r_buffer.readLine();
        System.out.println("Reading database...");
        while (line != null) {
            String[] params = line.split(" ");
            System.out.println("reading " + params[1] + "...");
            
            this._login_data.add(params[1]);
            this._data.put(params[0], params[1]);
            
            line = this._r_buffer.readLine();
        }
    }
}
