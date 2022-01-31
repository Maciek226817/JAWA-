package Z1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordsInTreeSetDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ada","Kolsko",20));
        list.add(new Person("Pola","Sotko",10));
        list.add(new Person("Tola","Clotek",40));
        list.add(new Person("Kasia","Motoo",15));

        Collections.sort(list);

        System.out.println(list);



    }

}