package Colecciones.E133;


public class Main {

    public static void main(String[] args) {

        Departamento d1 = new Departamento();
        
        d1.AniadirEmpleado(1234, new Empleado("Paco", "Polla", 'M'));
        d1.AniadirEmpleado(342, new Empleado("Sexo", "Polla", 'M'));
        d1.AniadirEmpleado(564, new Empleado("Puta", "Polla", 'F'));
        d1.AniadirEmpleado(32423, new Empleado("Chocho", "Polla", 'F'));
        
        d1.BuscarEmpleado(1234);
        
        System.out.println("mostrar");
        d1.MostrarDepartamento();
        d1.BorrarEmpleado(564);
        d1.NuevoAnio();
        d1.RevisarSueldos();
        System.out.println("mostrar");
        d1.MostrarDepartamento();

    }

}
