import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        int score; // 점수 변수 score 선언
        char Grade; // 학점 변수 Grade 선언
        System.out.print("점수를 입력하세요(0~100): ");     // 사용자로부터 점수를 입력 받기
        Scanner Scanner = new Scanner(System.in);       // scanner cless로 사용자로부터 값을 받음
        score = Scanner.nextInt();      // 읽어온 점수를 score 변수에 저장
        if(score >= 90)         // score가 90이상 "A"학점
            Grade = 'A';
        else if(score >= 80)         // score가 80이상 90미만 "B"학점
            Grade = 'B';
        else if(score >= 70)         // score가 70이상 80미만 "C"학점
            Grade = 'C';
        else if(score >= 60)         // score가 60이상 70미만 "D"학점
            Grade = 'D';
        else         // score가 60미만 "F"학점
            Grade = 'F';
        System.out.println("학점은 "+ Grade + "입니다.");     // 사용자에게 학점을 반환

    }
}
