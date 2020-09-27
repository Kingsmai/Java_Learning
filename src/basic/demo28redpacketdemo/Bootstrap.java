package basic.demo28redpacketdemo;

/*
 * 场景说明：
 * 红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主自己
 * 大多数代码都是现成的，我们要做的就是填空题
 * 
 * 红包分发策略：
 * 1. 普通红包（平均）：totalMoney / totalCount，余数放在最后一个红包当中
 * 2. 手气红包（随机）：最少一分钱，最多不超过平均数的2倍。应该越发越少
 */
public class Bootstrap {
	public static void main(String[] args) {
        Red myRed=new Red("这是一个红包测试");
        //设置群主名称
        myRed.setOwnerName("狗群主俊朗");
        //普通红包
/*        OpenMode normal=new Normal();
        myRed.setOpenWay(normal);*/
       //手气红包
        OpenMode lucky=new Lucky();
        myRed.setOpenWay(lucky);
    }
}
