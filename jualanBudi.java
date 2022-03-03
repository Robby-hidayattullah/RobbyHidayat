package week1;

class hargaBarangan {
	private int pensil = 1000;
	private int bolpoint = 2000;
	private int penghapus = 500;
	
	public int penjumlahanBarang(int item1, int item2, int item3) {
		int hargaTotal = (item1 * this.pensil) + (item2 * this.bolpoint) + (item3 * this.penghapus);
		return hargaTotal;
	}
}

public class jualanBudi {

	public static void main(String[] args) {

		hargaBarangan ahmad = new hargaBarangan();
		int harga1 = ahmad.penjumlahanBarang(10, 10, 20);

		hargaBarangan budi = new hargaBarangan();
		int harga2 = budi.penjumlahanBarang(30, 5, 2);

		System.out.println("Total Uang Yang Didapatkan Pedagang Ahmad : " + harga1 + " Rupiah.");
		System.out.println("Total Uang Yang Didapatkan Pedagang Budi : " + harga2 + " Rupiah.");

	}

}
