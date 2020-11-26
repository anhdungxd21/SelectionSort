public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        for(double d: list){
            System.out.printf("%-10.1f", d);
        }
        selectionSort(list);
        System.out.println();
        for(double d: list){
            System.out.printf("%-10.1f", d);
        }
    }

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++) {
            double currentMinValue = list[i];
            int currentIndex = i;
            for (int j =i+1 ; j < list.length; j++) {
                if(currentMinValue > list[j]){
                    currentMinValue = list[j];
                    currentIndex = j;
                }
            }
            if(currentIndex != i){
                list[currentIndex] = list[i];
                list[i] = currentMinValue;
            }
        }
    }
}
