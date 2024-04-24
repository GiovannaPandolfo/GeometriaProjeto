/**
 * GeoPlana
 */
import java.util.Scanner;

public class GeoPlana {
        double area = 0;
        double area2 = 0;
        double largura = 0;
        double altura = 0;
        double areatriangulo = 0;
        double raio = 0;
        double areacirculo = 0;
        double basesuperior = 0;
        double baseinferior = 0;
        double areatrapezio = 0;

        

    public void Retangulo(){

        Scanner ler = new Scanner(System.in);

        for(int i=1; i<=1; i++) {
            System.out.println("digite a altura");
            altura = ler.nextInt();

            System.out.println("digite a largura");
            largura = ler.nextInt();
            area = largura * altura;
        }
        System.out.println("a area: "+area);
       }
 

       public void triangulo(){
        Scanner ler = new Scanner(System.in);
        for(int i=1; i<=1; i++) {
            System.out.println("digite a altura");
            altura = ler.nextInt();

            System.out.println("digite a largura");
            largura = ler.nextInt();
            area = largura * altura;
            areatriangulo = area / 3;
        }
        System.out.println("a area: "+areatriangulo);
       }
    

       public void trapezio(){
        Scanner ler = new Scanner(System.in);
        for(int i=1; i<=1; i++) {
            System.out.println("digite a base inferior");
            baseinferior = ler.nextInt();

            System.out.println("digite a base superior");
            basesuperior = ler.nextInt();

            System.out.println("digite a altura");
            altura = ler.nextInt();


            area = basesuperior + baseinferior;
            area2 = area * altura;
            areatrapezio = area2 / 2;
        }
        System.out.println("a area: "+areatrapezio);
       }
  


       public void circulo (){
        Scanner ler = new Scanner(System.in);
        for(int i=1; i<=1; i++) {
            System.out.println("digite o raio");
            raio = ler.nextInt();

            area = raio * raio;
            areacirculo = area * 3.14;
        }
        System.out.println("a area circulo conciderando pi 3,14 é "+areacirculo);
       }
       
    

      public static void main(String[] args) {
        
        GeoPlana plana = new GeoPlana();
        plana.trapezio();
    }
 }
