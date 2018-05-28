package hazi_7;

import java.util.ArrayList;
import java.util.List;

class JediProba {
    public static void main(String[] args) {
        int argCount = args.length;
        System.out.println("The number of arguments given: " + argCount);
        List<Jedi> jediList = new ArrayList<>();

        try {
            Jedi jedi1 = new Jedi(args[0], args[1], Integer.parseInt(args[2]));
            if (jedi1 != null) {
                jediList.add(jedi1);
            }

            Jedi jedi2 = new Jedi(args[3], args[4], Integer.parseInt(args[5]));
            if (jedi2 != null) {
                jediList.add(jedi2);
            }

        } catch (InvalidJediException ex) {
            System.out.println("JediException!");
           System.out.println(ex.getMessage());
        }
//        try {
//            validateJedi(jedi1);
//            validateJedi(jedi2);
//
//        } catch (InvalidJediException ex) {
//            System.out.println("JediException!");
//            System.out.println(ex.getMessage());
//            //nem szabad ilyet:ex.printStackTrace();
//        }
        System.out.println("A jedilista mérete: " + jediList.size());

        System.out.println("------------------------------------------------");

        try {
            fight(jediList.get(0), jediList.get(1));
            fight(jediList.get(0), jediList.get(1));
            fight(jediList.get(0), jediList.get(1));
            fight(jediList.get(0), jediList.get(1));
            fight(jediList.get(0), jediList.get(1));
            System.out.println("------------------------------------------------");
            if (jediList.get(0).getWins() > jediList.get(1).getWins()) {
                System.out.println("A jeditorna győztese: " + jediList.get(0).toString());
            } else {
                System.out.println("A jeditorna győztese: " + jediList.get(1).toString());
            }


        } catch (JediFightException ex1) {
            System.out.println("JediFightException!");
            System.out.println(ex1.getMessage());

        }


    }

    public static Jedi fight(Jedi j1, Jedi j2) throws JediFightException {
        if (!(j1.getSzint().equals(j2.getSzint()))) {
            throw new JediFightException("FightException van! Nem egyezik a szint");
        }

        if (j1.jediEquals(j2)==true) {
            throw new JediFightException("FightException van! Ugyanaz a két Jedi..");
        }

        if (Math.abs(j1.getEro() - j2.getEro()) > 30) {
            throw new JediFightException("FightException van! Több mint 30 az erő különbség");
        }


        int random = (int) (Math.random() * (j1.getEro() + j2.getEro())) + 1;


        if (1 < random && random < j1.getEro()) {
            System.out.println("The winner jedi is: " + j1.getName());
            j1.setWins(j1.getWins() + 1);
            System.out.println("Győzelmek száma: " + j1.getWins());
            return j1;
        } else if (((j1.getEro() + 1) < random) && (random < (j1.getEro() + j2.getEro()))) {
            System.out.println("The winner jedi is: " + j2.getName());
            j2.setWins(j2.getWins() + 1);
            System.out.println("Győzelmek száma: " + j2.getWins());

        }
        return j2;

    }
}



