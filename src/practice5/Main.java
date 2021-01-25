package practice5;
//7. Разложение на множители
//Дано натуральное число n>1. Выведите все простые множители этого
//числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
//сложность O(logn)
public class Main {
    public static void recursion(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }
        else {
            recursion(n, ++k);
        }
    }
    public static void main(String[] args) {
        recursion(150, 2); // вызов рекурсивной функции, k = 2 всегда
    }
}
