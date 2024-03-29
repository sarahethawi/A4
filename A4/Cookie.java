
import java.util.ArrayList;
/********************************************************************
 * Programmer:  Sarah Ethawi
 * Class:       CS30S
 *
 * Assignment:  A4.0
 *
 * Description: Cookie class
 ***********************************************************************/
class Cookie {
  // Class Variables
  private static int nextID = 100;

  // Instance Variables
  private int ID;
  private String flavour;
  private Jar jar;
  private ArrayList<Cookie> cookies;
  private String name;

  // Constructor
  public Cookie() {
      name = "Unknown";
      ID = getNextID();
  }// end Cookie (no-arg)
  
    public Cookie(String name) {
      this.name = name;
      ID = getNextID();
  } // end Cookie (full-arg)

  
  // Getters
  public Jar getJar() {
      return jar;
  }// end getJar

  public int getID() {
      return this.ID;
  }// end getID

  public String getFlavour() {
      return flavour;
  }// end getFlavour

  
  // Setters
  public void setFlavour(String flavour) {
      this.flavour = flavour;
  }// end setFlavour

  public void setJar(Jar jar) {
      this.jar = jar;
  }// end setJar
  
  
  // toString() method
  @Override
  public String toString() {
      return ID + ": " + name;
  }// end toString
  
  private int getNextID() {
      return nextID++;
  }// end getNextID
}// end Cookie 