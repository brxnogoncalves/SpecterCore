package school.sptech;

import java.util.List;

public class MemoriaDeCombate {

        private final List<String> historicoDeAcoes;   // ações já executadas
        private int turnosRegistrados;
        private int danoTotalRecebido;
        private int combosExecutados;
        private String ultimaAcao;
        private boolean desync;                         // flag de estado (ligada ao bug do enunciado)
        private static final int LIMITE_REPETICOES = 3;
    
}
