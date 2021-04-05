/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author A.L.C
 */
public class Signos {
    public static void main(String[] args) {
        //declaraçao de variaveis
        int dia,mes;
        
        
        //Criaçao e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        
        //apresentaçao do sistema
        System.out.println("|n\t\t\t -- signos --\n");
        
        
        //entradas
        System.out.println("Informe o dia:");
        dia = entrada.nextInt();
        System.out.println("Informe o mes:");
        mes = entrada.nextInt();
        
        
        //processamento
        if ((dia >= 1)&& (dia<=31)){
            if((mes == 12)|| (mes == 1)){
                if ((mes ==12) && (dia >=22)){
                    System.out.println("Capricórnio");
                }else{
                    System.out.println("Sagitário");
                }
            }else if ((mes == 1)||(mes == 2)){ 
                        //saida
                        if ((mes ==1) && (dia >=22)){
                            System.out.println("Aquário");
                        }else{
                            System.out.println("Capricórnio");
                         }
            }else if ((mes == 2)||(mes == 3)){ 
                        //saida
                        if ((mes ==2) && (dia >=19)){
                            System.out.println("Peixes");
                        }else{
                            System.out.println("Aquário");
                        }
                         }else if ((mes == 3)||(mes == 4)){ 
                        //saida
                   if ((mes ==3) && (dia >=20)){
                            System.out.println("Áries");
                        }else{
                            System.out.println("Touro");
                        }else if ((mes == 3)||(mes == 4)){ 
                        //saida
                   if ((mes ==4) && (dia >=21)){
                            System.out.println("Touro");
                        }else{
                            System.out.println("Áries");
                         }else if ((mes == 5)||(mes == 6)){ 
                        //saida
                   if ((mes ==5) && (dia >=21)){
                            System.out.println("Gêmeos");
                        }else{
                            System.out.println("Touro");{
                         }else if ((mes == 6)||(mes == 7)){ 
                        //saida
                   if ((mes ==6) && (dia >=22)){
                            System.out.println("Câncer");
                        }else{
                            System.out.println("Gêmeos");
                         }else if ((mes == 7)||(mes == 8)){ 
                        //saida
                   if ((mes ==7) && (dia >=22)){
                            System.out.println("Leão");
                        }else{
                            System.out.println("Câncer");
                        }else if ((mes == 9)||(mes == 10)){ 
                        //saida
                   if ((mes ==9) && (dia >=23)){
                            System.out.println("Libra");
                        }else{
                            System.out.println("Virgem");
                        }else if ((mes == 10)||(mes == 11)){ 
                        //saida
                   if ((mes ==10) && (dia >=23)){
                            System.out.println("Escorpião");
                        }else{
                            System.out.println("Libra");
               
                    
                }
               
                     }else{     
                                 // saida
                    System.out.println("Mes %d incorreto!\nn,dia");
                    }else{     
                                 // saida
                    System.out.println("Mes %d incorreto!\nn,mes");}
                                 
                                               
                                                              
                                 } 
        
                
    }
}
