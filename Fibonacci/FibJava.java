/*
 Punto numero 2 del laboratorio 1 de Algoritmos 2018-2
 */
package fibjava;

import java.math.BigInteger;

/**
 *
 * @author Jann
 */
public class FibJava {
    
    
    void fib_short(){
        short prefib=1;
        short fib=1;
        int nterm=2;
        while(true){
            if((int)prefib+(int)fib>Short.MAX_VALUE){
                System.out.println("con Short se puede determinar hasta el termino: "+nterm+" de la sucesión de fibonacci");
                break;
            }
            short aux=prefib;
            prefib=fib;
            fib+=aux;
            nterm++;
            
            
        }
    }
    
    void fib_int(){
        int prefib=1;
        int fib=1;
        int nterm=2;
        while(true){
            if((long)prefib+(long)fib>Integer.MAX_VALUE){
                System.out.println("con Int se puede determinar hasta el termino: "+nterm+" de la sucesión de fibonacci");
                break;
            }
            int aux=prefib;
            prefib=fib;
            fib+=aux;
            nterm++;
            
            
        }
    }
    
    void fib_long(){
        long prefib=1;
        long fib=1;
        int nterm=2;
        while(true){
            BigInteger p=new BigInteger(Long.toString(prefib));
            BigInteger f=new BigInteger(Long.toString(prefib));
            BigInteger aux=BigInteger.ZERO.add(f).add(p);
            if(aux.compareTo(BigInteger.valueOf(Long.MAX_VALUE))>0){
                System.out.println("con Long se puede determinar hasta el termino: "+nterm+" de la sucesión de fibonacci");
                break;
            }
            long auxf=prefib;
            prefib=fib;
            fib+=auxf;
            nterm++;
            
            
        }
    }
    
    void fibBigInteger() {
        BigInteger fib = BigInteger.ONE;
        BigInteger prevFib = BigInteger.ONE;
        int i = 1;
        int a=0;
        System.out.println(1);
        System.out.println(1);
        while (a==0) {
            BigInteger temp = fib;
            BigInteger aux = fib;

            fib= fib.add(prevFib);
            prevFib = temp;
            i++;
            
            if (fib.toString().length() >= 50) {
                System.out.println("con BigInteger alcanzamos: ");
                System.out.println(i);
                a=1;
            } 
        }
    }
    public static void main(String[] args) {
         FibJava f=new FibJava();
    
         f.fib_short();
         System.out.println("-------------------------------------------------------------------------------------------");
         f.fib_int();
         System.out.println("-------------------------------------------------------------------------------------------");
         f.fib_long();
         System.out.println("-------------------------------------------------------------------------------------------");
         System.out.println("En el caso de BigInteger este depende exclusivamente de la memoria ya que su capacidad es dinamica");
         //f.fibBigInteger();
    
    }

}
