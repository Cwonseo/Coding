package chap_06;
import java.util.Scanner;
public class Baek_1215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String stuNum[] = new String[N];
        for (int i = 0; i < N; i++) {
            stuNum[i] = scanner.next();
        }
        int flag = 0;
        int length = stuNum[0].length();
        for (int i = length-1; i >=0 ; i--) {
            for (int j = 0; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if(stuNum[j].substring(i,length).equals(stuNum[k].substring(i,length)) ==true)
                    {
                        flag = 1;
                        break;
                    }
                }
                }
            if (flag==1){ flag = 0;}
            else if (flag==0){
                System.out.println(length-i);
                break;

            }
        }

        }
    }
// if (stuNum[i].substring(n, stuNum[0].length()).equals(stuNum[j].substring(n, stuNum[0].length())) == true)//같으면
//string을 숫자로 바꿀 때 int max보다 넘어가면 NumberFormatException 오류 발생
//substring(시작지점 , 끝지점+1) 하면 문자열 자르기 가능
//문자열이름.equals(문자열 이름) 하면 두 문자열 같은 지 비교 가능

