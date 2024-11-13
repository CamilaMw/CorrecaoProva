package correcaoprovaq4;

import java.util.Scanner;

public class Correcaoprovaq4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vet =new int[5]; 
        
        for(int i=0;i<5;i++){
            System.out.println("Digte o " + (i+1) + " numero: ");
            vet[i] = sc.nextInt();
        }
    
        for(int i=0;i<4;i++){
            for(int j = i+1;j<5;j++){
                if(vet[i]>vet[j]){
                    int aux = vet[j];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        
        for(int i=0;i<5;i++){
            System.out.println("\t" + vet[i]);
        }
    
    }
    
}
