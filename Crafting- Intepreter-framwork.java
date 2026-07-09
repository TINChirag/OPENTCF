package com.craftingimterpreter.lox;

import java.io.bufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files; 
import java.nio.util.List;

public class Lox
  public static viod main(String[] args) throws IOExpectios {
    if (args.length > 1) {
      System.out.println("Usage : jlox [script]"):
        system.exit(64):
        } else if (args.length == 1) {
      runFile(args[0]);
        } else 
      runPrompt(); 
      
  }
