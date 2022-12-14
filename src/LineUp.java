
class LineUp{
   //lineup array
   private final char[] musicians;
//constructor
   public LineUp(char[] args) {

         this.musicians = args;
   }
   //getter method for one musician
   public char getMusician(int i){
      return this.musicians[i];
   }
   //string concatenation
   public String toString(){
      StringBuilder Sequence = new StringBuilder();
      for(int i=0;i<6;i++) {
         Sequence.append(musicians[i]);
         if (i < 5){
            Sequence.append(" ");
         }
      }

      return Sequence.toString();
   }

   //main method to test and debug the LineUp class

   public static void main(String[] args)
   {
      char[] c0 = new char[] { 'C', 'A', 'H', 'F', 'I', 'B' };
      LineUp lu0 = new LineUp(c0);
      char c2 =lu0.getMusician(0);
      System.out.print(c2);
   }

}