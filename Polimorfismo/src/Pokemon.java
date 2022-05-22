public class Pokemon
{
    protected int pokedexEntry;
    protected String name;

    public void printPokemon()
    {
        System.out.println("Pokedex entry: "+pokedexEntry);
        System.out.println("Name: "+name);
    }

    public int getPokedexEntry()
    {
        return pokedexEntry;
    }
    public void setPokedexEntry(int newEntry)
    {
        this.pokedexEntry = newEntry;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
}