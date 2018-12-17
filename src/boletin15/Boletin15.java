package boletin15;

public class Boletin15 {

    public static void main(String[] args) {
        Productos p1 = new Productos("C1", 24);
        Productos p2 = new Productos("H23", 234);
        Productos p3 = new Productos("M30", 109);
        Productos p4 = new Productos("K123", 247);
        Factura f1 = new Factura();
        
        try{
        f1.InsertarDatos(p1);
        f1.InsertarDatos(p2);
        f1.InsertarDatos(p3);
                
        f1.visualizarFactura();
         System.out.println("\n");
        f1.modificar2Elemento(p4);
        f1.visualizarFactura();
        
        }catch (CodigoException ex){
            System.out.println(ex.getMessage());
        }

        
    }
    
}
