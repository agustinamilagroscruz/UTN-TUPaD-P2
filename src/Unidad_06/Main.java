import Unidad_06.CategoriaProducto;
import Unidad_06.Inventario;
import Unidad_06.Producto;

public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz", 1500, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 5000, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Licuadora", 32000, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan", 1200, 50, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("LISTA DE PRODUCTOS:");
        inventario.listarProductos();

        System.out.println("\nBUSCAR PRODUCTO POR ID:");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\nFILTRO POR CATEGORÍA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\nELIMINAR PRODUCTO:");
        inventario.eliminarProducto("P002");

        System.out.println("\nACTUALIZAR STOCK:");
        inventario.actualizarStock("P001", 60);

        System.out.println("\nTOTAL DE STOCK DISPONIBLE: " + inventario.obtenerTotalStock());

        System.out.println("\nPRODUCTO CON MAYOR STOCK:");
        System.out.println(inventario.obtenerProductoConMayorStock());

        System.out.println("\nFILTRAR POR PRECIO ENTRE $1000 Y $30000:");
        inventario.filtrarProductosPorPrecio(1000, 30000);

        System.out.println("\nCATEGORÍAS DISPONIBLES:");
        inventario.mostrarCategoriasDisponibles();

        System.out.println("\nEjecución finalizada correctamente.");
    }

