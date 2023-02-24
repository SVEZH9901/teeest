public class Main {
    public static void main(String[] args) {
        Man Andri = new Man();
        Man Semen = Andri;
        Man Vova = new Man();
        Andri.age = 1000;
        Vova.age = 24;
        int avg_age = (Andri.age + Semen.age + Vova.age)/3;
        System.out.println(avg_age);
    }
}