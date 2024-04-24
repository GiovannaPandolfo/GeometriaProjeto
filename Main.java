import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double area = 0;
        double largura = 0;
        double altura = 0;

        for(int i=1; i<=1; i++) {
            System.out.println("digite a altura");
            altura = ler.nextInt();

            System.out.println("digite a largura");
            largura = ler.nextInt();
            area = largura * altura;
        }
        System.out.println("a area: "+area);
    }
}