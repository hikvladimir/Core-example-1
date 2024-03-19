package task.oop;

public class OOP {
    public static void main(String[] args) {

    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
    //  1. Метод, принимающий 2 числа и возвращающий их сумму.
    //  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
    //  3. Метод, принимающий строку и возвращающий ее.
    //  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
    //  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.

    class Parent {
        public double sum(double value1, double value2) {
            return value1 + value2;
        }

        public int sumInt(String st) {
            String value = String.valueOf(st.charAt(0));
            String value2 = String.valueOf(st.charAt(1));
            int result = Integer.parseInt(value);
            int result2 = Integer.parseInt(value2);
            return result + result2;
        }

        public String string(String st) {
            return st;
        }

        Parent() {
            System.out.println("I am Parent");
        }

        public String subString(String st, String st2) {
            return st + st2;
        }
    }

    // TODO: Создайте класс Child1 и переопределите все 5 методов.
    //  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
    //  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
    //  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
    //  4. Четвертый метод выводит на экран "I am Child1".
    //  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.

    class Child extends Parent {
        @Override
        public double sum(double value1, double value2) {
            return value1 * value2;
        }

        @Override
        public int sumInt(String st) {
            String value = String.valueOf(st.charAt(0));
            String value2 = String.valueOf(st.charAt(1));
            return Integer.parseInt(value) * Integer.parseInt(value2);
        }

        @Override
        public String string(String st) {
            return String.valueOf(st.charAt(0));
        }

        Child() {
            System.out.println("I am Child");
        }

        @Override
        public String subString(String st, String st2) {
            int central = (st + st2).length() / 2;
            return (st + st2).substring(0, central);
        }
    }


    // TODO: Создайте класс Child2 и перегрузите методы.
    //  1. Первый метод примет 3 числа и сложит их.
    //  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
    //  3. Третий метод примет две строки и вернет их конкатенацию.
    //  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
    //  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.

    class Child2 extends Parent {
        public double Sum(double value1, double value2, double value3) {
            return value1 + value2 + value3;
        }

        public int SumInt(String st, String st2, String st3) {
            String value = String.valueOf(st.charAt(0));
            String value2 = String.valueOf(st2.charAt(0));
            String value3 = String.valueOf(st3.charAt(0));
            return Integer.parseInt(value) + Integer.parseInt(value2) + Integer.parseInt(value3);
        }

        public String string(String st, String st2) {
            return st + st2;
        }

        Child2(String st) {
            System.out.println("I am Child2" + st);
        }

        public String subString(String st, String st2, String st3) {
            return st + st2 + st3;
        }
    }


    // TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
    //  (например, метод для расчета площади).
    //  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.

    abstract class Figure {
        static final double pi = 3.14;

        Figure(String name) {
            this.name = name;
        }

        String name;

        abstract void square(double a, double b);
    }

    class Circle extends Figure {
        Circle(String name) {
            super(name);
            this.name = name;
        }

        @Override
        void square(double a, double b) {
            System.out.println(pi * a * b);
        }
    }

    class Rectangle extends Figure {
        Rectangle(String name) {
            super(name);
            this.name = name;
        }

        @Override
        void square(double a, double b) {
            System.out.println(a * b);
        }
    }

    class Triangle extends Figure {
        Triangle(String name) {
            super(name);
            this.name = name;
        }

        @Override
        void square(double a, double b) {
            System.out.println((a / 2) * b);
        }
    }


    // TODO: Создайте абстрактный класс "Сотрудник", в котором определены общие характеристики для всех сотрудников (например, имя, возраст).
    //  Создайте подклассы для различных типов сотрудников (например, "Менеджер", "Работник склада"),
    //  в которых можно описать специфичные методы и свойства.

    abstract class Employee {
        Employee(String name) {
            this.name = name;
        }

        int age;

        String name;

        abstract void work();

        abstract void rest();
    }

    class Manager extends Employee {
        Manager(String name) {
            super(name);
        }

        int age = 45;

        @Override
        void work() {
            System.out.println("Управляет проектами");
        }

        @Override
        void rest() {
            System.out.println("Берет работу на дом");
        }
    }

    class WarehouseWorker extends Employee {
        WarehouseWorker(String name) {
            super(name);
        }

        int age = 37;

        @Override
        void work() {
            System.out.println("Заполняет накладную, и ведет учет");
        }

        @Override
        void rest() {
            System.out.println("Отдыхает после работы");
        }
    }
}
