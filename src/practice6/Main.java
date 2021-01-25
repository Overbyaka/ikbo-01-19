package practice6;

public class Main {

    public static void main(String[] args)
    {
        InsertionSort ins = new InsertionSort();
        Student[] arr = new Student[5];
        arr[0] = new Student("Qwe", 1.2, 63);
        arr[1] = new Student("Asd", 2.3, 1528);
        arr[2] = new Student("Zxc", 3.4, 1);
        arr[3] = new Student("Wer", 4.5, 48656);
        arr[4] = new Student("Sdf", 5.6, 32);

        ins.sort(arr);
    }
}
