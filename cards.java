
public abstract class cards {

	private String Subject;
	private String Question;
	private String Answer;

	public String getSubject()
	{
	      return this.Subject;
	}


	public String getQuestion()
	{
		return  this.Question;
	}

	public String getAnswer()
	{
		return this.Answer;
	}



	public void setSubject( String newSubject) {
	      Subject = newSubject;
	   }


	public void setQuestion(String newQuestion) {
		Question=newQuestion;
	}

	public void setAnswer(String newAnswer) {
		Answer=newAnswer;
	}


	public cards() {
		// TODO Auto-generated constructor stub

	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // TODO Created fake data insertion

		cards=new cards();
		cards.setSubject("Java");
		cards.setQuestion("What is this in Java");
		cards.setAnswer("this is a keyword in Java ");

	}

}
