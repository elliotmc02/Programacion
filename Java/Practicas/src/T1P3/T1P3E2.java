package T1P3;

public class T1P3E2 {

    public static void main(String[] args) {

        Tablet samsung = new Tablet("Samsung", "Manolo", 128, 500, 75879);
        
        samsung.encenderse();
        samsung.apagarse();
        samsung.apagarse();
        System.out.println(samsung);
    }

}

