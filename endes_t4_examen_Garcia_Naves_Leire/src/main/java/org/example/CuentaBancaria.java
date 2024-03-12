package org.example;
/** Esta clase representa la cuenta bancaria del cliente
 * la clase CuentaBancaria tiene los datos del cliente
 * y seran necesarios para darle la informacion de dicha cuenta
 * @author Leire
 * @version 1.0, 12/03/2024
 */
public class CuentaBancaria {
        private String numeroCuenta;
        private double saldo;
        private Cliente propietario;
        /**
        * En la clase Cliente te piden los siguientes parametros
         * @param numeroCuenta el numero de cuenta;
        * @param saldo  el saldo de la cuenta;
        * @param propietario la informacion del propietario;
        * */
        public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
            this.propietario = propietario;
        }
        /**Obtener Numero de Cuenta
        * @return  numero de cuenta del cliente*/
        public String getNumeroCuenta() {
            return numeroCuenta;
        }
        /**
        * Establece el numero de cuenta
        * */
        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }
         /**Obtener Saldo
        * @return saldo de la cuenta bancaria del cliente*/
        public double getSaldo() {
            return saldo;
        }
        /**
        * Establece el saldo del cliente
        * */
        public void setSaldo(double saldo)
        {
            this.saldo = saldo;
        }
        /**Obtener
        * @return propietario de la cuenta bancaria*/
        public Cliente getPropietario() {

            return propietario;
        }
         /**
         * Establece el propietario de la cuenta
        * */
        public void setPropietario(Cliente propietario) {

            this.propietario = propietario;
        }
        /**
         * Deposita una cantidad en la cuenta bancaria.
        * @param cantidad La cantidad a depositar en la cuenta.
        */
        public void depositar(double cantidad) {
            saldo += cantidad;
        }
        /**
        * Retira una cantidad de la cuenta bancaria.
        * @param cantidad La cantidad a retirar de la cuenta.
         * @return true si se puede sacar el dinero, false si no tiene suficiente dinero.
         */
        public boolean retirar(double cantidad) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                return true;
            }
            return false;
        }
        /**
         * Devuelve una lista en forma de cadena sobre la cuenta bancaria.
         * @return cadena que representa al objeto CuentaBancaria, numeroCuenta, saldo y propietario.
        */
        @Override
        public String toString() {
            return "CuentaBancaria{" +
                    "numeroCuenta='" + numeroCuenta + '\'' +
                    ", saldo=" + saldo +
                    ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                    '}';
        }
    }

