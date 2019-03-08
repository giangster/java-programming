public class ObjectPizzaProgram {
    public static void main(String[] args) {
        Pizza diavolo = new Pizza("Diavolo", 8.75);
        Pizza fruttiAlMare = new Pizza("Frutti al Mare", 9.00);
        Pizza allaPollo = new Pizza("Alla Pollo", 7.50);

        System.out.println(diavolo.toString());
        System.out.println(fruttiAlMare.toString());
        System.out.println(allaPollo.toString());

    }
}
