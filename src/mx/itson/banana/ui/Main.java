package mx.itson.banana.ui;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Escriba el enunciado a separar:");
        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine();
        
       
        String[] lineas = enunciado.split(",");

        for (String linea : lineas) {      
            
                String[] idNombreApellido = linea.split(" ");
                    String id = idNombreApellido[0];
                    String primerNombre = idNombreApellido[3];
                    String primerApellido = idNombreApellido[1];

                    
                    System.out.println("[ID: " + id +"]"+ "[Nombre y apellido: " + primerNombre +" "+ primerApellido + "]");
                }
            }
        }
     

    

