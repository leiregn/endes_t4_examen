package refactor;
/*
    Extraer la impresión del título y conclusión en sus propios métodos.
     */
public class Report {
        void printTitulo() {
            // imprimir título
            System.out.println("Título del Reporte");
        }
        void printReporte(){
            // contenido del reporte
            System.out.println("Contenido 1...");
            System.out.println("Contenido 2...");
            // más contenido...
        }
        void printConclusion() {
                // imprimir conclusión
                System.out.println("Conclusión del Reporte");
        }
}

