package testes;

import org.junit.jupiter.api.Test;

public class CalculadoraJunitTeste {
    
        @Test
    public void SomarDoisNumPositivos(){
        soma som = new soma();
         
         //teste 1: soma de numeros positivos
         int soma = som.somar(1,2);
         System.out.println(soma);
                
    }
          public void SomarNumPositivoNumNegativo(){
        soma som = new soma();
         
         //teste 2: soma de numero positivo e negativo
        int soma = som.somar(1,-2);
        System.out.println(soma);
          }
          
           public void SomarDoisNumNegativos(){
        soma som = new soma();
         
         //teste 3: soma soma de numeros negativos
         int soma = som.somar(-1,-3);
         System.out.println(soma);
           }
           
            public void SomarNumPositivoNumZero(){
        soma som = new soma();
         
         //teste 4: soma de um numero positivo mais zero
          int soma = som.somar(0,1);
         System.out.println(soma);
            }
            
             public void SomarNumNegativoNumZero(){
        soma som = new soma();
         
         //teste 5: soma de um numero negativo com zero
         int soma = som.somar(0,-1);
         System.out.println(soma);
             }
        
         // subtracao
             
             public void SubtrairNumPositivos(){
             subtracao sub = new subtracao();
        
        // teste 1: subtracao de numeros positivos 
        int subtrai = sub.subtrair(5,4);
        System.out.println(subtrai);
             }
             
              public void SubtrairNumNegativos(){
             subtracao sub = new subtracao();
        
        // teste 2: subtracao de numeros negativos
        int subtrai = sub.subtrair(-1,-2);
        System.out.println(subtrai);
              }
              
               public void SubtrairNumPositivoNumZero(){
             subtracao sub = new subtracao();
        
        // teste 3: subtracao de numero positivo e com numero zero
        int subtrai = sub.subtrair(1,0);
        System.out.println(subtrai);
        
               }
               
                public void SubtrairNumZeroNumPositivo(){
             subtracao sub = new subtracao();
        
        // teste 4: subtracao de numero zero por numero positivo
        int subtrai = sub.subtrair(0,2);
        System.out.println(subtrai);
                }
                
                 public void SubtrairNumNegativoNumPositivo(){
             subtracao sub = new subtracao();
        
        // teste 5: subtracao de numero negativo e numero positivo
        int subtrai = sub.subtrair(-1,7);
        System.out.println(subtrai);
                 }
                 
               public void SubtrairNumPositivoNumNegativo(){
             subtracao sub = new subtracao();
           
         // teste 6: subtracao de numero positivo e numero negativo
        int subtrai = sub.subtrair(1,-7);
        System.out.println(subtrai);
}
               
               // divisao
               
               public void DIvidirNumPositivos(){
                divisao div = new divisao();
        
        // teste 1: divisao de dois numeros positivos
         float divid = div.dividir(1, 2);
        System.out.println(divid);
               }
               
              public void DIvidirNumNegativos(){
                divisao div = new divisao(); 
        //teste 2: divisao de dois numeros negativos
        float divid = div.dividir(-1, -2);
        System.out.println(divid);
              }
           
              public void DIvidirNumZeroNum(){
                divisao div = new divisao();
        //teste 3: divisao de zero por algum numero
        float divid = div.dividir(0, 1);
        System.out.println(divid);
              }
              
             public void DIvidirNumNumZero(){
                divisao div = new divisao(); 
        // teste 4: divisao de algum numero por zero
        float divid = div.dividir(1, 0);
        System.out.println(divid);
             }
             
             public void DIvidirNumPositivoNumNegativo(){
                divisao div = new divisao();
        // teste 5: divisao de dividendo positivo e divisor negativo
        float divid = div.dividir(5, -1);
        System.out.println(divid);
             }
             
             public void DIvidirNumNegativoNumPositivo(){
                divisao div = new divisao();
        // teste 6: divisao de dividendo negativo e divisor positivo
       float divid = div.dividir(-1, 5);
        System.out.println(divid);
     }
             
             // multiplicacao
             
             public void MultiplicarNumPositivos(){
              multiplicacao multiplic = new multiplicacao();
        
        // teste 1: multiplicacao de numeros positivos
        int multiplica = multiplic.multiplicar(6, 6);
        System.out.println(multiplica);
             }
             
             public void MultiplicarNumNegativos(){
              multiplicacao multiplic = new multiplicacao();
        // teste 2: multiplicacao de numeros negativos
       int multiplica = multiplic.multiplicar(-6, -6);
        System.out.println(multiplica);
             }
             
             public void MultiplicarNumZero(){
              multiplicacao multiplic = new multiplicacao();
        //teste 3: multiplicacao por zero
       int multiplica = multiplic.multiplicar(6, 0);
        System.out.println(multiplica);
             }
        
             public void MultiplicarNumPositivoNumNegativo(){
              multiplicacao multiplic = new multiplicacao();
        // teste 4: multiplicacao com numero negativo e positivo
        int multiplica = multiplic.multiplicar(-6, 6);
        System.out.println(multiplica);
        
     }
     }
    
