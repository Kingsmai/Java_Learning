package basic.demo28redpacketdemo;

import java.util.ArrayList;

public interface OpenMode {

	/**
	 * @param totalMoney	总金额,单位是"分"。总金额为方便计算,已经转换为整数,单位为分。
	 * @param count			红包个数
	 * @return ArrayList<Integer>	元素为各个红包的金额值,所有元素的值累和等于总金额.
	 * 
	 * 请将totalMoney,分成count分,保存到ArrayList<Integer>中,返回即可.
	 */
    public abstract  ArrayList<Integer> divide(int totalMoney, int count);
}
