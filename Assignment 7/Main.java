public class Main {
    public static void main(String[] args) {

        Enemy enemy1 = new Enemy(4,1);

        Wizard wizard1 = new Wizard(2,1,"fire");
        Wizard wizard2 = new Wizard(7,4,"Ice");

        Goblin goblin1= new Goblin(7,3);



        enemy1.attack();
        wizard1.damageType();
        wizard2.damageType();
        goblin1.attack();
    }
}
