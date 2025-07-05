package com.example; 

import java.time.LocalDateTime; 

public class App { 

    public static void main(String[] args) { 

        System.out.println("🚀 CI Pipeline Demo"); 

        System.out.println("CI triggered by GitHub updates"); 

        System.out.println("Build triggered at: " + LocalDateTime.now()); 

    } 

} 
