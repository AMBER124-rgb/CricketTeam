package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Cricket;

public class populateCricketers {

	public static List<Cricket> populateListCric (){
		
		List<Cricket> criclist = new ArrayList<>();
		
		//String name, int age, String email_id, String phone, int rating
		criclist.add(new Cricket("Sachin", 40, "sachin123@gmail.com", "12345",10));
		criclist.add(new Cricket("Virat", 30, "virat123@gmail.com", "18475",8));
		criclist.add(new Cricket("Dhoni", 37, "dhoni123@gmail.com", "12134",9));
		criclist.add(new Cricket("rahul", 34, "rahul123@gmail.com", "12456",7));
		criclist.add(new Cricket("Shikhar", 28, "shikhar123@gmail.com", "95874",8));
		criclist.add(new Cricket("iyer", 35, "iyer123@gmail.com", "36479",7));
		criclist.add(new Cricket("pant", 25, "pant123@gmail.com", "64545",6));
		
		return criclist;
		
		
	}
}
