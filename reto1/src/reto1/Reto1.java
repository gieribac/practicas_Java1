package reto1;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *@author GIOVANNI
 */
public class Reto1 {

    public static void main(String[] args) {
        Integer cant,num;
        int j = -1;
        double valbruto, valT_bruto, valT_final, valDescuento, val_iva;
        String name, namep, doc;
        Map<String, String> _regClients = new LinkedHashMap<String, String>();  
        Scanner enter = new Scanner(System.in);
        System.out.println("--------INGRESO DE DATOS DE FACTURACION--------\n");
        System.out.println("Ingrese la cantidad de facturas: ");        
        cant = enter.nextInt();
        while(cant<1) {
            System.out.println("La cantidad de facturas debe ser mayor, ingrese cantidad de nuevo: ");
            cant = enter.nextInt();
        }
        double matriz[][] = new double[cant][4];
        for (int i=0; i<cant; i++){
            valT_bruto = 0;
            System.out.println("Ingrese el nombre del cliente "+(i+1)+": ");
            name = enter.next();
            System.out.println("Ingrese el número de documento del cliente "+(i+1)+": ");
            doc = enter.next();
            System.out.println("Ingrese la cantidad de productos del cliente "+(i+1)+":");
            num = enter.nextInt();
            while(num<1) {
                System.out.println("La cantidad de productos debe ser mayor, ingrese cantidad de nuevo: ");
                num = enter.nextInt();
            }
            for (int k=0; k<num; k++){
                System.out.println("Ingrese nombre de producto "+(k+1)+":");
                namep = enter.next();
                System.out.println("Ingrese el valor bruto del producto "+(k+1)+":");
                valbruto = enter.nextDouble();         
                valT_bruto = valT_bruto+valbruto;
            }
            if (valT_bruto>=100000){
                valT_final = valT_bruto*0.9;
                valDescuento = valT_bruto*0.1;
                val_iva = 0;
            }else {
                valT_final = valT_bruto*1.05;
                valDescuento = 0;
                val_iva = valT_bruto*0.05;
            }
            matriz[i][0] = valT_bruto;
            matriz[i][1] = valDescuento;
            matriz[i][2] = val_iva;
            matriz[i][3] = valT_final;
            _regClients.put(name, doc);
        }
        System.out.println("------------REPORTE DE VENTAS------------\n");
        for (Map.Entry<String, String> entry : _regClients.entrySet()) {
            j++;
            System.out.println("Nombre: "+entry.getKey()+", NoDocumento: "+entry.getValue());
            System.out.println("Valor total bruto: "+matriz[j][0]);
            System.out.println("Valor descuento: "+matriz[j][1]);
            System.out.println("Valor IVA: "+matriz[j][2]);
            System.out.println("Valor total final: "+matriz[j][3]+"\n");
        }
    } 
}