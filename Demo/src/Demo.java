import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//输入
        String choose;
        double t=Math.random();//随机生成一个小数
        int point=(int)(t*6+1);//随机生成的范围：1～6：大减小+1加小的
        choose=input.nextLine();
        if(point<3&&choose.equals("小")||point<3&&choose.equals("small")||point>3&&choose.equals("大")||point>3&&choose.equals("big"))
            System.out.println("猜对啦");
        else System.out.println("猜错啦");
        System.out.println("摇出的点数是："+point);
    }
}
