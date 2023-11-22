package com.corenetworks.presentacion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProbarMapGenerico {
    public static void main(String[] args) {
        Map<Integer,String> tablaAlumnos=new HashMap<>();
        tablaAlumnos.put(123,"Juan Lopez");
        tablaAlumnos.put(124,"Laura Lopez");
        System.out.println("obtener el nombre de la matricula 123 " +tablaAlumnos.get(123));
        System.out.println("Obtener el nombre de la matricula 124 " + tablaAlumnos.get(124));
        System.out.println("nombre del alumno " + tablaAlumnos.values());
        System.out.println("matricula " +tablaAlumnos.keySet());
        System.out.println("todos los datos de un set " +tablaAlumnos.entrySet());

        //estructura para almacenar como un dictionario
        //palabra puede tener varios definiciones
        Map<String, Set<String>> diccionario =new HashMap<>();
        String palabra ="banco";
        Set<String>definiciones =new HashSet<>();
        definiciones.add("muelble para sentarse");
        definiciones.add("Instituciones que gestione dinero");
        definiciones.add("Agrupaciones de peces");
        diccionario.put(palabra,definiciones);
        System.out.println("Diccionario" + diccionario);
        String palabra1 = "empleado";
        Set<String> definicion=new HashSet<>();
        definicion.add("Persona que pertenece a una empresa");
        definicion.add("Persona que cobra un sueldo");
        definicion.add("Persona que tiene horario");
        definicion.add("Persona que no esta en el paro");
        diccionario.put(palabra1,definicion);
        System.out.println("Dicctionario " + diccionario);

        diccionario.put("a",definicion);
        System.out.println(diccionario);



    }
}
