package ejercicio12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Persona {
    ///////////////////////Atributes/////////////////////////////////////////
    private String nombre;
    private Date fechaDeNacimiento;
    ///////////////////////////Builders//////////////////////////////////////

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona() {
    }
    /////////////////////////Getters and Setters//////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    ///////////////////////////////Methods////////////////////////////////////
    public void crearPersona() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fecha = new Date();
        System.out.println("Ingrese nombre de la persona: ");
        this.nombre = read.next();
        System.out.println("Ingrese año de nacimiento");
        int anio = read.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = read.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia = read.nextInt();
        fecha.setDate(dia); 
        fecha.setMonth(mes); 
        fecha.setYear(anio); 
        this.fechaDeNacimiento = fecha;
    }
    public void calcularEdad() {
        Date fechaActual = new Date();
        int diferencia;
        if (fechaActual.getMonth()<fechaDeNacimiento.getMonth()){
             diferencia = (fechaActual.getYear()+1900)-fechaDeNacimiento.getYear()-1;
            }else{
            diferencia =(fechaActual.getYear()+1900)-fechaDeNacimiento.getYear();
        }
        System.out.printf("%s tiene %d años \n", this.nombre, diferencia);
    }
    public boolean menorQue(int edad) {
        Date fechaActual = new Date();
        int diferencia = (fechaActual.getYear() + 1900) - this.fechaDeNacimiento.getYear();
        if (fechaActual.getMonth() + 1 <= this.fechaDeNacimiento.getMonth()) {
            if (fechaActual.getMonth() + 1 == this.fechaDeNacimiento.getMonth()) {
                if (this.fechaDeNacimiento.getDate() > fechaActual.getDate()) {
                    diferencia--;
                }
            }

        } else {
            diferencia--;
        }

        return edad < diferencia;

    }
     public void mostrarPersona() {
        System.out.printf("\nLa persona se llama: %s y nacio el : %d/%d/%d \n", this.nombre, this.fechaDeNacimiento.getYear(), this.fechaDeNacimiento.getMonth(), this.fechaDeNacimiento.getDate());
    }
}
    
