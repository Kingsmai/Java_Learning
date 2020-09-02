package redpacket;

import java.util.ArrayList;

public class Normal implements OpenMode {

	@Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        int avg=totalMoney/totalCount;//avgmoney
        int mod=totalMoney%totalCount;
        //ÁôÒ»¸ö
        for (int i = 0; i <totalCount-1 ; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }
}
