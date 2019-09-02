public class Name {
    String first;
    String last;
    
    public Name() {
        this.first = "Alex";
        this.last = "Solzman";
    }
    
    public String getFullName() {
        String fullName = this.first + " " + this.last;
        return fullName;
    }
}