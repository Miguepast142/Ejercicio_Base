import java.util.Scanner;
public class Estructura_Datos_Ejercicio
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] Nombres = new String[30];
        int[] Codigos = new int[10];
        int[] Valores = new int[50];
        double[] Descuentos = new double[5];
        double[] Mesuno = new double[50];
        double[] Mesdos = new double[50];
        double[] Mestres = new double[50];
        int Cant_Productos;
        String Nombre;
        int Codigo, Valor;
        double Descuento, Mes1, Mes2, Mes3;
        double TOTAL = 0;
        System.out.println("Digite la cantidad de productos comprados");
        Cant_Productos = sc.nextInt();
        for(int x = 0; x < Cant_Productos; x++){
            System.out.println("Escriba el codigo del producto");
            Codigo = sc.nextInt();
            System.out.println("Escriba el nombre del producto");
            Nombre = sc.next();
            System.out.println("Escriba el valor del producto");
            Valor = sc.nextInt();
            System.out.println("Escriba el descuento respectivo del producto");
            Descuento = sc.nextDouble();
            System.out.println("Escriba el promedio total de las ventas en el mes 1");
            Mes1 = sc.nextDouble();
            System.out.println("Escriba el promedio total de las ventas en el mes 2");
            Mes2 = sc.nextDouble();
            System.out.println("Escriba el promedio total de las ventas en el mes 3");
            Mes3 = sc.nextDouble();
            Codigos[x] = Codigo;
            Nombres[x] = Nombre;
            Valores[x] = Valor;
            Descuentos[x] = Descuento;
            Mesuno[x] = Mes1;
            Mesdos[x] = Mes2;
            Mestres[x] = Mes3;
        }
        for(int x = 0; x < Cant_Productos; x++){
            TOTAL = TOTAL + ((Mesuno[x]*Descuentos[x])+(Mesdos[x]*Descuentos[x])+(Mestres[x]*Descuentos[x])/3)/Cant_Productos;
        }
        System.out.println("El total de los tres meses con descuento incluido es: "+ TOTAL);
    }
}