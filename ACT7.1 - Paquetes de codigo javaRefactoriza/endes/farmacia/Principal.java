package endes.farmacia;

import java.util.Map;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        FARMACIA farmacia = new FARMACIA();
        Random random = new Random();

        MedicamentoGenerico paracetamol = new MedicamentoGenerico("Paracetamol", 10.0);
        farmacia.agregarMedicamentoA(paracetamol, 100);

        String nombre1 = "Medicamento1";
        double precio1 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico1 = new MedicamentoGenerico(nombre1, precio1);
        farmacia.agregarMedicamentoA(medicamentoGenerico1, 100);

        String nombre2 = "Medicamento2";
        double precio2 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico2 = new MedicamentoGenerico(nombre2, precio2);
        farmacia.agregarMedicamentoA(medicamentoGenerico2, 100);

        String nombre3 = "Medicamento3";
        double precio3 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico3 = new MedicamentoGenerico(nombre3, precio3);
        farmacia.agregarMedicamentoA(medicamentoGenerico3, 100);

        // Medicamento 4
        String nombre4 = "Medicamento4";
        double precio4 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico4 = new MedicamentoGenerico(nombre4, precio4);
        farmacia.agregarMedicamentoA(medicamentoGenerico4, 100);

        String nombre5 = "Medicamento5";
        double precio5 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico5 = new MedicamentoGenerico(nombre5, precio5);
        farmacia.agregarMedicamentoA(medicamentoGenerico5, 100);

        // Medicamento 6
        String nombre6 = "Medicamento6";
        double precio6 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico6 = new MedicamentoGenerico(nombre6, precio6);
        farmacia.agregarMedicamentoA(medicamentoGenerico6, 100);

        String nombre7 = "Medicamento7";
        double precio7 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico7 = new MedicamentoGenerico(nombre7, precio7);
        farmacia.agregarMedicamentoA(medicamentoGenerico7, 100);

        String nombre8 = "Medicamento8";
        double precio8 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico8 = new MedicamentoGenerico(nombre8, precio8);
        farmacia.agregarMedicamentoA(medicamentoGenerico8, 100);

        String nombre9 = "Medicamento9";
        double precio9 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico9 = new MedicamentoGenerico(nombre9, precio9);
        farmacia.agregarMedicamentoA(medicamentoGenerico9, 100);

        String nombre10 = "Medicamento10";
        double precio10 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico10 = new MedicamentoGenerico(nombre10, precio10);
        farmacia.agregarMedicamentoA(medicamentoGenerico10, 100);

        MedicamentoEspecializado insulina = new MedicamentoEspecializado("Insulina", 50.0, "Diabetes");
        farmacia.agregarMedicamentoB(insulina, 20);


        String tipo1 = "Tipo1";
        MedicamentoEspecializado medicamentoEspecializado1 = new MedicamentoEspecializado(nombre1, precio1, tipo1);
        farmacia.agregarMedicamentoB(medicamentoEspecializado1, 20);


        String tipo2 = "Tipo2";
        MedicamentoEspecializado medicamentoEspecializado2 = new MedicamentoEspecializado(nombre2, precio2, tipo2);
        farmacia.agregarMedicamentoB(medicamentoEspecializado2, 20);


        String tipo3 = "Tipo3";
        MedicamentoEspecializado medicamentoEspecializado3 = new MedicamentoEspecializado(nombre3, precio3, tipo3);
        farmacia.agregarMedicamentoB(medicamentoEspecializado3, 20);

        String tipo4 = "Tipo4";
        MedicamentoEspecializado medicamentoEspecializado4 = new MedicamentoEspecializado(nombre4, precio4, tipo4);
        farmacia.agregarMedicamentoB(medicamentoEspecializado4, 20);

        String tipo5 = "Tipo5";
        MedicamentoEspecializado medicamentoEspecializado5 = new MedicamentoEspecializado(nombre5, precio5, tipo5);
        farmacia.agregarMedicamentoB(medicamentoEspecializado5, 20);

        String tipo6 = "Tipo6";
        MedicamentoEspecializado medicamentoEspecializado6 = new MedicamentoEspecializado(nombre6, precio6, tipo6);
        farmacia.agregarMedicamentoB(medicamentoEspecializado6, 20);

        String tipo7 = "Tipo7";
        MedicamentoEspecializado medicamentoEspecializado7 = new MedicamentoEspecializado(nombre7, precio7, tipo7);
        farmacia.agregarMedicamentoB(medicamentoEspecializado7, 20);

        String tipo8 = "Tipo8";
        MedicamentoEspecializado medicamentoEspecializado8 = new MedicamentoEspecializado(nombre8, precio8, tipo8);
        farmacia.agregarMedicamentoB(medicamentoEspecializado8, 20);
;
        String tipo9 = "Tipo9";
        MedicamentoEspecializado medicamentoEspecializado9 = new MedicamentoEspecializado(nombre9, precio9, tipo9);
        farmacia.agregarMedicamentoB(medicamentoEspecializado9, 20);


        String tipo10 = "Tipo10";
        MedicamentoEspecializado medicamentoEspecializado10 = new MedicamentoEspecializado(nombre10, precio10, tipo10);
        farmacia.agregarMedicamentoB(medicamentoEspecializado10, 20);

        System.out.println("Inventario de la farmacia:");
        for (Map.Entry<String, Integer> entry : farmacia.inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
}
