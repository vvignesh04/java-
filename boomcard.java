public class boomcard {
  int id; 
  String question; 
  String option1, option2, option3, option4; 
  int answer,option;

  public void set(int id) {
  this.id = id;
  }
  public void set(String question, int answer) {
      this.question = question;
      this.answer = answer;
  }

  public void set(String opt1, String opt2, String opt3, String opt4) {
      this.option1 = opt1;
      this.option2 = opt2;
      this.option3 = opt3;
      this.option4 = opt4;
  }
   public int getId() { 
      return this.id; 
  }

  public String getQuestion() {
      return this.question;
  }

  public int getAnswer() {
      return this.answer;
  }

  public String getOption(int choice) {
      if (choice == 1)
          return this.option1;
      else if (choice == 2)
          return this.option2;
      else if (choice == 3)
          return this.option3;
      else if (choice == 4)
          return this.option4;
      else
          return null; 
  }

  void select(int option) 
  {
      this.option=option;
      if(option==answer)
          System.out.println("\nCorrect\n");
      else
          System.out.println("\nIncorrect\n");
  }
}

  

