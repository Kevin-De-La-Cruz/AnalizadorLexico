
package expresiones;
public class EnumMarcasLaptop {
    public enum MarcaLaptop {//Enumeración de los datos
        DELL("Dell", "Estados Unidos"),
        LENOVO("Lenovo", "China"),
        APPLE("Apple", "Estados Unidos"),
        HP("HP", "Estados Unidos"),
        ASUS("Asus", "Taiwán");

        private final String nombre;//alamacemar nombre y paisorigen
        private final String paisOrigen;

        MarcaLaptop(String nombre, String paisOrigen) {// Constructor que asigna los valores de nombre y país de origen
            this.nombre = nombre;
            this.paisOrigen = paisOrigen;
        }
        // Métodos públicos para que obtengamos el nombre de la marca y el país de origen
        public String getNombre() {
            return nombre;
        }

        public String getPaisOrigen() {
            return paisOrigen;
        }

        @Override//Cadena de texto
        public String toString() {
            return "Marca: " + nombre + ", Pais de Origen: " + paisOrigen;
        }
    }

    public static void main(String[] args) {//Método principal main
        MarcaLaptop marca1 = MarcaLaptop.DELL;
        MarcaLaptop marca2 = MarcaLaptop.LENOVO;
        MarcaLaptop marca3 = MarcaLaptop.APPLE;
        //Se manda a imprimir
        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
    }
}