package application;

import model.entities.ImportedProduct;
import model.entities.Product;
import model.entities.UsedProduct;
import model.entities.enums.ProductTag;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i ++){
            System.out.println("Enter product #"+ (i) + " data");

            System.out.println("Common, used, or imported? (c/i/u): ");
            char type = sc.next().charAt(0);

            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Price: ");
            Double price = sc.nextDouble();

            if (type == 'i'){
                System.out.println("Custom fee: ");
                Double fee = sc.nextDouble();
                sc.nextLine();

                list.add(new ImportedProduct(name, price, fee, ProductTag.IMPORTED));
            } else if (type == 'u'){
                sc.nextLine();
                System.out.println("Manufracture date, (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.nextLine());
                list.add(new UsedProduct(name, price, ProductTag.USED, date));
            } else{
                list.add(new Product(name, price, ProductTag.COMMON));
            }
        }

        System.out.println();
        System.out.println("PRODUCT TAGS: ");

        for (Product i : list){

            if (i.getTag() == ProductTag.COMMON){
                System.out.println(i.getName() + " - $ " + i.getPrice());
            }

            else if (i.getTag() == ProductTag.USED){
                UsedProduct used = (UsedProduct) i;
                String dateFormatter = sdf.format(used.getManufractureDate());
                System.out.println(i.getName() + " (used) - $ " + i.getPrice() + " Date: " + dateFormatter);
            }

            else if (i.getTag() == ProductTag.IMPORTED) {
                ImportedProduct imported = (ImportedProduct) i;
                System.out.println(String.format(imported.getName() + " - $ " + imported.totalPrice() + " Custom fee: " + imported.getCustomsFee()));
            }
        }
    }
}
