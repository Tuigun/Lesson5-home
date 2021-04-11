package com.geektech;

public class Main {

    public class CreateHero{

        int Jax;
        int LueKang;
                int Scorpion;

        public CreateHero(int jax, int lueKang, int scorpion) {
            Jax = jax;
            LueKang = lueKang;
            Scorpion = scorpion;

        }
    }



    public static void main(String[] args) {
	// write your code here

        //это создание обьекта в памяти
        //тип данных, название, равно, ключевое слово new, вызов конструктора
        Hero jax  = new Hero (300,30,"iron strike");





        System.out.println(" Jax health " + jax.getHealth() + " Jax super hit " + jax.getSuperStrike() + " " +
                jax.getHit());


        Hero lukang = new Hero(250,25, "Fire strike ");
        System.out.println(" LuKang Health " + lukang.getHealth() + " luKanf super hit " + lukang.getSuperStrike()  +  "" +
                lukang.getHit());


        Hero[] customHero = {createHero("Jax"),createHero("Lu Kang"),createHero(" Scorpion " )};

        for (Hero hero : customHero) {
            System.out.println(hero.getHealth());
        }



        Hero Scorpion = new Hero(350, 35," Hell Strike ");
        System.out.println(" Scarpion Health "+"---" + Scorpion.getHealth() + " Scorpion Hit " + Scorpion.getHit()
                + " Scorpion " + Scorpion.getSuperStrike() );


        //Конструктор для Босса

        Boss ShoeKhan = new Boss(4700, 50," iron ");
        System.out.println(" Shoe Khan Health "+ShoeKhan.getHealth()+ " Hit " + ShoeKhan.getHit()
                + ShoeKhan.getShield() + " Shoe Khan Shield ");

    }
    public static Hero[] createHero(){
        Hero Jax = new Hero(300, 30,"iron strike");
        Hero LuKang = new Hero(250,25,"fire strike");
        Hero Scorpion = new Hero(350,35,"hell strike");

        return new Hero[]{Jax,LuKang,Scorpion};
    }

    public static Hero createHero(String heroType) {
        switch (heroType) {
            case "Jax":
                return new Hero(300, 50, "iron strike");
            case "Lu Kang":
                return new Hero(250, 25, "fire ball");
            case " Scorpion ":
                return new Hero(350, 35, "hell Strike");
        }
        return null;
    }

}