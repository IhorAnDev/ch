package Work.Construktor;

public class Main {
    public static void main(String[] args) {
        SayCatService sayCatService = new SayCatService();

        Cat lori = new Cat("Lori ");
        sayCatService.say(lori, "Miaaauu");

        Cat banny = new Cat("Banny ");
        sayCatService.say(banny, "Eeeeeeeeeeeeeee");

        Cat bax = new Cat("Bax ");
        sayCatService.say(bax, "Ku-ku");

        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);

    }
}
