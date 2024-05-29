import java.util.Objects;

public class Potato implements Comparable<Potato> {

    public final int id;
    public final int weight;
    public final int length;
    public final int girth;

    public Potato(int id, int weight, int length, int girth) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.girth = girth;
    }
    public int findTotalAlphas(){
        int total = weight * 50/100 + length * 65/100 + girth * 80/100;
        return total;
    }

    @Override
    public int compareTo(Potato o) {
        int alphasThis = this.findTotalAlphas();
        int alphasO = o.findTotalAlphas();
        return Integer.compare(alphasThis, alphasO);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potato potato = (Potato) o;
        return id == potato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\n Potato{" +
                "id=" + id +
                ", weight=" + weight +
                ", length=" + length +
                ", girth=" + girth +
                "}";
    }
}