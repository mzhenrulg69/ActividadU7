package endes.farmacia;

import endes.farmacia.medicamentos.Medicamento;

import java.util.HashMap;
import java.util.Map;


public class FARMACIA {
    Map<String, Integer> inventario;

    public FARMACIA() {
        this.inventario = new HashMap<>();
    }
    // Metodo para agregar medicamento generico //
    public void agregarMedicamentoA(MedicamentoGenerico medicamento, int cantidad) {
        String nombre = medicamento.nombre;
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, cantidadExistente + cantidad);
        } else {
            inventario.put(nombre, cantidad);
        }
    }
    // Metodo para agregar medicamento especializado //
    public void agregarMedicamentoB(MedicamentoEspecializado medicamento, int cantidad) {
        String nombre = medicamento.nombre;
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, cantidadExistente + cantidad);
        } else {
            inventario.put(nombre, cantidad);
        }
    }


}



class MedicamentoGenerico extends Medicamento {

    public double constante_subvencionado = 15;
public MedicamentoGenerico(String nombre, double precio) {
    super(nombre, precio);
}

    public double getPrecioSubvencionado(){
        return constante_subvencionado * precio;
    }
}

class MedicamentoEspecializado {
public String nombre;
public double precio;
private String tipo;

public MedicamentoEspecializado(String nombre, double precio, String tipo) {
   this.nombre=nombre;
     this.precio=precio;
        this.tipo = tipo;
}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
public String mostrarMedicamento(int numero, int cantidad, int numFarmacia, int codigoMedicamento, int codigoFarmacia ) {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;

}
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;
    }
}