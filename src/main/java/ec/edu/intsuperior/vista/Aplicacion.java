/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author usuar
 */
public class Aplicacion {
    public static void main(String[] args) {
        // Aplicacion.condiciondeAprobado();
        
        
        Aplicacion.metrosKilometros();
    }
    public static void tablaMultiplicar(){
        Scanner leer= new Scanner(System.in);
        int num,res;
        System.out.println("Ingresa un numero");
        num=leer.nextInt();
        
        for (int i = 1; i <=12; i++){
        res= num * i;
            System.out.println("*" + i + "=" + res);
        }
    }
    public static String condiciondeAprobado(){
        Scanner leer= new Scanner(System.in);
        float n1,n2,n3,prom,sum;
        String estado = "";
        System.out.println("Ingrese la nota 1");
        n1=leer.nextFloat();
        System.out.println("Ingrese la nota 2");
        n2=leer.nextFloat();
        System.out.println("Ingere la nota 3");
        n3=leer.nextFloat();
        sum=n1+n2+n3;
        prom=sum/3;
        if(prom>=7) {
            estado= prom +"aprobado";
        }else{
            if(prom<=5) {
                estado= prom + "supletorio";
            }else {
                estado= prom + "reprobado";
            }
        }
            
        
        return estado;
    }
    public static void metrosKilometros() {
        Scanner leer = new Scanner(System.in);
        double mt;km;
        int op = 0;
        do (
        System.out.println("Ingresa el tipo de conversion a realizar\n"
        + "1.-Converison de metros a kilometros\n"
        + "2.-Conversion de kilometros a metros\n"
        + "3.- Salir");
        op = leer.nextInt();
        switch(op) {
            case 1:
                System.out.println("Ingresa los metros");
                mt=leer.nextDouble();
                km=mt/1000;
                System.out.println("En kilometros:" + km);
            break; 
            case 2:
               
        }
    }
    public static void fibonacci(){
        
    }
    public static boolean verificarcedula(){
        return true; 
    }
    public static int[] decimalBinario(){
        int nBinario[]=new int[10]; 
        return nBinario; 
       
    }
    public static void generarLoteria() {
        Scanner leer= new Scanner(System.in);
        int miNum;
        
        int aleatorio= (int) (Math.random()*10);
        System.out.println("El numero generado es: " + aleatorio);
        
    }
            
}
