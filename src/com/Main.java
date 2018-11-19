package com;

import com.sun.org.apache.xerces.internal.impl.dtd.models.DFAContentModel;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale=new Locale("en","US");
        Locale locale2=Locale.getDefault();
        Locale locale3= new Locale("de","GR");
        Locale locale4=Locale.GERMAN;

//        Locale[]locales=Locale.getAvailableLocales();
//        for (Locale l:locales) { System.out.println(l); }

      //System.out.println(Locale.getDefault());
        System.out.println(NumberFormat.getCurrencyInstance(locale).format(1000));
        System.out.println(NumberFormat.getCurrencyInstance(locale2).format(1000));
        System.out.println(NumberFormat.getCurrencyInstance(locale3).format(1000));

        System.out.println( DateFormat.getDateInstance(DateFormat.FULL,locale).format(new Date()));
        System.out.println( DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINA).format(new Date()));
        System.out.println( DateFormat.getDateInstance(DateFormat.FULL,locale3).format(new Date()));


    }
}

















