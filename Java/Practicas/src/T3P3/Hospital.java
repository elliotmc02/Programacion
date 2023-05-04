package T3P3;

import java.util.HashMap;

public class Hospital {

    HashMap<String, Paciente> hospital;

    public Hospital() {
        this.hospital = new HashMap<>();
    }

    public void aniadirPaciente(String DNI, Paciente p) {
        if (this.hospital.containsKey(DNI)) {
            System.out.println("Ya existe");
        } else {
            this.hospital.put(DNI, p);
        }
    }

    public void eliminar() {
        this.hospital.clear();
    }

    public void eliminar(String DNI) {
        System.out.println(this.hospital.remove(DNI) != null ? "Paciente " + this.hospital.get(DNI).getNombre() + " borrado" : "No existe");
    }

    public void mostrarSexo(char s) {
        String sexo = (s == 'M' ? "masculino" : "femenino");
        if (this.contarSexo(s) != 0) {
            for (String pac : this.hospital.keySet()) {
                if (this.hospital.get(pac).getSexo() == s) {
                    System.out.println("DNI: " + pac + " Datos: \n" + this.hospital.get(pac));
                }
            }
        } else {
            System.out.println("No hay pacientes del sexo " + sexo);
        }
    }

    public int contarSexo(char s) {
        int i = 0;
        for (Paciente pac : this.hospital.values()) {
            if (pac.getSexo() == s) {
                i++;
            }
        }
        return i;
    }

    public void mostrarAlergias() {
        for (String pac : this.hospital.keySet()) {
            if (!this.hospital.get(pac).getAlergias().isEmpty()) {
                System.out.println("DNI: " + pac + " Datos: \n" + this.hospital.get(pac));
            }
        }
    }

    public String mostrarDatos() {
        String str = "";
        for (String pac : this.hospital.keySet()) {
            str += "DNI: " + pac + " Datos: \n" + this.hospital.get(pac) + System.lineSeparator();

        }
        return str;
    }

    public String mostrarDatos(String DNI) {
        String str;
        if (this.hospital.containsKey(DNI)) {
            str = "DNI" + DNI + " Datos: \n" + this.hospital.get(DNI);
        } else {
            str = "No existe ese paciente";
        }

        return str;
    }

    public HashMap<String, Paciente> getHospital() {
        return hospital;
    }

}
