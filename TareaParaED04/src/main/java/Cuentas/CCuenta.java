package Cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructo vacio de CCuenta
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor para CCuenta
     * @param nom nombre del dueño de la cuenta
     * @param cue número de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Metodo estado, devuelve el saldo de la cuenta
     * @return atributo saldo
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Metodo ingresar, método que controla el ingreso de saldo en la cuenta,
     * también controla que no se pueda ingresar menos de 0 euros
     * @param cantidad cantidad de dinero a ingresar
     * @throws Exception si ingresa una cantidad menor que 0 lanzara una excepcion
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Metodo retirar, método que controla el retiro de saldo en la cuenta,
     * también controla que no se pueda retirar 0 euros o menos y
     * que el saldo sea mayo que la cantidad a retirar
     * @param cantidad cantidad de dinero a ingresar
     * @throws Exception lanzara una excepcion si ingresa una cantidad igual o menor que 0,
     * o si hay menos saldo que la cantidad que quiere retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    @Override
    public String toString() {
        return "CCuenta{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoInter\u00e9s=" + tipoInterés + '}';
    }
}
