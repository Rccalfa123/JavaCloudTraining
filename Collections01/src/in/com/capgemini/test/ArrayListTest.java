package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		Car alto = new Car("Suzuki", "Alto800", 2000, 650000);
		Car dezire = new Car("Suzuki", "SwiftDezire", 2008, 650000);
		Car sumo = new Car("Mahindra", "TataSumo", 1998, 650000);

		Laptop lenovo = new Laptop("Lenono", "thinkpad", "Windows10", "i7");
		Laptop dell = new Laptop("Dell", "inspiron", "Windows7", "i5");
		Laptop asus = new Laptop("Asus", "blaze", "Ubuntu", "i3");

		Television panasonic = new Television("Panasonic", "LCD", true, 15478);
		Television samsung = new Television("Samsung", "LED", true, 10000);
		Television hyundai = new Television("Hyundai", "Plasma", false, 12000);

		CellPhone redmi = new CellPhone("Redmi", "Redmi3s", "4G Volte Set", "Nouget", 6000);
		CellPhone j7pro = new CellPhone("Samsung", "Sj7pro", "4G Volte Set and good handset", "Oreo", 20000);
		CellPhone nokiaN6 = new CellPhone("Nokia", "NokiaN6", "good camera", "Oreo", 14000);

		School bpps = new School("Bpps", "patna", "BPPS", "patna", "A+");
		School don_Bosko = new School("Don Bosko", "kolkata", "Don Bosko", "kolkata", "A++");
		School michaels = new School("Michaels", "delhi", "Michaels", "kolkata", "A");

		List<Object> arrayList = new ArrayList<Object>();

		arrayList.add(alto);
		arrayList.add(dezire);
		arrayList.add(sumo);

		arrayList.add(lenovo);
		arrayList.add(dell);
		arrayList.add(asus);

		arrayList.add(panasonic);
		arrayList.add(samsung);
		arrayList.add(hyundai);

		arrayList.add(redmi);
		arrayList.add(j7pro);
		arrayList.add(nokiaN6);

		arrayList.add(bpps);
		arrayList.add(don_Bosko);
		arrayList.add(michaels);

		System.out.println("ArrayList Output : ");
		for (Object e : arrayList) {
			System.out.println(e + "\n");
		}
	}

}
