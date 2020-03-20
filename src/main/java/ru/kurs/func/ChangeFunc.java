package ru.kurs.func;

public class ChangeFunc {
    //enum - объект для работы с перечисляемыми значениями, в нашем случае - функциями
    public enum Functions {

        LINE{
            public double function(double x, double a, double b, double c) {return a * x + b;};
        },
        PARABOLA{
            public double function(double x, double a, double b, double c) {return a * (x * x) + b * x + c;};
        },
        HYPERBOLA{
            public double function(double x, double a, double b, double c) {return a * (x * x * x) + b * (x * x) + c * x;};
        },
        SQRT{
            public double function(double x, double a, double b, double c) {return a * Math.sqrt(x + b) + c;};
        };

        //абстрактная функция, которая является "основой" всех функций (в ней указываются параметры и название)
        public abstract double function(double x, double a, double b, double c);

    }

    //метод для определения функции
    public Functions compare(String s) {
        if (s.equals("Парабола")) {
            return Functions.PARABOLA;
        } else if (s.equals("Гипербола")) {
            return Functions.HYPERBOLA;
        } else if (s.equals("Квадратный корень")) {
            return Functions.SQRT;
        } else {
            return Functions.LINE;
        }
    }

}
