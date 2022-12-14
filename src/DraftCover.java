 public class DraftCover{


    //solution variable
     private  LineUp solution;//score
     private final LineUp suggestion;


    public DraftCover(LineUp LineUp1, LineUp LineUp2) {
        //constructor to initialise the lineup.
        this.suggestion = LineUp1;
        this.solution = LineUp2;

        //testing whether the attributes are set
        //System.out.println("constructor"+suggestion.getMusician(0));
        //System.out.println("constructor"+solution.getMusician(0));

    }
    public DraftCover(LineUp suggestion){
        this.suggestion= suggestion;
        //setter method for the suggestion

    }


    public LineUp getLineUp(){
        return suggestion;
        //getter method
    }

    public boolean isCorrect(){

        return getNumGood() == 6;
        //returns correct if all six items in the array are matching

    }

    public int getNumGood(){
        int count = 0;
        for (int i = 0; i<6 ; i++){
            if(suggestion.getMusician(i)==solution.getMusician(i)){
                count+=1;
                //checks how many items are corrects
            }
        }
        return count;

    }
    public int getNumTooLeft(){
        int count = 0;
        for (int i = 0; i<5 ; i++){
                if (suggestion.getMusician(i) == solution.getMusician(i + 1)) {
                    count += 1;
                    //checks how many to the left are there

                }
        }

        return count;
    }

    public int getNumTooRight(){
        int count = 0;
        for (int i = 0; i<6 ; i++){
            if (i != 0){
                if(suggestion.getMusician(i)==solution.getMusician(i-1)){
                    //checks how many to the left are there
                    count+=1;
                }
            }
        }

        return count;
    }
     public String toString() {
         StringBuilder ALineUp = new StringBuilder();
         for (int i = 0; i < 6; i++) {

             ALineUp.append(this.suggestion.getMusician(i));
             ALineUp.append(" ");
         }
// output to the user how well they did
         ALineUp.append("(Too left ").append(getNumTooLeft()).append(", Good ").append(getNumGood()).append(", Too right ").append(getNumTooRight()).append(")");
         return ALineUp.toString();
     }

     public static void main(String[] args){
         // main method for debugging
         char[] c0 = new char[] { 'I', 'F', 'E', 'G', 'A', 'H' };
         LineUp lu0 = new LineUp(c0);
         char[] c1 = new char[] { 'I', 'F', 'E', 'G', 'A', 'H' };
         LineUp lu1 = new LineUp(c1);
         DraftCover dc0 = new DraftCover(lu0, lu1);
         boolean b0 = dc0.isCorrect();


     }
}
