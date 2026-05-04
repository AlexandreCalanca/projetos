package entities;

public class Bill {
    private Character gender;
    private Integer quantBeer;
    private Integer quantSoftDrink;
    private Integer quantBarbecue;

    public Bill(Character gender, Integer quantBeer, Integer quantSoftDrink, Integer quantBarbecue) {
        this.gender = gender;
        this.quantBeer = quantBeer;
        this.quantSoftDrink = quantSoftDrink;
        this.quantBarbecue = quantBarbecue;
    }

    public double consumption() {
        return (quantBeer * 5) + (quantSoftDrink * 3) + (quantBarbecue * 7);
    }

    public double couver() {
        if (consumption() > 30) {
            return 0.0;
        } else {
            return 4.0;
        }
    }

    public double ticket() {
        if (gender == 'F') {
            return 8.0;
        } else {
            return 10.0;
        }
    }

    public double total() {
        return consumption() + couver() + ticket();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nRELATÓRIO:\n");
        sb.append(String.format("Consumo = R$ %.2f%n", consumption()));

        if (couver() == 0.0) {
            sb.append("Couvert = Isento\n");
        } else {
            sb.append(String.format("Couvert = R$ %.2f%n", couver()));
        }

        sb.append(String.format("Ingresso = R$ %.2f%n", ticket()));
        sb.append(String.format("Valor a pagar = R$ %.2f%n", total()));

        return sb.toString();
    }
}
