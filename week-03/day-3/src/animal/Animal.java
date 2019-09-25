package animal;

public class Animal {
 // Every animal has a hunger value, which is a whole number,
 // Every animal has a thirst value, which is a whole number
 // when creating a new animal object these values are created with the default 50 value
  int hunger = 50;
  int thirst = 50;
         // Every animal can eat() which decreases their hunger by one
  public void eat(){
    this.hunger -=1; // --
  }      // Every animal can drink() which decreases their thirst by one
  public void drink(){
    this.thirst-= 1; // --
  }        // Every animal can play() which increases both by one
  public void  play (){
    this.hunger += 1; // ++
    this.thirst += 1; // ++
  }
  public Animal(){
  }
}
//  public Animal (int hunger, int thirst){
//    this.hunger = hunger;
//    this.thirst = thirst;
//  } ez most felesleges, mert default ertek = 50;
