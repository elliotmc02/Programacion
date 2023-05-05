package Colecciones.E133;

import java.util.HashMap;

public class Departamento {

    HashMap<Integer, Empleado> dep;

    public Departamento() {
        this.dep = new HashMap<>();
    }

    public void AniadirEmpleado(Integer DNI, Empleado e) {
        this.dep.put(DNI, e);
    }

    public void BorrarEmpleado(Integer DNI) {
        this.dep.remove(DNI);
    }

    public void BuscarEmpleado(Integer DNI) {
        System.out.println(this.dep.get(DNI) != null ? this.dep.get(DNI) : "No existe");
    }

    public void RevisarSueldos() {
        for (Empleado e : this.dep.values()) {
            e.setSueldo(e.getAnios() < 5 ? e.getSueldo() + 200 : (e.getAnios() < 9 ? e.getSueldo() + 500 : (e.getAnios() < 11 ? e.getSueldo() + 750 : e.getSueldo() + 900)));
        }
    }

    public void NuevoAnio() {
        for (Empleado e : this.dep.values()) {
            e.setAnios(e.getAnios() + 1);
        }
    }

    public void MostrarDepartamento() {
        for (Integer c : this.dep.keySet()) {
            System.out.println("DNI: " + c + " Empleado: " + this.dep.get(c));
        }
    }

}
