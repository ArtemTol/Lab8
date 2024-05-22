import java.sql.SQLOutput;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
//        Scanner scan = new Scanner((System.in));
////        System.out.print("Введите имя: ");
////        String name = scan.nextLine();
////        System.out.println("Привет " + name);
//        int arr[] = new int[4];
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.print("Введите число: ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//        }
//        int minim = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if (arr[i] < minim)
//                minim = arr[i];
//        }
//        System.out.print("Минимальное число в массиве " + minim);
        // Коллекции
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(566);
        numbers.add(1, 55);
        //System.out.println(numbers.size());
        System.out.println(numbers.get(1));

        for (Integer i: numbers){
            System.out.println(i);
        }

        LinkedList<Float> nums = new LinkedList<>();
        nums.add(5.5f);

        for (Float i: nums){
            System.out.println(i);
        }
    }
}