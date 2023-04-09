package org.hg;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int a[] = {23,12,34,56,12,34,2,3,33,1,67,8,324,56,98,122,666};
		for(int i=1;i<a.length;i++) {
			int index =0;
			for(int j=1;j<a.length-i;j++) {
				if(a[index]<a[j]) {
					index=j;
				}
			}
			int tmp = a[a.length-i];
			a[a.length-i]=a[index];
			a[index]=tmp;
		}
		System.out.println(Arrays.toString(a));

	}

}
