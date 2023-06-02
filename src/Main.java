import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello_world!");
        System.out.println(5 + 3 * 4 / 2 - 1);
        System.out.println(17 % 4); // Деление по модулю
        /*
        Тэг
        слева направо
        сверху вниз
         */
        System.out.println("Результат сложения:" + 8 + 2);
        System.out.println("Результат сложения:" + (8 + 2));
        int ageOfMyFriend = 45; //Объявление и инициализация переменной

        System.out.println("Возраст моего друга:" + ageOfMyFriend);
        System.out.println("Год рождения друга:" + (2023 - ageOfMyFriend));

        int apples; // Объявление переменной
        System.out.println("Идём в сад");
        apples = 8; // Инициализация переменной
        System.out.println("Выходим из сада и у нас " + apples + " яблок");
        apples = apples + 2; // Переопределение значение переменной
        System.out.println("У меня " + apples + " яблок ");
        apples = 16;
        System.out.println("Новое значение переменной apples " + apples);

        boolean isMyFriendOlderThan50 = ageOfMyFriend > 50;
        System.out.println("Старше ли мой друг 50ти лет? - " + isMyFriendOlderThan50);
        boolean isRainy = true;

        double weightOfMyFriend = 79.45;
        double a = 2 + 7;
        System.out.println("Мой друг весит " + weightOfMyFriend);

        char myFavoriteSymbol = '@';
        String friendsName = "Bolotbek Sagynov";
        String num = "34";
        //System.out.println(num * 2);
        final int LIGHTS_SPEED = 300000;
        //LIGHTS_SPEED = 313131;

        String myFirstHomeWork = "Моя первая домашняя работа ";
        int numRandom = 42 ;
        String helloWorldRussian = "Привет, мир! ";
        System.out.println(myFirstHomeWork + numRandom + helloWorldRussian);

        if (numRandom < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (numRandom > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя!");

        Scanner scanner = new Scanner(System.in);
        String Aidar = scanner.nextLine();
        System.out.println("Привет, " + Aidar + "!");


    }
}