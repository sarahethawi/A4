import java.util.ArrayList;
import java.util.ArrayList;
/********************************************************************
 * Programmer:  Sarah Ethawi
 * Class:       CS30S
 *
 * Assignment:  A4.0
 *
 * Description: Jar Class
 ***********************************************************************/
class Jar {
    // Instance Variables
    private String name;
    
    // association field
    private ArrayList<Cookie> cookies;
    
    
    // Constructor
    public Jar() {
        name = "Unknown";
        cookies = new ArrayList<>();
    }// end Jar (no-arg)

    public Jar(String name) {
        this.name = name;
        cookies = new ArrayList<>();
    }// end Jar (full-arg)

    
    // Getters
    public String getName() {
        return name;
    }// end getName

    public ArrayList<Cookie> getCookies() {
        return cookies;
    }// end getCookies
    
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }// end setName
    

    // Method to add cookie to jar
    public void addCookie(Cookie c) {
        cookies.add(c);
    }// end addCookie

    // toString() method
    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("Jar: ").append(name).append("\nCookies:\n");
        for (Cookie cookie : cookies) {
            st.append(cookie.toString()).append("\n");
        }// end for
        return st.toString();
    }// end toString()
}// end Jar