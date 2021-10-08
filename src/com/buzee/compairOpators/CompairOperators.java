package com.buzee.compairOpators;

public class CompairOperators {
	public static void main(String[] arges) {
	int i = 20;
	System.out.println("i="+pluss(i));
	System.out.println("i="+equals(i));
	andfl();
	orchar();
	}
	public static int pluss(int i) {
		
		i++;
		i++;
		i++;
		i++;
		i++;
		return i;
	}
	public static int equals(int i) {
		--i;
		--i;
		--i;
		--i;
		--i;
		return i;
	}
	public static void andfl () {
		float value1=3.5f;
		float value2=3.1f;
	  if(value1==3.5 && value2 ==3.1) {
		System.out.println("Yes is true");
	  }
	  else {
		  System.out.println("No");
	  }
	}
	public static void orchar() {
		char a='A',b='B';
		if(a=='A' || b=='B') {
			System.out.println(true);
		}else {
			System.out.print(false);
		}
	}
}
