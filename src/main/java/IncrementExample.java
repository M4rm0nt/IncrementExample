public class IncrementExample {
    public static void main(String[] args) {
        int i = 5;
        int a;
        int b;

        // Post-Inkrement: i++
        a = i++; // Erst wird a der Wert von i (5) zugewiesen, dann wird i inkrementiert.
        System.out.println("Wert von a (nach i++): " + a); // a ist 5
        System.out.println("Wert von i (nach i++): " + i); // i ist jetzt 6

        // Zurücksetzen von i auf 5 für das nächste Beispiel
        i = 5;

        // Pre-Inkrement: ++i
        b = ++i; // Zuerst wird i inkrementiert, dann wird b der neue Wert von i (6) zugewiesen.
        System.out.println("Wert von b (nach ++i): " + b); // b ist 6
        System.out.println("Wert von i (nach ++i): " + i); // i ist auch 6
    }
}
