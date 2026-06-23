package EcommerceSearchFunction;

public class SearchAlgorithms {
    public static Product linearSearch(Product[] products, int targetProductId) {
        if (products == null) {
            return null;
        }

        for (Product product : products) {
            if (product != null && product.getProductId() == targetProductId) {
                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, int targetProductId) {
        if (sortedProducts == null) {
            return null;
        }

        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            Product middleProduct = sortedProducts[middle];

            if (middleProduct == null) {
                return null;
            }

            if (middleProduct.getProductId() == targetProductId) {
                return middleProduct;
            }

            if (middleProduct.getProductId() < targetProductId) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return null;
    }
}