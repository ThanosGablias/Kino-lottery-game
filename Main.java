/*
3212019029, Gkamplias Athanasios, Askhsh 2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Klirosi k = new Klirosi(); //Δημιουργία αντικειμένου 'klirosi'

       //Δημιουργία αντικειμένων 'Deltio'
       Deltio d1 = new Deltio(72,4,16,64,39);
       Deltio d2 = new Deltio(12,45);
       Deltio d3 = new Deltio(19,23,78,56);

       k.StartKlirosi(); //Καλούμε την συγκεκριμένη μέθοδο για να ξεκινήσει η κλήρωση των τυχαίων αριθμών
       k.DisplayNumbers(); //Καλούμε την συγκεκριμένη μέθοδο για την εμφάνιση των τυχαίων αριθμών της κλήρωσης

       System.out.print("\n");

       //Εκτυπώνουμαι τους αριθμούς των δελτίων
       System.out.println("Οι αριθμοί του 1ου δελτίου: " + d1.displayDeltio());
       System.out.println("Οι αριθμοί του 2ου δελτίου: " + d2.displayDeltio());
       System.out.println("Οι αριθμοί του 3ου δελτίου: " + d3.displayDeltio());

       System.out.print("\n");

       //Καλούμε τις συγκεκριμένες μεθόδους για να ελέγξουν το ποσοστό επιτυχίας των δελτίων
       k.CheckDeltio(d1.GetDeltio());
       k.CheckDeltio(d2.GetDeltio());
       k.CheckDeltio(d3.GetDeltio());

    }
}
