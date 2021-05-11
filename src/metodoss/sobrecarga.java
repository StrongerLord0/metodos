package metodoss;


public class sobrecarga {
    
    
    public void test(){
        System.out.println("Vacío");
    }
    
    public void test(int a){
        System.out.println("a: " + a);
    }
    
    public void test(int a, int b){
        System.out.println("a: " + a + " y b: " + b);
    }
    
    public double test(double a){
        System.out.println("double de a: " + a);
        return a;
    }
}
