package za.co.mattresssales;

public class PrintProduct {
    private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printTotalProductSales() {
        System.out.println("Total Number of Products Sold: " + product.GetTotalProductSold());
    }

    public void printAverageProductSales() {
        System.out.println("Average Products Sold Per Product: " + product.GetAverageProductSold());
    }

    public void printMostPopularProductSale() {
        System.out.println("Most Popular Product: " + product.GetMostPopularProduct());
    }
}
