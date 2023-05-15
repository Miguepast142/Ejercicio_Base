// Clase 1 Exito_POO
public class Exito_POO
{
    String Nombre;
    int Codigo;
    int Valor;
    double Descuento;
    double Mesuno;
    double Mesdos;
    double Mestres;
}

//Clase 2 Meses
import java.util.Scanner;
public class Meses
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Cant_Productos;
        Exito_POO[]losProductos = new Exito_POO[50];
        double[] Descuentos = new double[50];
        String Nombre;
        int Codigo, Valor;
        double Descuento, Mes1, Mes2, Mes3;
        double TOTAL = 0;
        System.out.println("Digite la cantidad de Productos comprados");
        Cant_Productos = sc.nextInt();
        for(int x = 0; x < Cant_Productos; x++){
            System.out.println("Digite el codigo del producto");
            Codigo = sc.nextInt();
            System.out.println("Digite el nombre del producto");
            Nombre = sc.next();
            System.out.println("Digite el valor del producto");
            Valor = sc.nextInt();
            System.out.println("Digite el descuento del producto");
            Descuento = sc.nextDouble();
            System.out.println("Digite el promedio total del mes 1");
            Mes1 = sc.nextDouble();
            System.out.println("Digite el promedio total del mes 2");
            Mes2 = sc.nextDouble();
            System.out.println("Digite el promedio total del mes 3");
            Mes3 = sc.nextDouble();
            Exito_POO unProducto = new Exito_POO();
            unProducto.Codigo = Codigo;
            unProducto.Nombre = Nombre;
            unProducto.Valor = Valor;
            unProducto.Descuento = Descuento;
            unProducto.Mesuno = Mes1;
            unProducto.Mesdos = Mes2;
            unProducto.Mestres = Mes3;
            Descuentos[x] = Descuento;
            losProductos[x] = unProducto;
        }
        for(int x = 0; x < Cant_Productos; x++){
            double sum = ((losProductos[x].Mesuno*Descuentos[x])+(losProductos[x].Mesdos*Descuentos[x])+(losProductos[x].Mestres*Descuentos[x])/3);
            TOTAL = TOTAL + sum / Cant_Productos;
        }
        System.out.println("El total de los tres meses con descuento incluido es: "+ TOTAL);
    }
}