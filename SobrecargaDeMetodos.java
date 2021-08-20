/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga.de.metodos;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class SobrecargaDeMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         double radio=0, lado = 0, altura=0, perimetro=0, apotema=0,base=0;
        int n;
       metodos A1= new metodos();
       Scanner tec=new Scanner(System.in);
       
       
       JOptionPane.showInputDialog("Que area deseas obtener 0-salir 1-cuadrado 2-circulo 3- Triangulo 4-Rectangulo");
       n=tec.nextInt();
      switch(n){
          case 0:
                 System.exit(0);
          break;    
          case 1:
                           A1.areaFigura(lado);
             
          break;
          case 2:
              
             A1.areaFigura1(radio);
          break;
          case 3:
              
             A1.areaFigura1(base, altura);
          break;
          case 4:
              
             A1.areaFigura(base, altura);
          break;
      }
    }
    
}

