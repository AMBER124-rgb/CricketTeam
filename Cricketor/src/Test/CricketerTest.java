package Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static utils.populateCricketers.*;
import com.app.core.Cricket;

public class CricketerTest {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<Cricket> criclist = populateListCric();
			boolean exit = false;
			while (!exit) {
				System.out.println("menu");
				try {
					System.out.println("Select one option");
					switch (sc.nextInt()) {
					case 1://Accept min 5 cricketers in Collection

						break;
					case 2://Modify cricketer's rating
						for(Cricket c : criclist)
							System.out.println(c);
						System.out.println("Enter name!!");
						int index1 = criclist.indexOf(new Cricket(sc.next()));
						System.out.println("Enter the rating to changed!!");
							criclist.get(index1).setRating(sc.nextInt());
							for(Cricket c : criclist)
								System.out.println(c);
						break;

					case 3://Search cricketer by name
						for(Cricket c : criclist)
							System.out.println(c);
						System.out.println("Enter name!!");
						int index = criclist.indexOf(new Cricket(sc.next()));
						System.out.println(criclist.get(index)); 
						
						break;
						
					case 4://Display all cricketers in collection
							for(Cricket c : criclist)
								System.out.println(c);
						break;

					case 5://Display cricketers in sorted form by rating
						for(Cricket c : criclist)
							System.out.println(c);
						System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
						Collections.sort(criclist, new Comparator<Cricket>() {

							@Override
							public int compare(Cricket o1, Cricket o2) {
								
								return (o1.getRating()-o2.getRating());
							}
						});
						System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
						for(Cricket c : criclist)
							System.out.println(c);

						break;

					default:
						System.out.println("Invalid input");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.next();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
