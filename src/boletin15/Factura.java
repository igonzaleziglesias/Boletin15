package boletin15;

public class Factura {

    private static int numero = 0;
    private Productos[] productos = new Productos[3];

    public Factura() {
    }

    public void InsertarDatos(Productos producto) throws CodigoException {
        String letra = "";
        String numero ,numero1, numero2 = "";
        numero = String.format("%-10s", producto.getCodigo()).substring(1,producto.getCodigo().length());
        letra = String.format("%-10s", producto.getCodigo()).substring(0, 1);
        numero1 = String.format("%-10s", producto.getCodigo()).substring(1, 2);
        numero2 = String.format("%-10s", producto.getCodigo()).substring(2, 3);

        char l = letra.charAt(0);

        if (!Character.isLetter(l)) {
            throw new CodigoException("Codigo erroneo (letra)");
        }
        
        
        int n;
        
        /**int cont1= 1,cont2=2;
        
        for (int i=1;i<numero.length();i++){
              numero1 = producto.getCodigo().substring(cont1, cont2);
              cont1++;
              cont2++;
              
        }**/
        
        
        
        
        
        
        
        
        try {
            n = Integer.parseInt(numero1);
        } catch (NumberFormatException ex) {
            throw new CodigoException("Codigo erroneo (numero1)");
        }

        
        try {
            if (producto.getCodigo().length() == 2) {
                n = 0;
            } else {
                n = Integer.parseInt(numero2);
            }
        } catch (NumberFormatException ex) {
            throw new CodigoException("Codigo erroneo (numero2)");
        }

        
        if (this.numero <= 2) {
            this.productos[this.numero] = producto;
            this.numero++;
        } else {
            System.out.println("lleno");
        }

    }

    public void modificar2Elemento(Productos producto) throws CodigoException{
        String letra = "";
        String numero1, numero2,numero3 = "";

        letra = String.format("%-10s", producto.getCodigo()).substring(0, 1);
        numero1 = String.format("%-10s", producto.getCodigo()).substring(1, 2);
        numero2 = String.format("%-10s", producto.getCodigo()).substring(2, 3);
        numero3 = String.format("%-10s", producto.getCodigo()).substring(3, 4);
 
        char l = letra.charAt(0);

        if (!Character.isLetter(l)) {
            throw new CodigoException("Codigo erroneo (letra)");
        }
        
        
        int n;
        try {
            n = Integer.parseInt(numero1);
        } catch (NumberFormatException ex) {
            throw new CodigoException("Codigo erroneo (numero1)");
        }

        
        try {
            if (producto.getCodigo().length() == 2) {
                n = 0;
            } else {
                n = Integer.parseInt(numero2);
            }
        } catch (NumberFormatException ex) {
            throw new CodigoException("Codigo erroneo (numero2)");
        }
        
        try {
            if (producto.getCodigo().length() == 3) {
                n = 0;
            } else {
                n = Integer.parseInt(numero3);
            }
        } catch (NumberFormatException ex) {
            throw new CodigoException("Codigo erroneo (numero3)");
        }
        
        this.productos[1] = producto;
    }

    public void visualizarFactura() {
        System.out.println("Factura:");

        for (int i = 0; i < numero; i++) {
            System.out.println("Codigo: " + String.format("%-10s", productos[i].getCodigo()) + "Precio: " + productos[i].getPrecio());
        }
    }

   

    

}
