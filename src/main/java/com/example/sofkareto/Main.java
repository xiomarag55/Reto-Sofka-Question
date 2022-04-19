package com.example.sofkareto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.util.Scanner;

@Component
public class Main implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world...");
        // Menu de inicio mostrar y capturar respuesta
        /*System.out.println("¿Cuál es su pregunta");
        Scanner questionEscanner = new Scanner(System.in);
        String question1 = questionEscanner.nextLine();
        System.out.println("Su respuesta es : "+ question1);*/
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Agregar Preguntas");
            System.out.println("2. Agregar Categorias");
            System.out.println("2. Salir");


                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch(opcion) {
                    case 1:
                        System.out.println("Digita la pregunta");
                        break;
                    case 2:
                        System.out.println("Agrega la categoria");
                        break;
                    case 3:
                        System.out.println("Has salido");
                        break;

                }

                }

        }


    }

