import java.util.Scanner;

public class Conv_tempMRG{

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //Declaração de variaveis
        double C, F;
        int op;

        Scanner entrada = new Scanner(System.in);

       

        do{

            System.out.println("\n\t\t\t -- Conversor de temperatura -- \n");

            System.out.println("1. Celsius--> Fahrenheit");
            System.out.println("2. Fahrenheit--> Celsius");
            System.out.println("3. Sair");
                        
            //Criação e instancia do objeto de entrada
            System.out.print("Opção: ");
            op = entrada.nextInt();

            //Miguel
        
                System.out.println("\n\t\t\t -- Celsius--> Fahrenheit -- \n");

                //entradas
                if(op == 1){
	        System.out.print("Informe Cel: ");
	        C = entrada.nextInt();
	
	        //Processamentos
	        F = 9 * C/5  + 32;
	
	        //Saida
	        System.out.println("\nFah= " + F + "\n\n");
        } else if(op == 2){

             
            //Miguel
        
             System.out.println("\n\t\t\t -- Fahrenheit--> Celsius -- \n");

             //entradas
        //}else if(op == 2){
         System.out.print("Informe Fah: ");
         F = entrada.nextDouble();
 
         //Processamentos
         C = (F - 32)/9 * 5;
 
         //Saida
         System.out.println("\nCel= " + C + "\n\n");
        
        } else if(op == 3){
            System.out.println("Forte abraço!");

        }
        }while(op!=3);

    
    
        
    

    }
    }