public class Main {
    public static void main(String[] args) {
        // Задача №1
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача №2
        int temperature = 12;
        if (temperature < -5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        // Задача №3
        int speed = 47;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }

        // Задача №4
        age = 14;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в десткий сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }

        // Задача №5
        age = 5;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения.");
        }

        // Задача №6
        int carriageCapacity = 57;
        if (carriageCapacity <= 60) {
            System.out.println("В вагоне остались сидячие места.");
        } else if (carriageCapacity > 60 && carriageCapacity <= 102) {
            System.out.println("В вагоне остались только стоячие места.");
        } else {
            System.out.println("В вагоне не осталось свободных мест.");
        }

        // Задача №7
        int one = 25;
        int two = 371;
        int three = -89;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое.");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое.");
        } else {
            System.out.println("Число " + three + " самое большое.");
        }
    }
}