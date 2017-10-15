package test;

import java.util.*;

public class a {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
		System.out.println("1 - Из десятичной в двоичную и шеснадцатеричную");
		System.out.println("2 - Из двоичной в десятичную");
		//System.out.println("3 - Из шеснадцатеричной в десятичную");
		System.out.println("3 - Выйти");
		byte choice = sc.nextByte();
		if(choice == 1) {
			System.out.print("Число: ");
			long n = sc.nextLong();
			long n16 = n;
			long k;
			while(true) {
			if(n < 9223372036854775807L) {
				k = -9223372036854775808L;
				break;
			}
			if(n < 2147483647) {
				k = -2147483648;
				break;
			}
			if(n < 32767) {
				k = -32768;
				break;
			}
			if(n < 127) {
				k = -128;
				break;
			}
			else {
				
			if(n > -128) {
				k = 128;
				break;
			}
			if(n > -32768) {
				k = 32768;
				break;
			}
			if(n > -2147483648L) {
				k = 2147483648L;
				break;
			}
			if(n > -9223372036854775808L) {
				k = 9223372036854775807L;
				break;
			}
			else { 
			k = 0;
			break;
			}
			}
			}
			
			System.out.println();
			
			while(k <= -1) {//if(n < 0) 
				/*if(k == -9223372036854775808L) {
					System.out.print("1");
					n *= -1;
					k /= 2;
					continue;
				}*/
				if(n + k >= 0) { 
					System.out.print("1");
					n += k;
				}
				else System.out.print("0");
				k /= 2;
			}
			/*else while(k <= -1) {
				if(n + k >= 0) { 
					System.out.print("1");
					n += k;
				}
				else System.out.print("0");
				k /= 2;
			}*/
			System.out.print(" ");
			if(n16 >= 0) {
				
				for(long h = n16; h >= 1; h /= 16) 
					if(h < 10) { 
						System.out.print(h);
						}
			for(long y; n16 >= 16; n16 /= 16) {
				y = n16 % 16;
				if(y < 10) System.out.print(y);
				if(y == 10) System.out.print("A");
				if(y == 11) System.out.print("B");
				if(y == 12) System.out.print("C");
				if(y == 13) System.out.print("D");
				if(y == 14) System.out.print("E");
				if(y == 15) System.out.print("F");
				
			}
			}
			if(n16 < 0) {
				long m = 9223372036854775807L + n16 + 1;
				/*for(long h = m; h >= 1; h /= 16) 
					if(h < 10) { 
						System.out.print(h);
						}*/
				for(long y; 9223372036854775807L + n16 + 1 >= 16; m /= 16) {
					y = m % 16;
					if(y == 10) System.out.print("A");
					if(y == 11) System.out.print("B");
					if(y == 12) System.out.print("C");
					if(y == 13) System.out.print("D");
					if(y == 14) System.out.print("E");
					if(y == 15) System.out.print("F");
					if(y < 10) System.out.print(y);
					
				}
				}
			//System.out.print(n16);
			System.out.println();
			
			
			
		}
		if (choice == 2) {
			long answer = 0;
			long k = -9223372036854775808L;
			System.out.print("Число: ");
			byte n[] = new byte[64];
			for(byte i = 0; i < 64; i++) n[i] = sc.nextByte();
			
			System.out.println();
			for(byte i = 0; i < 64; i++) {
				if(n[i] == 1) {
					answer -= k;
					k /= 2;
				}
				if(n[i] == 0) k /= 2;
				
			}
			
			System.out.println(answer);
			System.out.println();
			
		}
		/*if (choice == 3) {
			
		}*/
		if (choice == 3) {
			sc.close();
			loop = false;
		}
		}
	}
}
