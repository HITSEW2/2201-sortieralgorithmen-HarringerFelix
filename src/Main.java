/*
        Felix Harringer
        2CHIT
        15-10-2025
        2201_Sortieralgorithmen

 */



public class Main {
    public static void main(String[] args) {


        String[] vornamen = {"Lukas", "Emma", "Noah", "Mia", "Leon", "Sophie", "Ben", "Lina", "Paul", "Hannah", "Marie", "Jonas", "Luca", "Laura", "Felix", "Clara", "Finn", "Nina", "Max"};
        String target= "Lukas";

        BubbleSort(vornamen);
        System.out.println();
        System.out.println();
        InsertionSort(vornamen);
        System.out.println();
        System.out.println();
        BinarySearch(vornamen,target);




    }

    public static void  BubbleSort(String[] vornamen) {


        for (int i = 0; i < vornamen.length - 1; i++) {
            for (int j = 0; j < vornamen.length - i - 1; j++) {
                if (vornamen[j].compareTo(vornamen[j + 1])>0) {

                    String temp = vornamen[j];
                    vornamen[j] = vornamen[j + 1];
                    vornamen[j + 1] = temp;



                }

            }

        }


        for (String name : vornamen) {
            System.out.println(name);
        }


    }

    public static void  InsertionSort(String[] vornamen) {
        for (int i = 1; i < vornamen.length; i++) {
            String key = vornamen[i];
            int j = i - 1;


            while (vornamen[j].compareTo(key) > 0) {
                vornamen[j + 1] = vornamen[j];
                j--;
            }

            vornamen[j + 1] = key;
        }

        for (String name : vornamen) {
            System.out.println(name);
        }
    }

    public static void BinarySearch(String[] vornamen, String target) {
        int left = 0;
        int right = vornamen.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = vornamen[mid].compareTo(target);

            if (compare == 0) {
                System.out.println("The name " + target + " is at position " + mid + " in the array.");
                return;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


    }


}

