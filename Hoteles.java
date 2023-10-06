import java.lang.Math;

public class Hoteles {

    public static void main (String []args){

        int cantidadHoteles = (int)(Math.random() * 7) + 1; //se crea la cantidad de hoteles de manera aleatoria

        double hoteles [][] = new double [cantidadHoteles][4]; // matriz, cantidad de filas son los hoteles y por hotel necesitamos 4 informacion
        
        for(int i = 0; i<cantidadHoteles;i ++){
            
            hoteles[i][0] = (int)(Math.random() * 14) + 3; //posicion 1 es pisos
            hoteles[i][1] = (int)(Math.random() * 24) + 0; //posicion 2 es horas
            hoteles[i][2] = (int)(Math.random() * 3) + 1; //posicion 3 es tipo luces

            if(hoteles[i][2] == 1){

            hoteles[i][3] = hoteles[i][1] * 0.25;

            }  if (hoteles[i][2] == 2){

            hoteles[i][3] = hoteles[i][1] * 0.50; //posicion 4 es la multiplicacion del precio por la cantidad de horas dependiendo del tipo de luces

            }  if(hoteles[i][2] == 3){

            hoteles[i][3] = hoteles[i][1] * 1; 

            }

        }


        for(int i = 0; i<cantidadHoteles; i ++){

            System.out.println("para el hotel numero " + (i+1));
            System.out.println("cantidad de horas encedidas = " + hoteles[i][1]); // se imprimen la posicion 2 y 4 por cada hotel (horas totales y gasto)
            System.out.println("dinero gastado = " + hoteles[i][3] + "$");


        }
       

     }




 }


































    
