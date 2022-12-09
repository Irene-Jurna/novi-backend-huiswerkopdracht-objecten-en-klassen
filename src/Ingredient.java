package src;

public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    // Waarom moeten we de lege constructor aanmaken? (mag je niet werken met alleen een constructor met parameters?)
    public Ingredient() {}

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    // Waarom hebben we setters aangemaakt (zijn niet nodig?)
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }
}
