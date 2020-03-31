package pl.accenture.szkolka.mapsTasks;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> LiczbyPierwsze = List.of(5, 7, 13, 17);
        List<Integer> liczbyParzyste = List.of(2, 4, 6, 8);
        List<Integer> liczbyNieparzyste = List.of(3, 5, 7, 9);

        List<List<Integer>> listaDoSpłaszczenia = List.of(
                LiczbyPierwsze,
                liczbyParzyste,
                liczbyNieparzyste);
        System.out.println(listaDoSpłaszczenia);

        var posortowanaSplaszczonaLista = listaDoSpłaszczenia
                .stream()
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(posortowanaSplaszczonaLista);
    }
}
