package GenericMethodExcercise;

import java.util.ArrayList;

public class GenericMethodDriver {
    public static void main(String[] args) {
        GenericMethodExcercise methodExcercise = new GenericMethodExcercise();
        //testing Unbounded Wildcard (represent any type)
        Integer [] integerArray = {1,2,3};
        String[] stringArray = {"This","is","nice"};

        methodExcercise.printArray(integerArray);
        methodExcercise.printArray(stringArray);

        ArrayList<Double> array = new ArrayList<>();
        array.add(53.2);
        array.add(34.5);
        array.add(10.2);
        array.add(99.6);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(53);
        array2.add(34);
        array2.add(10);
        array2.add(9);

        //testing Upper Bounded Wildcard (represent only extensions of a specific supertype)
        System.out.println(methodExcercise.sumOfList(array));
        System.out.println((int)methodExcercise.sumOfList(array));

        //testing Lower Bounded Wildcard
        ArrayList<Integer> intArray = new ArrayList<>();
        methodExcercise.addNumbers(intArray);
        methodExcercise.printList(intArray);
    }
}
