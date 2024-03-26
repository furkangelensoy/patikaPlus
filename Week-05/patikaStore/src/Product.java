public abstract class Product {
    private int id;
    private String name;
    private double price;
    private Brand brand;
    private int memorySize;
    private double screenSize;
    private int ram;
    private int stockAmount;
    private double discountRate;

    public Product(int id, String name, double price, Brand brand, int memorySize, double screenSize, int ram, int stockAmount, double discountRate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.ram = ram;
        this.stockAmount = stockAmount;
        this.discountRate = discountRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
