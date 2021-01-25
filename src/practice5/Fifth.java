package practice5;
//5. Сумма цифр числа
//Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну
//и циклы, разумеется).
public class Fifth {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(123));
    }
}
