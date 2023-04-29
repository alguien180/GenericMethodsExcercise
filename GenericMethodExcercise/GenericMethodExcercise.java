package GenericMethodExcercise;

import java.util.ArrayList;

public class GenericMethodExcercise {

    //Constructor that prints elements of Arrays of any type
    public <T> void printArray(T[] array) {
        for (T arrayitem : array) {
            System.out.println(arrayitem);
        }
    }

    //Constructor that allows you to print an ArrayList with elements of any type
    public <T> void printList(ArrayList<T> list) {
        for (Object elem : list)
            System.out.println(elem);
        System.out.println();
    }

    //Constructor that allows you to print only elements of ArrayLists of numbers
//  restricted using an UPPER bounded wildcard ("<? extends Number>)
    public double sumOfList(ArrayList<? extends Number> arrayList) {
        double s = 0.0;
        for (Number n:arrayList)
            s+=n.doubleValue();
        return s;
    }

    //Constructor that allows you to print only elements of ArrayLists of numbers
    //  restricted using a LOWER bounded wildcard ("<? super Number>)
    public void addNumbers(ArrayList <? super Integer> arrayList){
        for (int i=1; i<10;i++){
            arrayList.add(i);
        }
    }
}