public class Ready308 {
    public static void main(String[] args) {
        int centerScore = 50;
        int finalScore = 50;
        int totalScore = centerScore + finalScore;

        if(centerScore >= 60 && finalScore >= 60) {
          System.out.println("合格");
        } else if(totalScore >= 130) {
          System.out.println("合格");
        } else if(totalScore >= 130 && (centerScore >= 90 || finalScore >= 90)) {
          System.out.println("合格");
        } else {
          System.out.println("不合格");
        }
    }
}
