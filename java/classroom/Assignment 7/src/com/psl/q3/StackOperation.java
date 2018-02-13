package com.psl.q3;

import java.util.Date;

import com.psl.q2.Contact;
import com.psl.q2.IncompleteDataException;
import com.psl.q2.InvalidEmailException;
import com.psl.q2.MissingContactDetailException;

public class StackOperation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ContactStack cs =new ContactStack(3);

		Contact c = new Contact("abc", "xyz", 'M', new Date(1995,10,9),
				"abc@xyz.com", 3866786876l, 9786866543l);
		Contact c1 = new Contact("pooja", "naik", 'F', new Date(1992,6,18),
				"pooja@xyz.com", 8676756545l, 6876465343l);
		Contact c2 = new Contact("veda", "rai", 'f', new Date(1998,7,23),
				"abc@xyz.com", 4526756777l, 56687586878l);
		Contact c3 = new Contact("abc", "xyz", 'M', new Date(1994,10,28),
				"abc@xyz.com",7896755675l, 2333333343l);
		try {
			cs.push(c);
			Contact cc=cs.peek();
			System.out.println("Details at Top of stack...\n"+cc);
			cs.push(c1);
			cc=cs.peek();
			System.out.println("Details at Top of stack...\n"+cc);
			cs.push(c2);
			cc=cs.peek();
			//cs.push(c3);     /*stack full exception*/
			System.out.println("Details at Top of stack...\n"+cc);
			cs.pop();
			cc=cs.peek();
			System.out.println("Details at Top of stack...\n"+cc);
			cs.pop();
			cc=cs.peek();
			System.out.println("Details at Top of stack...\n"+cc);
			cs.pop();
			//cs.pop();     /*stack empty exception*/
			cs.push(c3);
			
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

