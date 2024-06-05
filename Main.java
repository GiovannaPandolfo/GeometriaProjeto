import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        system.out("1 - quadrado/retangulo"+"\n"+"2 - triangulo"+"\n"+"3 - triangulo equilatero"+"\n"+"4 - paralelograma"+"\n"+"5 - losango"+"\n"+"6 - trapezio"+"\n"+"7 - prismas"+"\n"+"8 - cilindro"+"\n"+"9 - piramide"+"\n"+"10 - esfera"+"\n"+"11 - cone"+"\n"+"12 - tronco cone"+"\n"+"13 tronco piramide")
        System.out.println("digite o numero da forma a ser calculada:");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                 GeoPlana.quadrado();
                break;
                
                case 2:
                GeoPlana.triangulo();
               break;

               case 3:
                 GeoPlana.trianguloequilatero();
                break;

                case 4:
                 GeoPlana.paralelo();
                break;

                case 5:
                 GeoPlana.losango();       
                break;

                case 6:
                 GeoPlana.trapezio();       
                break;

                case 7:
                 GeoPlana.prisma();
                break;

                case 8:
                 GeoPlana.cilindro();
                break;

                case 9:
                 GeoPlana.piramide();
                break;

                case 10:
                 GeoPlana.esfera();
                break;

                case 11:
                 GeoPlana.cone();      
                break; 

                case 12:
                 GeoPlana.troncocone();       
                break;

                case 13:
                 GeoPlana.troncopiraide();       
                break;
                
            default:
                break;
        }
    }


}