package Test;

import java.util.Random;

public class MyTest {
public static void main(String[] args) {
	//定义常数 x1-x9
	double x1=0;
	double x2=0;
	double x3=0;
	double x4=0;
	double x5=0;
	double x6=0;
	double x7=0;
	double x8=0;
	double x9=0;
	
	double y=100; //盘数
	
	
	for (int x=0;x<y;x++) {
	
	
	Random r=new Random();
	
	int sjs1 = r.nextInt(6)+1;
	
	Random r1=new Random();
	
	int sjs2 = r1.nextInt(6)+1;
	
	Random r2=new Random();
	
	int sjs3 = r2.nextInt(6)+1;
	
	int sum=sjs1+sjs2+sjs3;
	
	  if(sum==4||sum==17) {
		x4++;
	}else if(sum==5||sum==16) {
		x5++;
		
	}else if(sum==6||sum==15) {
		x6++;
		
	}else if(sum==7||sum==14) {
		x7++;
		
	}else if(sum==8||sum==13) {
		x8++;
		
	}else if(sum==9||sum==10||sum==11||sum==12) {
		x9++;
		
	}
	
	
	System.out.println("               澳门皇家骰宝");
	
	System.out.println("-----"+"欢迎投注"+"-----");
	
	System.out.println("中奖号码:  "+sjs1+"  "+sjs2+"  "+sjs3);
	
	System.out.println("----------------");
	
	System.out.println("合："+sum);

	System.out.println("----------------");
	
	if(sjs1==sjs2&&sjs1==sjs3) {
		System.out.println("围色");
		x1++;
	}else if(sum>=3&&sum<=10) {
		System.out.println("SMAIL");
		x2++;
	}else if(sum>=11&&sum<=17) {
		System.out.println("BIG");
		x3++;
	}

	
	
	
	
	
	}
	
	
	
    System.out.println("----------------");
	System.out.println("----------------");
	System.out.println("----------------");
	System.out.println("总盘数："+y);
	System.out.println("围色数量："+x1+"概率为："+x1/y*100+"%");
	System.out.println("总数大：："+x3+"概率为："+x3/y*100+"%");
	System.out.println("总数小：："+x2+"概率为："+x2/y*100+"%");
	System.out.println("4/17概率为:"+x4/y*100+"%");
	System.out.println("5/16概率为:"+x5/y*100+"%");
	System.out.println("6/15概率为:"+x6/y*100+"%");
	System.out.println("7/14概率为:"+x7/y*100+"%");
	System.out.println("8/13概率为:"+x8/y*100+"%");
	System.out.println("9~12概率为:"+x9/y*100+"%");
	

	
	
	
	
	
	
}
	
	

}
