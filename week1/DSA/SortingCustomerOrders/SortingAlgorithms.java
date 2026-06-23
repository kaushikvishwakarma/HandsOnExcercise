package SortingCustomerOrders;

public class SortingAlgorithms {
    public static void bubbleSort(Order[] orders) {
        if (orders == null || orders.length < 2) {
            return;
        }

        for (int i = 0; i < orders.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < orders.length - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (orders == null || low >= high) {
            return;
        }

        int pivotIndex = partition(orders, low, high);
        quickSort(orders, low, pivotIndex - 1);
        quickSort(orders, pivotIndex + 1, high);
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int smallerIndex = low - 1;

        for (int currentIndex = low; currentIndex < high; currentIndex++) {
            if (orders[currentIndex].getTotalPrice() <= pivot) {
                smallerIndex++;
                Order temp = orders[smallerIndex];
                orders[smallerIndex] = orders[currentIndex];
                orders[currentIndex] = temp;
            }
        }

        Order temp = orders[smallerIndex + 1];
        orders[smallerIndex + 1] = orders[high];
        orders[high] = temp;

        return smallerIndex + 1;
    }
}