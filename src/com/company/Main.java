package com.company;

import java.util.Scanner;

public class Main {

    //her bir proqramda her hansi bir girish noqtesi olmasi vacibdir
    //bizim sade (console; command line) proqram yazdigimiz ucun bu
    //main function-dir. Kodumuzu compiler-den kecirdikden sonra bu functionun
    //daxilinde olan butun setrler ishlenecek
    public static void main(String[] args) {


        /*
         * Scanner istifadecinin daxil etidyi reqemi ve ya her hansi
         * bir simvolu, sozu, cumleni sizin teyin etdiyiniz deyishene
         * yazmaq ucun komekci klassdir. Klasslar haqqinda novbeti derslerimizde
         * etrafli danishaciq
         *
         **/
        Scanner scanner = new Scanner(System.in);


        /*

        //////////////////////// IF STATEMENTS ////////////////////////////////////////////

        //Burada scanner vasitesi ile biz istifadecinin daxil etdiyi
        //novbeti reqemi (nextInt) age deyishenin icine yazaciq

        int age = scanner.nextInt();


        //ashagida ki if-lerin izahini dersde muzakire etdik

        if (age<10)
            System.out.println("siz ushaqsiniz");

        else if(age>=20 && age<30)
            System.out.println("siz yetkinsiniz");

        else if (age>=10 && age<20)
            System.out.println("siz korpesiz");

        else
            System.out.println("Siz cavansiz");


        ///////////////////////////// IF STATEMENTLERIN SONU //////////////////////////////

        */



        /*

        //////////////////////  FOR LOOPS ////////////////////////////////////////

        /* Komputerlerin esas ustunlekleri odur ki onlar
         * monoton tekrarlanan ishleri cox tez ede bilirler. Bunun ucun bize
         * dovriyeler lazimdir. En besit dovriye for dovriyesidir.
         * ashagida ki setrle  0-dan 10-a kimi olan butun reqemleri print edirik
         *
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /*
         * belelikle for dovriyesini yazmaq ucun biz daxil noqtesini yazmaliyiq
         * dovruyenin bitme noqtesini yazmaliyq, ve dovriyenin deyisheni nece artacaq (azalacaq)
         * qeyd etmeliyik
         *
         */

        //  for ( DAXIL NOQTESI  ;  BITME SHERTI ; ARTMA/AZALMA MENTIQI ) {

        // TEKRARLANAN EMELIYATLAR

        //  }


        /////////////////////////////// FOR LOOPLARIN SONU ///////////////////////////




        // ashagida ki proqram, istifadecinden iki reqem alir
        // bu reqemleri girish ve bitme noqteleri ucun istifade edir
        // belelikle istifadecinin daxil etdiyi araliqda olan butun reqemler cap olunur


        // istifadeciden reqemleri aliriq
        System.out.println("bashlangic reqemi daxil edin");
        int start = scanner.nextInt();
        System.out.println("son reqemi daxil edin");
        int finish = scanner.nextInt();

        //eger girish noqtesi cixish noqtesinden boyukdurse,
        //demek ki istifadeci sehv daxil edib ve biz onu melumatlandiririq.

        if (start > finish)
            System.out.println("yalnis format");

        //sonda reqemleri aldiqdan sonra onlari cap edirik

        for (int i = start; i < finish; i = i + 6) {
            System.out.println(i);
        }

    }
}
