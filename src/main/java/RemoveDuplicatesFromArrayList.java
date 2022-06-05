import java.util.*;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,2,3,5);

        System.out.println(numbers);

        Set<Integer> hashSet = new LinkedHashSet(numbers);
        ArrayList<Integer> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);

        List<String> letras = Arrays.asList("1","2","2","2","3","5");
        Set<String> valor =  findDuplicates(letras);
        System.out.println("vloar "+valor.toString());

    }

    public static Set<String> findDuplicates(List<String> listContainingDuplicates) {

        final Set<String> setToReturn = new HashSet<String>();
        final Set<String> set1 = new HashSet<String>();

        for (String yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        return setToReturn;
    }
}