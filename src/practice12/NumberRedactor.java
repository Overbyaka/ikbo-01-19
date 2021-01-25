package practice12;
//Задание 4. (30%)
//Разработайте класс, которɵй полɭɱает строковое представление телеɮонного номера в одном из двɭɯ
//возможнɵɯ строковɵɯ ɮорматов:
//+<Код странɵ><Номер 10 ɰиɮр>, например “+79175655655” или
//“+104289652211” или
//8<Номер 10 ɰиɮр> длɹ России, например “89175655655”
//и преобразɭет полɭɱеннɭɸ строкɭ в ɮормат:
//+<Код странɵ><Три ɰиɮрɵ>–<Три ɰиɮрɵ>–<Четɵре ɰиɮрɵ>
public class NumberRedactor {
    public static String red(String num){
        StringBuilder str = new StringBuilder(num);
        if(str.charAt(0) != '+') {
            str.deleteCharAt(0);
            str.insert(0, "+7");
        }
        str.insert(str.length() - 7, '-');
        str.insert(str.length() - 4, '-');
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(red("89175655655"));
        System.out.println(red("+104289652211"));
    }
}
