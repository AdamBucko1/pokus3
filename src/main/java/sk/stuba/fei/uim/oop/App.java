package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
       Auto skoda = new Auto(100);
       Auto bmw = new Auto();

       skoda.dotankovat();
        System.out.println(skoda.currentState());

       skoda.drive( 100 );
       System.out.println(skoda.getStavNadrze());
       skoda.drive(200);
       System.out.println(skoda.getStavNadrze());
        System.out.println(skoda.currentState());
    }
}
