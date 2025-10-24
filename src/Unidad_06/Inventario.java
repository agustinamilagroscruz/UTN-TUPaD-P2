package Unidad_06;

import java.util.ArrayList;
    public class Inventario {

        private ArrayList<Producto> productos;

        public Inventario() {
            productos = new ArrayList<>();
        }

        public void agregarProducto(Producto p) {
            productos.add(p);
        }

        public void listarProductos() {
            if (productos.isEmpty()) {
                System.out.println("No hay productos en el inventario.");
            } else {
                for (Producto p : productos) {
                    p.mostrarInfo();
                }
            }
        }

        public Producto buscarProductoPorId(String id) {
            for (Producto p : productos) {
                if (p.getId().equalsIgnoreCase(id)) {
                    return p;
                }
            }
            return null;
        }

        public void eliminarProducto(String id) {
            Producto encontrado = buscarProductoPorId(id);
            if (encontrado != null) {
                productos.remove(encontrado);
                System.out.println("Producto eliminado correctamente.");
            } else {
                System.out.println("No se encontró un producto con el ID especificado.");
            }
        }

        public void actualizarStock(String id, int nuevaCantidad) {
            Producto p = buscarProductoPorId(id);
            if (p != null) {
                p.setCantidad(nuevaCantidad);
                System.out.println("Stock actualizado correctamente.");
            } else {
                System.out.println("No se encontró el producto.");
            }
        }

        public void filtrarPorCategoria(CategoriaProducto categoria) {
            System.out.println("Productos de la categoría: " + categoria);
            for (Producto p : productos) {
                if (p.getCategoria() == categoria) {
                    p.mostrarInfo();
                }
            }
        }

        public int obtenerTotalStock() {
            int total = 0;
            for (Producto p : productos) {
                total += p.getCantidad();
            }
            return total;
        }

        public Producto obtenerProductoConMayorStock() {
            if (productos.isEmpty()) return null;

            Producto mayor = productos.get(0);
            for (Producto p : productos) {
                if (p.getCantidad() > mayor.getCantidad()) {
                    mayor = p;
                }
            }
            return mayor;
        }

        public void filtrarProductosPorPrecio(double min, double max) {
            System.out.println("Productos con precio entre $" + min + " y $" + max + ":");
            for (Producto p : productos) {
                if (p.getPrecio() >= min && p.getPrecio() <= max) {
                    p.mostrarInfo();
                }
            }
        }

        public void mostrarCategoriasDisponibles() {
            System.out.println("Categorías disponibles:");
            for (CategoriaProducto c : CategoriaProducto.values()) {
                System.out.println("- " + c);
            }
        }
    }


