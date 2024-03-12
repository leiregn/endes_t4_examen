package org.example;
import java.util.ArrayList;
import java.util.List;
/** Esta clase representa a un cliente
 * la clase Cliente tiene los datos de dicha persona
 * y seran necesarios para crearle una cuenta bancaria
 * @author Leire
 * @version 1.0, 12/03/2024
 */


    public class Cliente {
        private String nombre;
        private String apellido;
        private String id;
        private List<CuentaBancaria> cuentas;

    /**
     * En la clase Cliente te piden los siguientes parametros
     * @param nombre el nombre del cliente;
     * @param apellido  el apellido del cliente;
     * @param id  la identificacion del cliente;
     * */
        public Cliente(String nombre, String apellido, String id) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.id = id;
            this.cuentas = new ArrayList<>();
        }
        /**
         * Obtener el nombre del cliente
         @return el nombre del cliente*/
        public String getNombre() {
            return nombre;
        }
        /**
         * Establece el nombre del cliente
         * */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        /**Obtener apellido
         * @return apellido del cliente*/
        public String getApellido() {
            return apellido;
        }
        /**Establece el apellido*/
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
         /**Obtener id
         * @return id del cliente*/
        public String getId() {
            return id;
        }
        /**Establece el id*/
        public void setId(String id) {
            this.id = id;
        }

        /**
        * Obtiene una duplicacion de la lista de cuentas bancarias relacionadas al cliente.
        * @return Una lista de cuentas bancarias asociadas al cliente.
        */
        public List<CuentaBancaria> getCuentas() {
            return new ArrayList<>(cuentas);
        }
         /**
        * Agrega una nueva cuenta bancaria a la lista de cuentas asociadas al cliente.
        * @param cuentas La cuenta bancaria a agregar.
        */
        public void agregarCuenta(CuentaBancaria cuenta) {
            cuentas.add(cuenta);
        }
        /**
        * Cierra una cuenta bancaria del cliente.
        * @param numeroCuenta número de la cuenta para cerrar.
        * @return true si la cuenta se cerró con éxito, false si no se encontró la cuenta.
        */
        public boolean cerrarCuenta(String numeroCuenta) {
            return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
        }
        /**
        * Devuelve una lista en forma de cadena sobre el Cliente.
        * @return cadena que representa al objeto Cliente, nombre, apellido, identificación y cuentas asociadas.
        */
        @Override
        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", id='" + id + '\'' +
                    ", cuentas=" + cuentas +
                    '}';
        }
    }

