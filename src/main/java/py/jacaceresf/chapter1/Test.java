package py.jacaceresf.chapter1;

public class Test {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        Duck model = new ModelDuck();

        model.performFly();

        ///change the behavior by a setter
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
