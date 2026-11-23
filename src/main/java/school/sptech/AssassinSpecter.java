package school.sptech;

public class AssassinSpecter extends SpecterIA {

    public AssassinSpecter(MemoriaDeCombate memoria) { super(memoria); }

    @Override
    public void executarTurno() {
        System.out.println("Assassin entra em stealth e explode o combo!");
    }
}