package fr.mutation.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Exercice {

    public Map<Integer, String> f1(int limit, List<Integer> integerList) {
        HashMap<Integer, String> result = new HashMap<Integer, String>();
        String resultString = integerList.stream()
        	.limit(limit)
        	.filter(n -> (n >= 0 && n < 21))
        	.map(Object::toString)
        	.reduce("", (string, element) -> string + element + " ");
        int outOfBoundaryCount = (int) integerList.stream()
        	.limit(limit)
        	.filter(n -> !(n >= 0 && n <21))
        	.count();
        	
        resultString += "\n";
        result.put(outOfBoundaryCount, resultString);
        return result;
    }
}
