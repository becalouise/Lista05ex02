package Lista05ex02;
import java.util.Scanner;
public class Ex02{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero=sc.nextInt();
        sc.close();
        imprimeLinha(numero);
    }

    static void imprimeLinha(int numero){
        int a, b;

        for(a=1;a<=numero;a++){
            for(b=1;b<=a;b++){
            System.out.print(b+"   ");
            }
            System.out.println();
        }
    }
}
