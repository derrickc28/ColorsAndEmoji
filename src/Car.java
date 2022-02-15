public class Car {

    private final String RED = "\u001B[31m";

    public void animate() throws InterruptedException
    {
        System.out.println(RED + "\u26DF");
        Thread.sleep(250);

        System.out.println(RED + " \u26DF");
        Thread.sleep(250);

        System.out.println(RED + "  \u26DF");
        Thread.sleep(250);

        System.out.println(RED + "   \u26DF");
        Thread.sleep(250);


        System.out.println(RED + "    \u26DF");
        Thread.sleep(250);

        System.out.println(RED + "     \u26DF");
        Thread.sleep(250);


        System.out.println(RED + "      \u26DF");
        Thread.sleep(250);
    }
}
