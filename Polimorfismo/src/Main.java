public class Main {
    public static void main(String[] args) {
        Pokemon newPokemon = new Pokemon();
        newPokemon.setName("Bulbasaur");
        newPokemon.setPokedexEntry(1);
        newPokemon.printPokemon();

        System.out.println();

        TypeFire newTypeFire = new TypeFire();
        newTypeFire.setName("Charmander");
        newTypeFire.setPokedexEntry(4);
        newTypeFire.setMovement("Ember");
        newTypeFire.printPokemon();
    }
}