public class Deltio {
    int num1, num2, num3, num4, num5;
    int[] selectedNumbers;

    //Constructor1 (Συμπλήρωση δελτίου με 2 αριθμούς)
    public Deltio(int num1, int num2){
        selectedNumbers = new int[2];
        selectedNumbers[0] = num1;
        selectedNumbers[1] = num2;
    }

    //Constructor2 (Συμπλήρωση δελτίου με 3 αριθμούς)
    public Deltio(int num1, int num2, int num3){
        selectedNumbers = new int[3];
        selectedNumbers[0] = num1;
        selectedNumbers[1] = num2;
        selectedNumbers[2] = num3;
    }

    //Constructor3 (Συμπλήρωση δελτίου με 4 αριθμούς)
    public Deltio(int num1, int num2, int num3, int num4){
        selectedNumbers = new int[4];
        selectedNumbers[0] = num1;
        selectedNumbers[1] = num2;
        selectedNumbers[2] = num3;
        selectedNumbers[3] = num4;

    }

    //Constructor4 (Συμπλήρωση δελτίου με 5 αριθμούς)
    public Deltio(int num1, int num2, int num3, int num4, int num5) {
        selectedNumbers = new int[5];
        selectedNumbers[0] = num1;
        selectedNumbers[1] = num2;
        selectedNumbers[2] = num3;
        selectedNumbers[3] = num4;
        selectedNumbers[4] = num5;
    }

    //Μέθοδος για την επιστροφή του πίνακα με τους αριθμούς του δελτίου
   public int[] GetDeltio(){
            return selectedNumbers;
   }

   //Epistrefei tous arithmous tou deltiou se mia grammh xorismenous me kommata
    // px: 23,5,28,13
   public String displayDeltio(){
        String numbersStr = ""; //Δημιουργούμε ένα κενό String
       for (int i = 0; i < selectedNumbers.length; i++) {
           if (i == selectedNumbers.length - 1){  //an einai teleutaios xarakthras den bazei komma
               numbersStr += String.valueOf(selectedNumbers[i]);
           }
           else
           {
               numbersStr += String.valueOf(selectedNumbers[i]) + ", ";
           }

       }
       return numbersStr; //Επιστροφή του String
   }
}
