
package com.mycompany.sesion2;

public class empleado {
    String  codigo;
    String  nombre;
    String  area;
    double  sueldobase;
    double  horasextras;
    String  tipo_seg;
    public empleado(String codigo,String nombre, String area, double sueldobase,double horasextras, String seguro){
        this.codigo=codigo;
        this.nombre=nombre;
        this.area=area;
        this.sueldobase=sueldobase;
        this.horasextras=horasextras;
        this.tipo_seg=seguro;
    }
public double montoextra(){
    return  sueldobase*horasextras/240;
}  
public double montoseguro(){
    if(tipo_seg.equalsIgnoreCase("AFP"))
        return sueldobase*0.17;
    if(tipo_seg.equalsIgnoreCase("SNP"))
        return sueldobase*0.5;
return 0;    
}
public double montoessalud(){
    return sueldobase*0.3;
}
public double montodescuento(){
    return montoseguro()+montoessalud();
}
public double montobruto(){
    return sueldobase+montoextra();
}
public double sueldoneto(){
    return montobruto()-montodescuento();
}




}
