package vetores;


import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new java.util.Scanner(System.in);
        int n;
        double aux = 0;
        System.out.print("Digite o numero de posicoes do vetor:");
        n = sc.nextInt();
        double[] vect = new double[n];

        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print("Digite o tamanho do vetor "+i+":");
            vect[i] = sc.nextDouble();
        }
        for(int i=0; i < n; i++) {
            aux += vect[i];
        }
        System.out.println("Media da altura do vetor: "+aux/n);
        sc.close();
    }
}