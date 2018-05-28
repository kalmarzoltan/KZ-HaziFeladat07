package hazi_7;

public class Jedi {

    private String name;
    private String szint;
    private int ero;
    private int wins;

    public Jedi(String name, String szint, int ero) throws InvalidJediException {
        JediValidator jediValidator = new JediValidator();
        if (jediValidator.validateJediData(name, szint, ero) == false) {
            System.out.println("A jedi nem jött létre");

        } else {
            this.name = name;
            this.szint = szint;
            this.ero = ero;
        }
    }

    public String getName() {
        return name;
    }

    public String getSzint() {
        return szint;
    }

    public int getEro() {
        return ero;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "Jedi{" +
                "name='" + name + '\'' +
                ", szint='" + szint + '\'' +
                ", ero=" + ero +
                ", wins=" + wins +
                '}';
    }



    public boolean jediEquals(Jedi j){
        if(this.name==j.getName() && this.szint==j.getSzint() && this.ero ==j.getEro()) {
            return true;
        }else{
            return false;
        }
    }
}
