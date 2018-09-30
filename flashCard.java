

public class flashCard extends cards{

  //TODO Created a parameterized constructor for entering values into the cards Data.

  flashCard(String Subject ,String Question , String Answer ) // Passing parameter of Subject , Question, Answer
  {
    // get values from user for Subject
    BufferedReader br=new BufferedReader(new inputStreamReader(System.in));

    String Subject=br.readLine();
    
    Subject=this.Subject;

  }
}


public class flashCardData extends flashCard implements cardSearchable{



}




// TODO Created a main class for this file
public class main3{
public static void main(String args[])
{


}

}
