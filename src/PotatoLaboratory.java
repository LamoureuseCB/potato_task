import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
        System.out.println("\nОтсортированный список суммы альфа характеристик :");
        for (Potato potato : fourUnderExperiment) {
            System.out.println("Id " + potato.id + " - " + potato.findTotalAlphas());
        }
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        List<Potato> potatoList = new ArrayList<>(potatoes);
        List<Potato> fourUnderExperiment = new ArrayList<>();

        Potato potato1Min = Collections.min(potatoList);
        fourUnderExperiment.add(potato1Min);
        potatoList.remove(potato1Min);
        Potato potato2Min = Collections.min(potatoList);
        fourUnderExperiment.add(potato2Min);
        potatoList.remove(potato2Min);
        Potato potato1Max = Collections.max(potatoList);
        fourUnderExperiment.add(potato1Max);
        potatoList.remove(potato1Max);
        Potato potato2Max = Collections.max(potatoList);
        fourUnderExperiment.add(potato2Max);
        potatoList.remove(potato2Max);

        return fourUnderExperiment;
    }
}