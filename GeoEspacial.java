
/**
 * GeoEspacial
 */
import java.util.Scanner;

public class GeoEspacial {
        double area, area2, area3, raiz2, raiz, base, basem, areacirculo, areacilindro, areaL, areaB, volume, geratriz, areasuperficial, faces, areaface, areatotal, face, raioM= 0;
        double largura = 0;
        double altura = 0;
        double raio = 0;

        public void circulo (){
                Scanner ler = new Scanner(System.in);
                for(int i=1; i<=1; i++) {
                    System.out.println("digite o raio");
                    raio = ler.nextInt();

                    System.out.println("digite o altura");
                    raio = ler.nextInt();

                    area = raio * raio;
                    areacirculo = area * 3.14;
                    areacilindro = altura * area;

                    areaL = 6.28 * raio * altura;
                    areaB = 3.14 * area;
                    volume = 3.14 * area * altura;

                }
                System.out.println("o volume cilindro conciderando pi 3,14 é "+volume+" e a area lateral é:"+areaL+". e a area bases sao: "+areaB);
               }

               public void cone (){
                Scanner ler = new Scanner(System.in);
                for(int i=1; i<=1; i++) {
                    System.out.println("digite o raio");
                    raio = ler.nextInt();
                    System.out.println("digite a geratriz");
                    geratriz = ler.nextInt();
                    System.out.println("digite a altura");
                    altura = ler.nextInt();
        
                    areaL = 3.14 * raio * geratriz;
                    area = raio * raio;
                    areaB = 3.14 * area;
                    area2 = 3.14 * area * altura;
                    volume = area2 / 3;


                }
                System.out.println("a area lateral é"+areaL+" area bases é "+areaB+" e o volume"+volume);
               }

               public void esfera (){
                Scanner ler = new Scanner(System.in);
                for(int i=1; i<=1; i++) {
                    System.out.println("digite o raio");
                    raio = ler.nextInt();

                    area = raio * raio;
                    areasuperficial = 4 * 3.14 * area;
                    area2 = raio * raio * raio;
                    volume = 1.33 * 3.14 * area2;

                }
                System.out.println("a area esfera é;"+volume+" e a area superficie é; "+areasuperficial);
               }
               
               public void piramide(){
                Scanner ler = new Scanner(System.in);
                for(int i=1; i<=1; i++) {
                    System.out.println("digite o numero de faces");
                    faces = ler.nextInt();
                    System.out.println("digite a area de uma face");
                    areaface = ler.nextInt();
                    System.out.println("digite a area da base");
                    areaB = ler.nextInt();
                    System.out.println("digite a altura");
                    altura = ler.nextInt();

                    areaL = faces * areaface;
                    areatotal =  areaL + areaB;
                    area2 = areaB * altura;
                    area3 = area2 / 3;
                }
                System.out.println("a area lateral:"+areaL+" area total:"+areatotal+" e o volume é:"+area3);
               }

               public void troncoCone(){
                Scanner ler = new Scanner(System.in);
                for(int i=1; i<=1; i++) {
                    System.out.println("digite o raio base");
                    raio = ler.nextInt();
                    System.out.println("digite o raio menor");
                    raioM = ler.nextInt();
                    System.out.println("digite o raio altura");
                    altura= ler.nextInt();

                    area = raio * raio;
                    area2 = raioM * raioM;
                    areaL = (area + raio)*area2 + raioM;
                    areaB = 3.14 * altura * areaL;
                    volume = areaB / 3;

                }
                System.out.println("o volume do tronco cone é:"+volume);
               }

               public void prisma(){
                Scanner ler = new Scanner(System.in);
                for(int i=1; i<=1; i++) {
                    System.out.println("digite a area da base");
                    areaB = ler.nextInt();
                    System.out.println("digite a altura");     
                    altura = ler.nextInt();
                    System.out.println("qual o numero de faces laerais");     
                    faces = ler.nextInt();
                    System.out.println("digite a area da face lateral");     
                    face = ler.nextInt();

                    area = areaB * altura;
                    area2 = face * faces + areaB;
                    volume = areaB * altura;
                }
                System.out.println("a area total é"+area2+". A area lateral é:"+area+" e o volume é:"+volume);
               }

               public void troncopiramide(){
                Scanner ler = new Scanner(System.in);
                for(int i=1; i<=1; i++) {
                    System.out.println("digite a altura do tronco");
                    altura = ler.nextInt();
                    System.out.println("digite a area da base menor");
                    basem = ler.nextInt();
                    System.out.println("digite a area da base");
                    base = ler.nextInt();

                    area = basem + base;
                    area2 = basem * basem;
                    area3 = base * base;
                    volume = area2 * area3;
                    raiz = Math.sqrt(volume);
                    raiz2 = altura * raiz;
                }
                System.out.println("o volume do tronco é;"+raiz2);
               }





        public static void main(String[] args) {
        
                GeoPlana plana = new GeoEspacial();
                plana.trapezio();
            }
        
}
        