public class Main {
    public static void main(String[] args) {
        // Ввод цены билета в строку 4
        int ticketprice = 10523;
        int bonusstep = 20;

        int miles = ticketprice / bonusstep;
        System.out.println(miles);
    }
}