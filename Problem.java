class Student{
  String name;

  public double calculateAvg(double[] date){
    double sum = 0;
    for( int i = 0; i < date.length; i++){
      sum += date[i];
    }
    double avg = sum / date.length; //合計を配列の数で割って平均を算出
    return avg;
  }

  public String judge(double avg){
    String result;
    if(avg >= 60){
      result = "passed";
    } else {
      result = "failed";
    }
    return result;
  }
}

public class Problem{
  public static void main(String[] args) {
    Student a001 = new Student();
    a001.name = "sato";
    double[] date = { 70, 65, 50, 90, 30};

    double avg = a001.calculateAvg(date); //平均を算出した上でavgに代入
    String result = a001.judge(avg); // avgをjudgeメソッドに渡し、判定させ、resultに格納する
    
    System.out.println(avg);
    System.out.println(a001.name + " " + result);
  }
}