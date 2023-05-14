import java.util.Random;
import java.util.ArrayList;

public class Klirosi {
    //Δημιουργία δυναμικού πίνακα 'lotteryNums' όπου αποθηκεύονται οι αριθμοί της κλήρωσης
    private ArrayList<Integer> lotteryNums = new ArrayList<Integer>();
    Random randNums = new Random();

    //Μέθοδος για να εξασφαλίσουμε το ενδεχόμενο οτι κάθε τυχαίος αριθμός θα εμφανίζεται στην κλήρωση μόνο μία φορά
    private boolean isUnique(int number){
        for(int i=0;i<lotteryNums.size();i++){
            if(number == lotteryNums.get(i)){ //Ελέγχει αν ο αριθμός 'number' υπάρχει στον δυναμικό πίνακα 'lotteryNums'
                return false; //αν υπάρχει επιστρέφει false
            }
        }
        return true; //αν δεν υπάρχει κανένας ιδιος αριθμός στον δυναμικό πίνακα 'lotteryNums' επιστρέφει true
    }

    //Μέθοδος που παράγει τους τυχαίους αριθμούς της κλήρωσης
    public void StartKlirosi(){
        //δήλωση των μεταβλητών της μεθόδου
        int i;
        int randomNumber = 0;

        //Ektelei thn While oso to megethos tou dynamikou pinaka 'lotteryNums' einai mikrotero tou 20
        while (lotteryNums.size() < 20) {
            randomNumber = randNums.nextInt(80) + 1; //Εγχωρούμε στην μεταβλητή 'randomNumber' τυχαίους αριθμούς [1,80]
            if (isUnique(randomNumber)) {
                lotteryNums.add(randomNumber); //Προσθέτει στην λίστα 'lotteryNums' ton tyxaio arithmo
            }
        }
    }

    //Μέθοδος για την εμφάνιση των αριθμών της κλήρωσης
    public void DisplayNumbers(){
        System.out.println(" \t\t\t\t\t--- ΟΙ ΑΡΙΘΜΟΙ ΤΗΣ ΚΛΗΡΩΣΗΣ ---\n");
        //Χρησιμοποιούμε τον επαναληπτικό βρόγχο for για την εμφάνιση όλων των στοιχείων του πίνακα 'lotteryNums'
        for(int i=0;i<lotteryNums.size();i++){
            System.out.print(lotteryNums.get(i) + "\t");
        }
    }

    //Μέθοδος για τον έλεγχο του ποσοστού επιτυχίας του δελτίου
    public void CheckDeltio(int[] ArithmoiDeltiou){
        Deltio d;
        int countCorrect = 0;

        //Elegxei an kapoios arithmos tou deltiou tou xrhsth 'AritmoiDeltiou[]' isoutai me kapoion apo tous tyxaious
        //arithmous ths klirosis 'lotteryNums' kai aujanei ton metrhth 'countCorrect' kata ena
        for(int i=0;i<lotteryNums.size();i++) {
            for (int j = 0; j < ArithmoiDeltiou.length; j++) {
                if (lotteryNums.get(i) == ArithmoiDeltiou[j])
                    countCorrect++; //Μετράει το πλήθος των αριθμών που πέτυχε το δελτίο
            }
        }
        //Emfanish ton arithmon poy petyxe o xrhsths
        System.out.println("Ο χρήστης μάντεψε " + countCorrect + " από τους " + ArithmoiDeltiou.length + " αριθμούς");
    }
}
