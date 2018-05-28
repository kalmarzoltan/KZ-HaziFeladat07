package hazi_7;

import java.util.ArrayList;
import java.util.List;

public class JediValidator {

    List<String> jediDataList = new ArrayList<>();

    public boolean validateJediData(String name, String szint, int ero) throws InvalidJediException {


        if (name.length() < 5
                || name.length() > 30
                || (!szint.equals("master") && !szint.equals("padavan"))
                || (name.equals(null)
                || (szint.equals(null)
                || (ero < 1)
                || (ero > 100)
        ))) {

            throw new hazi_7.InvalidJediException("Jediparameter problem");

        } else {
            jediDataList.add(name);
            System.out.println("Name: "+name);
            jediDataList.add(szint);
            System.out.println("Szint: "+szint);
            jediDataList.add(Integer.toString(ero));
            System.out.println("Erő: "+Integer.toString(ero));
            System.out.println("A jedi létrejöhet");
            return true;

        }


    }


}
