package redpacket;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {

	@Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        //随机分配 最少1分钱，最多不超过剩下的金额平均数的2倍
        //第一次的红包是1到(totalMoney/totalCount)*2
        //范围公式就是：1+random.nextInt(leftMoney/leftCount*2）；
        Random r=new Random();//随机生成器
        int leftMoney=totalMoney;
        int leftCount=totalCount;
        for (int i = 0; i <totalCount-1 ; i++) {
            int money=r.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);
            leftMoney-=money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
