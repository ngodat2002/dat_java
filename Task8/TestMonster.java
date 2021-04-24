package Task8;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1=new FireMonster("KingMan");
        Monster m2=new WaterMonster("KingMan");
        Monster m3=new StoneMonster("KingMan");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        Monster m4=new Monster("KingMan");
        System.out.println(m4 instanceof Monster);
        System.out.println(m2 instanceof FireMonster);
        System.out.println(m4.attack());
        m1 = new StoneMonster("Kilgot");
        System.out.println(m1.attack());
    }
}
