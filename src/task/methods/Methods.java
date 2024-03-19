package task.methods;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        System.out.println(string);
        // Вызовы ваших методов
        System.out.println(sum(1, 2));
        System.out.println(sumStr("Hello ", "world!"));
        System.out.println(sumStrInt("14", 4));
        System.out.println(isStringLess("2", 4));
        System.out.println(isBoolean(false, false));
        System.out.println(addInt(2));
       // int[] arr={1,2,3,4};

        System.out.println(evenNumbers(new int[]{1, 2, 3, 4}));
        System.out.println(newArray(new int[]{1, 2, 3, 4}));
        System.out.println(summArr(new int[]{1, 2, 3, 4}));
        getAge(22);
        System.out.println(comparisonName("sdf","sdf"));
        System.out.println(getLastIntArray(new int[]{4,3,2,6}));
        System.out.println(counterCharA("sAAd"));
    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте метод который вернет сумму двух чисел
    public static int sum(int a, int b) {
        return a + b;
    }


    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String sumStr(String str1, String str2) {
        return str1 + str2;
    }


    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой
    public static String sumStrInt(String str, int a) {
        return String.valueOf(Integer.parseInt(str) + a);
    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean isStringLess(String str, int a) {
        return Integer.parseInt(str) <= a;
    }


    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false
    public static boolean isBoolean(boolean a, boolean b) {
//        if (a || b) {
//            return true;
//        } else {
//            return false;
//        }
        return a||b;
    }


    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean addInt(int value) {
        return value % 2 == 0;
    }


// TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
//  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
public static String evenNumbers(int[] array) {
    int even = 0;
    for (int j : array) {
        if (j % 2 == 0) {
            even++;
        }
    }
    return (even == array.length) ? "Массив четных " : (even == 0) ? "Массив нечетных " : "Массив четных и не четных";
}


// TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] newArray(int[] array) {
        int[] arrey1 = new int[array.length];
        System.arraycopy(array, 0, arrey1, 0, array.length);
        return arrey1;
    }


// TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static  int summArr(int[] array) {
        int summ=0;
        for (int j : array) {
            summ += j;
        }
        return summ;
    }


// TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static void getAge(int age) {
    int mount = age * 12;
    int hour = (mount * 30) * 24;
    int minute = hour * 60;
    System.out.println("Человек прожил" + " месяцев:" + mount + " часов:" + hour + " минут:" + minute);
}

// TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static boolean comparisonName(String name, String name2) {
    return name.equalsIgnoreCase(name2);
}


// TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int getLastIntArray(int[] array) {
        return array[array.length-1];
    }

// TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int counterCharA(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A') {
                result++;
            }
        }
        return result;
    }

// TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика

    private static int wallet = 550;

    public static void wallet(char character, int money) {
        if (character == '-') {
            wallet -= money;
        } else if (character == '+')
            wallet += money;
        if (wallet < 0 || wallet > 1000) {
            System.out.println("Eror");
        } else {
            System.out.println(wallet);
        }
    }
}