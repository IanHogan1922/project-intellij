public class Main
{
    public static void main(String[] args)
    {
        printHeader();
        printMessage("Hello World!");

        printHeader();
        printMessage("By: Ian S.");
    }

    private static void printMessage(String message)
    {
        System.out.println(message);
    }

    private static void printHeader()
    {
        System.out.println("******************************");
    }
}
