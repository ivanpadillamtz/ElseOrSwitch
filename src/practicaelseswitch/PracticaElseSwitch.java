/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaelseswitch;

/**
 *
 * @author ivan
 */
public class PracticaElseSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 3;
        String a = "OX";
        String b = "order";
        
//        if (n!=3) {
//            System.out.println("La variable no es 3");
//        }else if(n >0){
//            System.out.println("La variable es mayor que cero");
//        }else{
//            
//        }
        
//        System.out.println("Usando Switch");
        
        switch(a){
            case "ERX":
                System.out.println("Tipo de cruzamiento ERX");
                switch(b){
                    case "order":
                        System.out.println("Tipo de mutacion order");
                        break;
                    case "swap":
                        System.out.println("Tipo de mutacion swap");
                        break;
                    case "inversion":
                        System.out.println("Tipo de mutacion inversion");
                        break;
                    case "orderGauss":
                        System.out.println("Tipo de mutacion orderGauss");
                        break;
                    default:
                        System.err.println("Tipo de mutacion no especificado");
                }
                break;
            case "OX":
                System.out.println("Tipo de cruzamiento 0X");
                switch(b){
                    case "order":
                        System.out.println("Tipo de mutacion order");
                        break;
                    case "swap":
                        System.out.println("Tipo de mutacion swap");
                        break;
                    case "inversion":
                        System.out.println("Tipo de mutacion inversion");
                        break;
                    case "orderGauss":
                        System.out.println("Tipo de mutacion orderGauss");
                        break;
                    default:
                        System.err.println("Tipo de mutacion no especificado");
                }
                break;
            default:
                System.err.println("Tipo de cruzamiento no especificado");
                
        }
        
    }
    
}
