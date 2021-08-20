/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga.de.metodos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author atzel
 */
public class metodos {
    double r1adio, b1ase, a1ltura, p1erimetro, a1potema,l1ado;
     Scanner tec1=new Scanner(System.in);
    //cuadrado
    public void areaFigura(double lado){
    l1ado=lado;
    JOptionPane.showInputDialog("Teclea el lado: ");
    lado=tec1.nextDouble();
    double res;
    res=lado*lado;
    JOptionPane.showMessageDialog(null, "Resultado: "+res);
    }
    //circulo
     public void areaFigura1(double radio){
      r1adio=radio;
      JOptionPane.showInputDialog("Teclea el radio: ");
      radio=tec1.nextDouble();
      double res;
      res=(3.1416*radio);
      res=res*res;
    JOptionPane.showMessageDialog(null,"Resultado: "+res);
    }
    //Triangulo
     public void areaFigura1(double base, double altura){
      b1ase=base;
      a1ltura=altura;
      JOptionPane.showInputDialog("Teclea el base: ");
       base=tec1.nextDouble();
       JOptionPane.showMessageDialog(null,"Teclea el altura: ");
       altura=tec1.nextDouble();
      double res;
      res=(base*altura)/2;
    JOptionPane.showMessageDialog(null,"Resultado: "+res);
    }
    //Rectangulo  
     public void areaFigura(double base, double altura){
      b1ase=base;
      a1ltura=altura;
      JOptionPane.showInputDialog("Teclea el base: ");
      base=tec1.nextDouble();
      JOptionPane.showInputDialog("Teclea el altura: ");
      altura=tec1.nextDouble();
      double res=(base*altura);
     JOptionPane.showMessageDialog(null,"Resultado: "+res);
    }
}
