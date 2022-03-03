package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //Variables locales
        var a = 10;
        var b = 2;
        miMetodo();
       
        
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
        
        //aritmetica1 = null;
        //System.gc();
    }
    
    public static void miMetodo(){
        //la variable a esta fuera del alcance donde fue definida
        //a = 10;
        System.out.println("otro metodo");
        System.out.println("");
    }
}
