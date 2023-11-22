package com.corenetworks.presentacion;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        //polimorfismo
        Map tabla =new HashMap();
        tabla.put("21233333n","Juan Lopez");
        System.out.println(tabla);
        tabla.put("212v","Laura perez");
        System.out.println("obteber el nombre de dni 2133333n " +tabla.get("21233333n"));
        System.out.println("obteber el nombre de dni 212v " +tabla.get("212v"));

        System.out.println(tabla.values());
        System.out.println(tabla.keySet());
        System.out.println(tabla.entrySet());

    }
}