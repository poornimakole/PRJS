package com.psl.q2;

import java.util.Date;

public class CheckContact {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Contact c = new Contact("abc", "xyz", 'M', new Date(1995,10,9),	"abc@xyz.com", 3866786876l, 9786866543l);
        //Contact c1 = new Contact("pooja", "naik", 'F', null,"pooja@xyz.com", 8676756545l, 6876465343l);
		//Contact c2 = new Contact("veda", "rai", 'f', new Date(1998,7,23),"abc@xyz.com",0, 0);
		//Contact c3 = new Contact("abc", "xyz", 'M', new Date(1994,10,28),"abcxyzcom",7896755675l, 2333333343l);
		try {
			c.validate();
			//c1.validate();
			//c2.validate();
			//c3.validate();
		System.out.println(c);
		//	System.out.println(c1);
		//	System.out.println(c2);
	    //   System.out.println(c3);
			
		} catch (IncompleteDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingContactDetailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
