public class Random {

    public static void main(String[] args) {
        Math.pow(2, 4);
        Math.ceil(3.5);
        Math.floor(3.5);
        Math.round(3.5);
        double max = 15;
        double min = 10;
        int num=(int)((Math.random()*(max-min+1))+min);
        System.out.println(num);
        
        System.err.println("hola");
    }
    
}
