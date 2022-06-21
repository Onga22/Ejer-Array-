
package domain;

import java.util.Scanner;

public class ArrayLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena");
        
        String palabra = sc.nextLine();
        int cont = 0;
        char letra = 'a';
        char[] arrayString = palabra.toCharArray();
        int pos = 0;
        
        for (int i = 0; i < palabra.length(); i++){
        if(palabra.charAt(i)==letra)
            cont++;
        
         for (int j = 0; j < arrayString.length; j++) {
                if(arrayString[i]== letra){
                  pos=i;
                  
         }
            }
               
        }
        System.out.println("La letra " + "*"+letra+"*" + " se repite " + cont + " veces y se encuentra en la o las posiciones: " + pos);
                }


  
            }
        
        
            
            
        
        
//            if (palabra.charAt(i)== letra) {
//                cont++;
//            }
//          //  System.out.println("letras"+cont);
//            System.out.println(palabra.charAt(letra));
//            
            
        
        
   
// JOptionPane.showMessageDialog(null, " Ejercicio n° 2 :" );       
//     
//String cadena = JOptionPane.showInputDialog(" Ingrese una cadena: ");
////int acum=0;
////int pos=0;
//int cuenta=0;
//
//int posicion= cadena.indexOf("a");
//while(posicion!=-1){
//    cuenta++;
//    posicion=cadena.indexOf("a", posicion+1);
//    System.out.println(cuenta);
//    System.out.println(posicion);
//    
//}
////   int pos = 0;
////   char [] letra=cadena.toCharArray();
////     char letter='a';
////        int index = 0;
////     
////     while(index!=-1){
////         index=cadena.indexOf(letter, pos+1);
////         
////         System.out.println(pos);
////     }
////     
//     
  
    
//  // for (int i = 0; i < letra.length; i++) {
//           char temp=texto.charAt(i);
//                if(temp == 'a'){
//               cont++;
//                 }
//             }
//      JOptionPane.showMessageDialog(null, " Resultado :" + "\n" + " Dentro de la frase " + "( "+ texto + ") "+" el caracter 'a' se encuentra  en la posicion " + pos +
//   "\n" + " y la misma letra se repite " + cont + " veces. "+"\n"+ " Fin del ejercicio ") ;
//      
//   
    
              
   
    


            
            

    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
//     public static int contarLetras(String cadena, char letra) {
//        int pos = 0;
//        int cont = 0;
//        pos = cadena.indexOf(letra);
//       JOptionPane.showMessageDialog(null, " Resultado del ejercicio 2" );
//       JOptionPane.showMessageDialog(null, "La letra 'a'  esta en la posicion : " + pos);
//       
//        while (pos != -1) {
//            cont++;
//            pos = cadena.indexOf(letra, pos + 1);
//        }
//        return cont;
//    }
//
//
//         public static void main(String[] args) {
//        
//             
//             
//        int contador = contarLetras("Jonu volve de España", 'a');
//         
//        JOptionPane.showMessageDialog(null, " La letra 'a' se repite : " + contador + " veces ");
//        }
//}