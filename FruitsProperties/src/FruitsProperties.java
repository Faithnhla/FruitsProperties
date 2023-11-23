//Program that shows a collection of 3 fruits and their properties and output fruit names and their properties.

public class FruitsProperties {
    private final String name;
    private final String weight;
    private final String property1;
    private final String property2;

    public FruitsProperties(String name, String weight, String property1, String property2) {
        this.name = name;
        this.weight = weight;
        this.property1 = property1;
        this.property2 = property2;
    }

    public void displayProperties() {
        System.out.println(name + " Properties:");
        System.out.println("  Weight: " + weight);
        System.out.println("  Property 1: " + property1);
        System.out.println("  Property 2: " + property2);
        System.out.println();
    }

    public static void main(String[] args) {
        // Define three fruits with their properties
        FruitsProperties banana = new FruitsProperties("Banana", "150g", "Length", "7 inches");
        FruitsProperties pineapple = new FruitsProperties("Pineapple", "1000g", "Level of Acidity", "High");
        FruitsProperties apple = new FruitsProperties("Apple", "100g", "Number of Seeds: 2", "Type: Red");

        // Display properties of each fruit
        FruitsProperties[] fruitsArray = {banana, pineapple, apple};
        for (FruitsProperties fruit : fruitsArray) {
            fruit.displayProperties();
        }
    }
}






