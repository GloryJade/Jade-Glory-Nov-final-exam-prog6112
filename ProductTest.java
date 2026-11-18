package za.co.mattresssales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        String[] testProducts = {"Prod A", "Prod B"};
        int[][] testSales = {
            {10, 20}, // 30
            {30, 40}  // 70 -> Total = 100
        };
        
        Product product = new Product(testProducts, testSales);
        assertEquals(100, product.GetTotalProductSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] testProducts = {"Prod A", "Prod B"};
        int[][] testSales = {
            {10, 20}, // 30
            {30, 40}  // 70 -> Total = 100, Average = 50.0
        };
        
        Product product = new Product(testProducts, testSales);
        assertEquals(50.0, product.GetAverageProductSold(), 0.001);
    }
}