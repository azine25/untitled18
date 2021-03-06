package com;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Main main = new Main();
        Hero[] heroes = main.createHeroes();
        boss.setBossDamage(100);
        boss.setBossDefence("Physical, ");
        boss.setBossHealth(1000);
        System.out.println("Boss attak type: " + boss.getBossDefence() + "\nBoss health: " + boss.getBossHealth() + "\nBoss damage: "
                + boss.getBossDamage());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getHeroesAttakType() + " " + heroes[i].getHeroesHealth() + " " + heroes[i].getHeroesDamage());
        }

    }


    public static Hero[] createHeroes() {
        Hero magical = new Hero("Magical", 500, 50);
        Hero physical = new Hero("Physical", 550, 65);
        Hero kinetic = new Hero(450, 70);


        Hero[] heroes = {magical, physical, kinetic};

        return heroes;
    }





    /*
    Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
    Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
    в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.

    Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
    Добавить в класс геттеры и сеттеры для всех полей.
    В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
    Затем распечатать всю информацию о боссе.

    ДЗ на сообразительность:
    Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев
    с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй).
    Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return,
    как возвращаемый результат метода createHeroes.
    '
    Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
     */
}
