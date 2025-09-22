abstract class Animal {
    Gender gender;
    Alive alive;

    public Animal() {

    }

    public abstract String printSound();

    public abstract String move();

    public abstract boolean isAlive();

    public abstract String printData();

}

class Dog extends Animal {
    String food;
    String name;
    int age;

    public Dog(String name, int age, String food, Gender gender, Alive alive) {
        this.age = age;
        super.gender = gender;
        super.alive = alive;
        this.name = name;
        this.food = food;
    }

    @Override
    public String printSound() {
        return "Woof";
    }

    @Override
    public String move() {
        return "The Dog name " + name + " walking for 3m";
    }

    @Override
    public boolean isAlive() {
        if (super.alive == alive.ALIVE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String printData() {
        String result = "Nama: " + name + "\n" +
                "Gender: " + super.gender + "\n" +
                "Is Alive: " + super.alive + "\n" +
                "Food: " + food + "\n" +
                "Age: " + age;
        return result;
    }
}

class Cat extends Animal {
    String food;
    String name;
    int age;

    public Cat(String name, int age, String food, Gender gender, Alive alive) {
        this.age = age;
        super.alive = alive;
        super.gender = gender;
        this.name = name;
        this.food = food;
    }

    @Override
    public String printSound() {
        return "Meow";
    }

    @Override
    public String move() {
        return "The Cat name " + name + " is walking 5 m";
    }

    @Override
    public boolean isAlive() {
        if (super.alive == alive.ALIVE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String printData() {
        String result = "Nama: " + name + "\n" +
                "Gender: " + super.gender + "\n" +
                "Is Alive: " + super.alive + "\n" +
                "Food: " + food + "\n" +
                "Age: " + age;
        return result;
    }
}

class Duck extends Animal {
    String food;
    String name;
    int age;

    public Duck(String name, int age, String food, Gender gender, Alive alive) {
        this.age = age;
        super.alive = alive;
        super.gender = gender;
        this.name = name;
        this.food = food;
    }

    @Override
    public String printSound() {
        return "Qweck-Qweck";
    }

    @Override
    public String move() {
        return "The Duck name is " + name + " swims for 5 m";
    }

    @Override
    public boolean isAlive() {
        if (super.alive == alive.ALIVE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String printData() {
        String result = "Nama: " + name + "\n" +
                "Gender: " + super.gender + "\n" +
                "Is Alive: " + super.alive + "\n" +
                "Food: " + food + "\n" +
                "Age: " + age;
        return result;
    }
}

class Horse extends Animal {
    String food;
    String name;
    int age;

    public Horse(String name, int age, String food, Gender gender, Alive alive) {
        this.age = age;
        super.alive = alive;
        super.gender = gender;
        this.name = name;
        this.food = food;
    }

    @Override
    public String printSound() {
        return "Ngii";
    }

    @Override
    public String move() {
        return "The Horse name is " + name + " run for 100m";
    }

    @Override
    public boolean isAlive() {
        if (super.alive == alive.ALIVE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String printData() {
        String result = "Nama: " + name + "\n" +
                "Gender: " + super.gender + "\n" +
                "Is Alive: " + isAlive() + "\n" +
                "Food: " + food + "\n" +
                "Age: " + age;
        return result;
    }
}

public class modul3 {
    public static void main(String[] args) {
        Cat kucing = new Cat("Bubu", 3, "Fish", Gender.MALE, Alive.ALIVE);
        System.out.println(kucing.printData());
    }
}
