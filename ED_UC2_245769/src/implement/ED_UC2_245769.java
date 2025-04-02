/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement;
import java.util.Scanner;
/**
 *
 * @author edgar
 */
public class ED_UC2_245769 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ejemplo;
        Scanner sc = new Scanner(System.in);
        Ejemplos ej=new Ejemplos();
        do{
            
            System.out.println("Selecione el ejemplo que quiera ver");
            System.out.println("1- LES, 2- LDE, 3- LESC, 4- LEDC, 0- Salir");
            ejemplo= sc.nextInt();
            switch(ejemplo){
                case 1:
                    ej.ejemploLES();
                    break;
                case 2:
                    ej.ejemploLDE();
                    break;
                case 3:
                    ej.ejemploLESC();
                    break;
                case 4:
                    ej.ejemploLEDC();
                    break;
            }
            
            
        }while(ejemplo== 0);
        
    }
}
