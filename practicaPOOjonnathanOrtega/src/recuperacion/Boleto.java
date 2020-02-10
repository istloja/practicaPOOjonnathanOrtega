/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion;

/**
 *
 * @author ISTLOJA_01
 */
class Boleto {

    double precio;
    private double iva;
    final double m = 0.15;
    final double f = 0.30;
    final double e = 0.10;

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     public double getiva() {
        return iva;
    }

    public void setiva(double iva) {
        this.iva = iva;
    }
public Double getPrecio(){
    return precio;
}
public double descuento(String desc){
    double a=0;
    if(desc=="menor"){
        a=precio*m;
    }else if (desc=="fumador"){
        a=precio*f;
    }else if (desc=="estudiante"){
        a=precio*e;
    }
    return a;
}
    
}
