import java.lang.runtime.SwitchBootstraps;

public class Java {
    / comment example

    /**

     * description .. type of comment

     * */



// .java -> .class (javac) -> JVM run our program code



// public - модификатор доступа. (доступно в любом месте нашей программы)

// class - шаблон проектирования будущих объектов

    public class FirstProgram {

/**

 * Тип данных, название свойства (переменная) и значение свойства

 * 1. int - целое число, например: 10 TODO

 * 2. double - десятичное чисто, например: 10.5 TODO

 * 3. float - десятичное чисто, например: 10.5

 * 4. short - целое число, например: 10

 * 5. long - целое число, например: 10

 * 6. byte - целое число, например: 10

 * 7. boolean - логический тип, два значения: true и false. TODO

 * 8. char - любой символ, например из ASCII, например: %

 */



        /**

         * Ссылочные типы данных

         * 1. Object

         * 2. Array

         * 3. String TODO

         */



// переменные, описывающие свойства объекта

        String name = "Sergei"; //объявление + инициализация переменной

        int age = 31;

        boolean isStudent = false;

        static int result; // просто объявили переменную



// методы, это функции, которые принадлежат определенному объекту и реализуют поведение

// void - метод, который ничего не возвращает

// return возвращает результат и у него есть примитивный или ссылочный - тип возвращаемого значения

// () - сигнатура метода, используется для передачи аргуентов для вычисления

// {} - тело метода, где происходит вычисление

        public static void sum(int param1, int param2){

            result = param1 + param2;

            System.out.println("RESULT: " + result);

        }



        /**

         * Условный оператор и оператор ветвления

         * 1. if(){} else {} - условный оператор

         * 2. switch() case - оператор ветвления

         * */



//static - неизменяемое выполнение

        public static void main(String[] args) {

            calc(21, 3, "+");

            calc(21, 3, "-");

            calc(21, 3, "/");

            calc(21, 3, "*");

            calc(21, 3, "%");

        }



// вот это переписать на switch case конструкцию вместо if else

// = это присваивание

// == это сравнение

        static void calc(double param1, double param2, String operation){

            double result;

 if(operation == "+"){

 result = param1 + param2;

 System.out.println("Результат операции: " + operation + " равен: " + result);

 } else if(operation == "-") {

 result = param1 - param2;

 System.out.println("Результат операции: " + operation + " равен: " + result);

 } else if(operation == "/") {

 result = param1 / param2;

 System.out.println("Результат операции: " + operation + " равен: " + result);

 } else if(operation == "*") {

 result = param1 * param2;

 System.out.println("Результат операции: " + operation + " равен: " + result);

 } else {

 System.out.println("Извините, такой операции нет");

 }

        }



    }
    static void calc(double param1, double param2, String operation){

        double result;

        switch (operation){
            case "+":
            result = param1 + param2;

            System.out.println("operation:" + operation + "result:" + result);
            break;
            case"-":
                result = param1 + param2;

                System.out.println("operation:" + operation + "result:" + result);
                break;
            case "*":
                result = param1 + param2;

                System.out.println("operation:" + operation + "result:" + result);
                break;
            case "/":
                result = param1 + param2;

                System.out.println("operation:" + operation + "result:" + result);
                break;
            default:

                System.out.println("Извините, такой операции нет");

        }

    }







}
