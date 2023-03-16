import java.util.ArrayList;
public class Cabaret {

    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer performer) {
        if(performers.indexOf(performer) == -1) {
            performers.add(performer);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer performer) {
        if(performers.indexOf(performer) != -1) {
            performers.remove(performers.indexOf(performer));
            return true;
        }
        return false;
    }

    public double averagePerformerAge() {
        double average = 0;
        for(Performer a : performers) {
            average += a.getAge();
        }
        average /= performers.size();
        return average;
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> overAge = new ArrayList<Performer>();
        for(Performer i : performers) {
            if(i.getAge() >= age) {
                overAge.add(i);
            }
        }
        return overAge;
    }

    public void groupRehearsal() {
        for(Performer a : performers) {
            System.out.println("REHEARSE CALL! " + a.getName());
            if (a instanceof Dancer) {
                ((Dancer) a).rehearse();
            } else {
                a.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for(Performer a : performers) {
            System.out.println("Welcome to the cabaret! Next act up...  " + a.getName());
            if(a instanceof Dancer) {
                ((Dancer) a).perform();
            } else {
                a.perform();
            }
        }
    }
}
