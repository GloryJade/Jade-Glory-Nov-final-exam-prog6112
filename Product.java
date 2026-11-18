package za.co.mattresssales;

public class Product implements IProduct {
    // Single-dimensional array for product names
    private String[] productNames;
    
    // Two-dimensional array for monthly sales [products][months]
    private int[][] monthlySales;

    // Constructor to initialize arrays
    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
    }

    @Override
    public int GetTotalProductSold() {
        int total = 0;
        // Loop through 2D array to sum all sales
        for (int i = 0; i < monthlySales.length; i++) {
            for (int j = 0; j < monthlySales[i].length; j++) {
                total += monthlySales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int totalProducts = productNames.length;
        if (totalProducts == 0) {
            return 0.0;
        }
        double totalSales = GetTotalProductSold();
        // Average products sold per product
        return totalSales / totalProducts;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int bestProductIndex = 0;

        // Calculate sales per product using 2D array rows
        for (int i = 0; i < monthlySales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < monthlySales[i].length; j++) {
                productTotal += monthlySales[i][j];
            }
            
            // Track the highest selling product
            if (productTotal > maxSales) {
                maxSales = productTotal;
                bestProductIndex = i;
            }
        }
        return productNames[bestProductIndex];
    }
}
