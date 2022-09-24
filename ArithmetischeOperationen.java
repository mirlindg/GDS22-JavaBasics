public class ArithmetischeOperationen {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        System.out.println("Erste Zahl = " + a);
        System.out.println("Zweite Zahl = " + b);

        int addition;
        addition = a + b;
        System.out.println("Addition Ergebnis = " + addition);


        int subtraktion;
        subtraktion = a - b;
        System.out.println("Subtraktion Ergebnis = " + subtraktion);

        int multiplikation;
        multiplikation = a * b;
        System.out.println("Multiplikation Ergebnis = " + multiplikation);

        int division;
        division = a / b;
        System.out.println("Division Ergebnis = " + division);

        int modulo;
        modulo = a % b;
        System.out.println("Modulo Ergebnis = " + modulo);

        System.out.println("a++");
        System.out.println(a++);
        System.out.println("a = " + a);

        System.out.println("++b");
        System.out.println(++b);
        System.out.println("b = " + b);

        addition(4,2);
        subtraktion(4,2);
        multiplikation(4,2);
        dividieren(4,2);
        modulo(4,2);
        power(4);




    }

    public static int addition(int a,int b){
        int resultaddieren = a + b;
        System.out.println("Das Ergebnis deiner Addition = " + resultaddieren);
        return resultaddieren;
    }

    public static int subtraktion(int a,int b){
        int resultsubtrahieren = a - b;
        System.out.println("Das Ergebnis deiner Subtraktion = " + resultsubtrahieren);
        return resultsubtrahieren;
    }

    public static int multiplikation(int a,int b){
        int resultmultiplizieren = a * b;
        System.out.println("Das Ergebnis deiner Multiplikation = " + resultmultiplizieren);
        return resultmultiplizieren;
    }

    public static int dividieren(int a,int b){
        int resultdividieren = a / b;
        if (resultdividieren == 0) {
            System.out.println("Keines der Werte darf 0 sein!");
        }
        else {
            System.out.println("Das Ergebnis deiner Division = " + resultdividieren);
        }
        return resultdividieren;
    }
    public static int modulo(int a,int b){
        int resultmodulo = a % b;
        System.out.println("Das Ergebnis deines Modulo = " + resultmodulo);
        return resultmodulo;
    }

    public static int power (int a){

        int resultpower = a * a;
        System.out.println("Ich habe meinen Wert Mal meinen Wert gerechnet: " + resultpower);
        return resultpower;
    }

}
