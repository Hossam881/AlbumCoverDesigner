
//importing the Random class to generate random number

import java.util.Random;
class AlbumCoverGame {
    //defining the attributes
    private final LineUp solution;
    // sets the head pointed to null
    private Node pointer = null;
    //the constructor
    public AlbumCoverGame(LineUp solution) {

        this.solution = solution;
    }
    //initialises a random lineup

    public AlbumCoverGame(){
        //initialising the random object
        Random r = new Random();
        char[] musicians = {'A', 'B', 'C', 'D','E', 'F', 'G', 'H','I' };
        //the random lineup
        char[] draft = new char[6];
        for(int i=0; i < draft.length; i++) {
            draft[i] = musicians[r.nextInt(9)];

        }
        this.solution = new LineUp(draft);


    }


    public boolean testDraftCover(LineUp lineup) {
        //calling the constructor
        DraftCover cover = new DraftCover(lineup, this.solution);
        //assigning the value of the node to the pointer
        pointer = new Node(cover, pointer);
        return cover.isCorrect();
    }

    public  Node getPreviousDraftCovers() {
        //checking if the pointer is null
        if (pointer == null) {
            return null;
        } else {
                return pointer;
        }
    }
    public LineUp getSolution(){

        return solution;
    }
// main method for testing and debugging the class
   public static void main(String[] args){
        char[] c0 = new char[] { 'F', 'C', 'D', 'A', 'I', 'H' };
        LineUp lu0 = new LineUp(c0);
        AlbumCoverGame acg0 = new AlbumCoverGame();
        char[] c1 = new char[] { 'C', 'A', 'H', 'F', 'I', 'B' };
        LineUp lu1 = new LineUp(c1);
        boolean b0 = acg0.testDraftCover(lu1);
        char[] c2 = new char[] { 'C', 'A', 'B', 'H', 'I', 'G' };
        LineUp lu2 = new LineUp(c2);
        b0 = acg0.testDraftCover(lu2);
        acg0.getPreviousDraftCovers().toString();


    }

}