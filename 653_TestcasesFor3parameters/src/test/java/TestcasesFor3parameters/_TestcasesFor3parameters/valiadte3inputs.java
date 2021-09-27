package TestcasesFor3parameters._TestcasesFor3parameters;

import org.testng.annotations.Test;

public class valiadte3inputs {
	int max,m;
	public int max(int l,int w,int h) {
		if(w>l && w>h && l<w) max=w;
		else if(w>l && h>w && l<w) max=h;
		else if(l>w  && l>h) max=l;
		else if(l>w && w<h && h>l) max=h;
		//else if()
		
	
		
		return max;
	}

	
	@Test
	public void maxL() {
		System.out.println(max(5,4,3));
		
		}
	
	@Test
	public void maxl2() {
		System.out.println(max(7,5,6));
	}
	@Test
	public void maxw() {
		System.out.println(max(5,6,3));
	}
	
	@Test
	public void maxw2() {
		System.out.println(max(3,7,5));
	}
	
	@Test
	public void maxh() {
		System.out.println(max(5,6,7));
	}
	
	@Test
	public void maxh2() {
		System.out.println(max(6,5,7));
	}
	
	
	
}
