package Test;

import java.util.Random;

public class MyTest {
public static void main(String[] args) {
	double x1=0;
	double x2=0;
	double x3=0;
	double x4=0;
	double x5=0;
	double x6=0;
	double x7=0;
	double x8=0;
	double x9=0;
	
	double y=100; //����
	
	
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
	
	
	System.out.println("               ���Ͼ�����");
	
	System.out.println("-----"+"��ӭͶע"+"-----");
	
	System.out.println("�н�����:  "+sjs1+"  "+sjs2+"  "+sjs3);
	
	System.out.println("----------------");
	
	System.out.println("�ϣ�"+sum);

	System.out.println("----------------");
	
	if(sjs1==sjs2&&sjs1==sjs3) {
		System.out.println("Χɫ");
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
	System.out.println("��������"+y);
	System.out.println("Χɫ������"+x1+"����Ϊ��"+x1/y*100+"%");
	System.out.println("�����󣺣�"+x3+"����Ϊ��"+x3/y*100+"%");
	System.out.println("����С����"+x2+"����Ϊ��"+x2/y*100+"%");
	System.out.println("4/17����Ϊ:"+x4/y*100+"%");
	System.out.println("5/16����Ϊ:"+x5/y*100+"%");
	System.out.println("6/15����Ϊ:"+x6/y*100+"%");
	System.out.println("7/14����Ϊ:"+x7/y*100+"%");
	System.out.println("8/13����Ϊ:"+x8/y*100+"%");
	System.out.println("9~12����Ϊ:"+x9/y*100+"%");
	

	
	
	
	
	
	
}
	
	

}
