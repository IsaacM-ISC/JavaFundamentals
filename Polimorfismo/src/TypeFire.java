public class TypeFire extends Pokemon{
    private String movement;
    @Override
    public void printPokemon()
    {
       System.out.println("Pokedex entry: "+this.pokedexEntry);
       System.out.println("Name: "+this.name);
       System.out.println("Movement "+movement);
    }

    public String getMovement() {
        return movement;
    }
    public void setMovement(String newMovement){
        this.movement = newMovement;
    }
}

