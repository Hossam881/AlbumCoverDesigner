import java.util.Scanner;
//importing the scanner class

class AlbumCoverDesignerCli {



    public static void main(String[] args) {
        //main method to test the class

       AlbumCoverDesignerCli.playGame(new AlbumCoverGame(new LineUp(new char[] { 'A', 'B', 'C', 'D', 'E', 'F' })));
    }

    public  static void playGame(AlbumCoverGame anAlbumCoverGame) {

//while loop
        while (true) {


            System.out.println("Previous attempts:");
            //checks if there are any previous attempts

            if (anAlbumCoverGame.getPreviousDraftCovers() == null) {
                System.out.println("No previous attempts");


            } else {
                //prints out the previous lineups
                System.out.println(anAlbumCoverGame.getPreviousDraftCovers());

            }
            char[] Suggestion;
            while(true) {


//initialising the scanner object
                Scanner input = new Scanner(System.in);
                System.out.println("Enter line up:");
                Suggestion = new char[6];
                for (int i = 0; i < 6; i++) {
                    char Musician = (input.next().charAt(0));
                    //checks if the lineup is valid
                    if (Musician >= 'A' && Musician <= 'I') {
                        Suggestion[i] = Musician;

                    } else {
                        System.out.println("Invalid line up!");
                        break;
                    }
                }



                break;

            }
            LineUp aLineUp = new LineUp(Suggestion);
            //if the lineup is correct it output a message
            if (anAlbumCoverGame.testDraftCover(aLineUp)) {
                System.out.println("Congratulations!");
                break;

            }
        }
    }
    }

