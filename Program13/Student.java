class Student{
int score = 10;
void displayScore(){
System.out.println("Academic Score is: " + score);
}
}
class Sports extends Student{
int sportsScore = 25;
void displaySportsScore(){
System.out.println("Sports Score is: " + sportsScore);
}
}
class Result extends Sports{
void displayResult(){
displayScore();
displaySportsScore();
}
}
class SportStudentResult {
public static void main(String[] args){
Result r = new Result();
r.displayResult();
}
}
