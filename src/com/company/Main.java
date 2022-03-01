package com.company;


import java.util.Locale;
import java.util.Scanner;

public class Main {
Scanner sc = new Scanner(System.in);

 public void alfabetisk() {

     // Mit Bruger input
     String userInput = sc.nextLine();
     String klar = userInput;

     // laver et char array af mit brugetinput
     char[] cubel = klar.toCharArray(); //Laver min array
     for (char rename : cubel) {
         int sh = (int) rename; //fortæller det med int
         int ned = 96;
         if (sh <= 122 & sh >= 97)
             System.out.print(sh - ned);
     }
 }

/*
    //global alfabet,
 String value = "abcdefghijklmnopqrstuvwxyz";
 public void alfabethaløj () {
     Scanner key = new Scanner(System.in);
     String userImput = key.nextLine();

     // looper igennem input
     int i;
     for (i = 0; i < userImput.length(); i++) ;

     // skulle finde nummeret i alfabetet
     int findTalleneFraValue = value.indexOf(userImput.charAt(i));
     System.out.println(findTalleneFraValue);
 }

*/

     public static void main(String[] args) {


        Main app = new Main();

app.alfabetisk();

    }

}


