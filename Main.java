package za.co.mattresssales;

public class Main {
    public static void main(String[] args) {
        // 1D Array: 3 Top-performing mattress products
        String[] products = {"Memory Foam Lux", "Hybrid Comfort", "Orthopedic Firm"};
        
        // 2D Array: Sales over 3 months [3 products][3 months]
        int[][] salesData = {
            {120, 150, 180}, // Memory Foam Lux sales (Month 1, 2, 3)
            {200, 210, 250}, // Hybrid Comfort sales (Month 1, 2, 3)
            {90,  110, 100}  // Orthopedic Firm sales (Month 1, 2, 3)
        };

        Product productManager = new Product(products, salesData);
        PrintProduct printer = new PrintProduct(productManager);

        System.out.println("========================================");
        System.out.println("     LOCAL MATTRESS SALES REPORT        ");
        System.out.println("========================================");
        printer.printTotalProductSales();
        printer.printAverageProductSales();
        printer.printMostPopularProductSale();
        System.out.println("========================================");
    }
}
