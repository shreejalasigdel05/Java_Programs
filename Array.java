public class Array {
    public static void main(String[] args) {
        int[][] numbers={
            {10,40,20},
            {70,80,90}
        };
        System.out.println("Elements of 2D array are: ");
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers[i].length;j++)
            {
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
