package basic.demo01hello;

public class Practise01 {
    public static void main(String[] args) {
        int score = 100;
        if (score < 0 || score > 100) {
            System.out.println("你的成绩是错误的");
        } else if (score >= 90 && score <= 100) {
            System.out.println("你的成绩属于优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("你的成绩属于好");
        } else if (score >= 70 && score < 80) {
            System.out.println("你的成绩属于良");
        } else if (score >= 60 && score < 70) {
            System.out.println("你的成绩属于及格");
        } else {
            System.out.println("你的成绩属于不及格");
        }

        // 另一种逻辑
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else { // 用于处理边界外的值
            System.out.println("数据错误");
        }
    }
}