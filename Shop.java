public class Shop
{
	static String name = "Bala"; //Class specific information
	static int doorNo = 123; //Class specific information
	int price;// object,non-static variable
public static void main(String[] args)
{
	System.out.println(Shop.name);
	System.out.println(Shop.doorNo);
	Shop pencil = new Shop();
	pencil.price = 5;
	Shop note = new Shop();
	note.price = 10;
	Shop paper = new Shop();
	paper.price = 1;
	System.out.println("Pencil price is "  + pencil.price);
}
}