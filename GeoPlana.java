/**
 * GeoPlana
 */
import java.util.Scanner;

public class GeoPlana {
        double area, area2, area3 = 0;
        double largura = 0;
        double altura = 0;
        double areatriangulo = 0;
        double raio = 0;
        double areacirculo = 0;
        double basesuperior = 0;
        double baseinferior = 0;
        double areatrapezio = 0;
        double digmaior = 0;
        double digmenor = 0;
        double lado = 0;
        

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

       public void Paralelo(){
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

       public void losango(){
        Scanner ler = new Scanner(System.in);
        for(int i=1; i<=1; i++) {
            System.out.println("digite a diagonal maior");
            digmaior = ler.nextInt();

            System.out.println("digite a diagonal menor");
            digmenor = ler.nextInt();
            area = digmaior * digmenor;
            area2 = area/2;
        }
        System.out.println("a area: "+area2);
       }

       public void trianguloequilatero(){
        Scanner ler = new Scanner(System.in);
        for(int i=1; i<=1; i++) {
            System.out.println("digite o lado");
            lado = ler.nextInt();

            area = lado * lado;
            area2 = area/4;
            area3 = area2 * 1.732;
        }
        System.out.println("a area: "+area3);
       }
       

       

       
    

      public static void main(String[] args) {
        
        GeoPlana plana = new GeoPlana();
        plana.trapezio();
    }
 }
