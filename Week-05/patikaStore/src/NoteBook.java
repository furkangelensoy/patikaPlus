public class NoteBook extends Product{
    private static int idCounter = 1;
    public NoteBook(String name, double price, Brand brand, int memorySize, double screenSize, int ram, int stockAmount, double discountRate) {
        super(idCounter, name, price, brand, memorySize, screenSize, ram, stockAmount, discountRate);
        this.idCounter++;
    }
}
