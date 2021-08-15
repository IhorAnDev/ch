package Work.Inheritanse;

public class Main {
    public static void main(String[] args) {

        British lori = new British(12, "Vlad", "Lori");
        Scottish bax = new Scottish(3, "Petr", "Bax");
        Scottish bax1 = new Scottish(3, "Petr", "Bax");

        lori.sayMeow();
        bax.sayMeow();

        System.out.println(" Cat name:  " + lori.getName() + " Age: " +
                lori.getAge() + " Owner name: " + lori.getOwner());

        System.out.println(" Cat name:  " + bax.getName() + " Age: " +
                bax.getAge() + " Owner name: " + bax.getOwner());

        System.out.println(lori.toString());
        System.out.println(bax.toString());
        System.out.println(bax == bax1);
        System.out.println(bax.equals(bax1));
    }
}
