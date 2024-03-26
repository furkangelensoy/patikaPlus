import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Store {
    private String name;
    private List<Brand> brands;
    List<MobilePhone> mobilePhones;
    List<Product> noteBooks;
    Scanner input = new Scanner(System.in);
    private boolean menu;

    public Store() {
        this.name = "Patika Store";
        System.out.println("Welcome to " + this.name + " !");
        this.menu = true;
        this.mobilePhones = new ArrayList<>();
        this.noteBooks = new ArrayList<>();
        this.brands = new ArrayList<>();
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("Hp"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Monster"));
        brands.sort(Comparator.comparing(Brand::getName));
    }

    public void run() {
        while (this.menu) {
            System.out.println("================= Menu =================");
            System.out.println("1- Mobile Phone Operations");
            System.out.println("2- NoteBook Operations");
            System.out.println("3- List of Brands");
            System.out.println("0- Exit");
            System.out.print("Choose: ");
            int choose = input.nextInt();
            switch (choose){
                case 1:
                    operations(1);
                    break;
                case 2:
                    operations(2);
                    break;
                case 3:
                    brandList();
                    break;
                case 0:
                    System.out.println("The program is closing...");
                    this.menu = false;
                    break;
                default:
                    System.out.println("You have entered an invalid value.");


            }

        }
    }

    public void addProduct(int category) {
        System.out.print("Product Name: ");
        String name = input.next();

        System.out.print("Product Price: ");
        double price = input.nextDouble();

        System.out.print("Brand id: ");
        int brandId = input.nextInt();
        if (getBrandById(brandId) != null) {
            Brand brand = this.brands.get(brandId);

            System.out.print("Memory Size: ");
            int memorySize = input.nextInt();

            System.out.print("Screen Size: ");
            double screenSize = input.nextDouble();

            System.out.print("Ram: ");
            int ram = input.nextInt();

            System.out.print("Stock Amount: ");
            int stockAmount = input.nextInt();

            System.out.print("Discount rate: ");
            double discountRate = input.nextDouble();
            if (category == 1) {
                System.out.print("Battery Power: ");
                int batteryPower = input.nextInt();
                mobilePhones.add(new MobilePhone(name, price, brand, memorySize, screenSize, ram, stockAmount, discountRate, batteryPower));
                System.out.println("The product named |" + name + "| has been added!");
                System.out.println("-------------------------------------------");
            } else {
                noteBooks.add(new NoteBook(name, price, brand, memorySize, screenSize, ram, stockAmount, discountRate));
                System.out.println("The product named |" + name + "| has been added!");
                System.out.println("-------------------------------------------");
            }
        } else {
            System.out.println("You have entered invalid brand id. Product could not be added!");
            System.out.println("-------------------------------------------");
        }
    }

    public void deleteProduct(int category, int productId) {
        if (category == 1) {
            this.mobilePhones.removeIf(product -> product.getId() == productId);
        } else {
            this.noteBooks.removeIf(product -> product.getId() == productId);
        }
    }

    public void listProducts(int category) {
        if (category == 1) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("====================== Mobile Phone List ======================");
            System.out.println("---------------------------------------------------------------");
            System.out.println("| ID    | Product Name      | Price        | Brand      | Memory    | Screen    | Ram   | Battery   | Colour    | Stock |");

            for (MobilePhone phone : this.mobilePhones) {
                System.out.format("| %-3d   | %-8s          | %-10.2f ₺ | %-8s   | %-9d | %-6.1f    | %-5d | %-6d    | %-5s     | %-5d |\n",
                        phone.getId(), phone.getName(), phone.getPrice(), phone.getBrand().getName(), phone.getMemorySize(),
                        phone.getScreenSize(), phone.getRam(), phone.getBatteryPower(), phone.getColour(), phone.getStockAmount());

            }
        } else {
            System.out.println("======================== Notebook List ========================");
            System.out.println("---------------------------------------------------------------");
            System.out.println("| ID    | Product Name      | Price        | Brand      | Memory    | Screen    | Ram   | Stock |");
            for (Product noteBooks : this.noteBooks) {
                System.out.format("| %-3d   | %-8s          | %-10.2f ₺ | %-8s   | %-9d | %-6.1f    | %-5d | %-5d |\n",
                        noteBooks.getId(), noteBooks.getName(), noteBooks.getPrice(), noteBooks.getBrand().getName(), noteBooks.getMemorySize(),
                        noteBooks.getScreenSize(), noteBooks.getRam(), noteBooks.getStockAmount());
            }
        }
    }

    public void brandList() {
        System.out.println("| ID  | Name");
        System.out.println("----------------");
        for (Brand brand : this.brands) {
            System.out.format("| %-1d   | %-1s\n", brand.getId(), brand.getName());
        }
    }

    public Brand getBrandById(int brandId) {
        for (Brand brand : brands) {
            if (brand.getId() == brandId) {
                return brand;
            }
        }
        return null;
    }

    public void operations(int category){
        System.out.println("1- Add Product\n2- Delete Product\n3- List Product\n4- Back to main menu");
        System.out.print("Choose: ");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
                addProduct(category);
                break;
            case 2:
                System.out.print("Please enter the product id: ");
                int productId = input.nextInt();
                deleteProduct(category, productId);
                break;
            case 3:
                listProducts(category);
                break;
            case 4:
                run();
                break;
            default:
                System.out.println("You have entered an invalid value!");
                run();
        }
    }
}
