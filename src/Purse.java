
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Purse {

    private Map<Denomination, Integer> cash; // map for holding values of Cash, connected to their official record denomination. Keys are a tool within a Map that allows for retrieval of values.

    // adds a number of a particular denomination
    public void add(Denomination value, int quantity) {
        cash.put(value, cash.getOrDefault(value,0) + quantity); // places Denomination value label and number of that bill/coin into the map above. Used getOrDefault as it handles case where a denomination hasn't been entered into the map.
    }
    public Purse() {
        cash = new HashMap<Denomination, Integer>();
    }
    public Map<Denomination, Integer> getCash(){ // wanted to add this class as it provides data security and keeps me from needing to use a public and insecure hashmap. THhis will be used
        return cash;
    }

    //diminishes the money in the purse and returns that amount.
    public double remove(Denomination value, int quantity) {

        if(cash.containsKey(value) && cash.get(value) >= quantity) {//////////////////
            cash.put(value, cash.get(value) - quantity); // places value into the map, and subtracts quantity of bills or coins
            double totalRemoved = value.amt() * quantity;

            return totalRemoved;
        } else {
            return 0.0;
        }
    }

    public String toString() {

        String text = "";
        Iterator<Map.Entry<Denomination, Integer>> iterator = cash.entrySet().iterator(); // Uses an iterator which will be used to navigate through the Map.

        while (iterator.hasNext()) {
            Map.Entry<Denomination, Integer> entry = iterator.next(); // retrieves next entry
            text = text + entry.getKey().name() + ":" + entry.getValue() + "\n"; // Within the map, the key is the denomination and the count is the quantity of bills. For string output, this line combines the two.

        }
        //text = text + "Total: " + getValue(); //getValue returns the total value of all denominations within the purse object
        return text;
    }

    public double getValue() {
        double total = 0.0;
        Iterator<Map.Entry<Denomination, Integer>> iterator = cash.entrySet().iterator(); //creation of iterator to move through map. MUST USE Map.Entry rather than Map. I have to iterate over the entries, not the map itself.

        while (iterator.hasNext()) {
            Map.Entry<Denomination, Integer> entry = iterator.next();
            total = total + entry.getKey().amt() * entry.getValue();
        }
        return total;
    }
}
