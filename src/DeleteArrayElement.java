import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 4, 6, 7, 8, 6, 5, 20, 50, 88, 45, 14, 7878};
        System.out.println("Before:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
        System.out.println("Enter a number: ");
        int x = input.nextInt();

        for (int j = 0; j <= numbers.length - 1; j++) {
            if (x == numbers[j]) {
                int pos = j;
                System.out.println("Position: " + pos);
                for (int k = pos; k <= numbers.length - 1; k++) {
                    if (pos == numbers.length - 1) {
                        numbers[pos] = 0;
                    } else {
                        numbers[pos] = numbers[pos + 1];
                        numbers[pos + 1] = 0;
                        pos++;
                    }
                }
            }
        }
        System.out.println("After:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }
}


