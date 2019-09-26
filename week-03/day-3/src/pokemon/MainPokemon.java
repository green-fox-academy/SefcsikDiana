package pokemon;

import java.util.ArrayList;
    import java.util.List;

public class MainPokemon {
  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = initializePokemons();

    /*
     Every pokemon has a name and a type.
     Certain types are effective against others, e.g. water is effective against fire.
     Ash has a few pokemon.
     A wild pokemon appeared!
    */

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

    Pokemon wildPokemon2 = new Pokemon("Poliwag", "water", "leaf");

    // Which pokemon should Ash use?
    String nameOfThePokemon = "";
    for (int i = 0; i < pokemonOfAsh.size(); i++) {
      if (pokemonOfAsh.get(i).effectiveAgainst.equals(wildPokemon2.type)){
         nameOfThePokemon = pokemonOfAsh.get(i).name;
      }
    }
    System.out.print("I choose you, " + nameOfThePokemon + "!");
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Bulbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikachu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Bulbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }
}