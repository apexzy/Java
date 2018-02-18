public class BakeCookies {
    public static void main(String[] args) {
        makeBatter();
        bake();
        bake();
        decorate();
    }
    public static void makeBatter() {
     System.out.println("Mix the dry ingredients.");
     System.out.println("cream the butter and sugar");
     System.out.println("beat in the eggs.");
     System.out.println("stir in the dry ingredients.");
    }
    public static void bake() {
        System.out.println("Set the oven temperature.");
        System.out.println("set the timer for 10 minutes.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake .");
    }
    public static void decorate(){
        System.out.println("mix ingredients for frosting.");
        System.out.println("spread frosting and sprinkles.");
    }
}
