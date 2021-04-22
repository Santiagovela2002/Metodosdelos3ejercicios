/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package métodos;
import java.util.Scanner;
/**
 *
 * @author Santiago Vela
 */
public class Métodos {

    
             
    public static void encabezado() {
        System.out.println("Universidad Autonóma de Campeche");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Ingeniería de Sistemas Computacionales");
        System.out.println("Santiago Joel Vela Mena");
        System.out.println("Abril 2021");
    }

    public static void cuerpo() {
        System.out.println("=========================================================");
        System.out.println("Seleccione una Opción para efectuar ");
        System.out.println("1: Horario Personal");
        System.out.println("2: Día Hábil");
        System.out.println("3: Trimestre del año");
        
        System.out.println("=========================================================");
    }

    public static void pie() {
        System.out.println("=========================================================");
        System.out.println("SVM.2021");
    }

    public static void Horariopersonal(){
    
    Scanner entrada = new Scanner(System.in);

        System.out.println("Coloca una hora y te recordaré tu actividad:");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora >= 6 && hora < 7){
                System.out.println("Levantarse y darle de comer a mi perrito");
            } else if(hora >= 7 && hora < 8){
                System.out.println("Acomodar la casa ");
            } else if(hora >= 8 && hora < 9){
                System.out.println("Desayunar");
            } else if(hora >= 9 && hora < 11){
                System.out.println("Entrar a clase de Fisica");
            } else if(hora >= 11 && hora < 13){
                System.out.println("Entrar a clases de Inglés");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Entrar a clases de Organización computacional");
            } else if(hora >= 15 && hora < 16){
                System.out.println("Almorzar");
            } else if(hora >= 16 && hora <18){
                System.out.println("Ir a entrenar al gimnsaio");
            } else if(hora >= 18 && hora < 19){
                System.out.println("Bañarse");
            } else if(hora >= 19 && hora < 21){
                System.out.println("Entrar a clase de Programación");
             } else if(hora >= 21 && hora < 22){
                System.out.println("Cenar");
            } else if(hora >= 22 && hora < 24){
                System.out.println("Jugar, distraerme y ver vídeos");
            } else if(hora >= 1 && hora < 6){
                System.out.println("Dormir");    
            }
        } else {
            System.out.println("No es una hora válida");
    }
   
    }
    
    public static void Diahabil(){
    Scanner diaSem = new Scanner(System.in);
    int num = 0;
    System.out.println("Considerando los días de la semana, ingrese un número del 1 al 7: ");
    num = diaSem.nextInt();
    
     if (num >0 && num <=7 ) {
         
         switch (num){
            case 1:
            System.out.println("Es Lunes y es día hábil");
            break;   
            case 2:
            System.out.println("Es Martes y es día hábil");
            break;
            case 3:
            System.out.println("Es Miércoles y es día hábil");
            break;   
            case 4:
            System.out.println("Es Jueves y es día hábil");
            break;
            case 5:
            System.out.println("Es Viernes y es día hábil");
            break;   
            case 6:
            System.out.println("Es Sábado y es fin de semana");
            break;
            case 7:
            System.out.println("Es Domingo y es fin de semana");
            break;
     }     
        
    }else{  
        System.out.println("El número que colocó no pertenece a ningún día de la semana. Por favor ingrese un número del 1 al 7");
     }
    }
    
    public static void Trimestredelano(){
    
     Scanner numMes = new Scanner(System.in);
    int num = 0;

    System.out.println("Considerando los meses del año, ingrese un número del 1 al 12: ");
    
    num = numMes.nextInt();
        
     if (num >0 && num <=12) {
         
         switch (num){
            case 1,2,3:
            System.out.println("Se encuentra en el primer trimestre");
            break;   
            case 4,5,6:
            System.out.println("Se encuentra en el segundo trimestre");
            break;
            case 7,8,9:
            System.out.println("Se encuentra en el Tercer trimestre");
            break;   
            case 10,11,12:
            System.out.println("Se encuentra en el Cuarto trimestre");
            break;
        }
    
    }else{
         
        System.out.println("El número que colocó no pertenece a ningún mes del año. Por favor ingrese un número del 1 al 12");
    }
    }
   
    public static void Principal(int opcion) {
        
        System.out.println(opcion);
        
        switch(opcion)
        {
        case 1:
            Horariopersonal();
             break; 
        case 2:
            Diahabil();
             break; 
        case 3:
            Trimestredelano();
            break; 
        default : 
            System.out.println("Opción no válida");
        }   
        
    }

    public static void main(String[] args) {
    encabezado();
    cuerpo();
    String text = null;
    Scanner sc = new Scanner (System.in);
        System.out.println("¿Cuál de los tres sistemas desea utilizar?");

        Principal (sc.nextInt());
       
    pie();
    

     }
    
}

