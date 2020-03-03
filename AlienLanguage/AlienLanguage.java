import java.util.*;

class AlienLanguage {

    public String getOrder(String[] input){

        /* Always do the null check */
        if (input == null || input.length == 0)
            return "";
        
        /* Create the Adjacency List */    
        HashMap<Character, List<Character>> graph = new HashMap<>();

        /* Create the in degrees HashMap */
        HashMap<Character, Integer> inDegree = new HashMap<>();

        /* Initialize the Adjacency List and in Degree Map */ 
        for (String word : input) {
            for (char character : word.toCharArray()) {
                /* Initialize inDegree with 0 for each character.*/      
                inDegree.put(character, 0);
                /* For each character, create an empty List */
                graph.put(character, new ArrayList<Character>());
            }
        }

        /* Populate the graph by taking the words pairwise */
        for(int i=0; i < input.length - 1; i++){
            String word1 = input[i];
            String word2 = input[i+1];
            for(int j=0; j < Math.min(word1.length(), word2.length()); j++){
                char parent = word1.charAt(j);
                char child = word2.charAt(j);
                if(parent!=child){
                    inDegree.put(child, inDegree.get(child)+1);
                    graph.get(parent).add(child);
                    break;
                }
            }
        }

        /* Find all sources i.e., all vertices with 0 in-degrees */ 
        Queue<Character> sourceNodes = new LinkedList<>();
        for (Map.Entry<Character, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0)
                sourceNodes.add(entry.getKey());
        }
        
        /* Initialize the sorted list of chars, i.e., the lexicographic order of the alien language */
        StringBuilder sortedOrder = new StringBuilder();
        
        /* For each source node, add it to the sortedOrder and subtract one from all of its children's in-degrees */
        while (!sourceNodes.isEmpty()) {
            Character vertex = sourceNodes.poll();
            sortedOrder.append(vertex);
            List<Character> children = graph.get(vertex); 
            /* get the node's children to decrement their in-degrees */
            for (Character child : children) {
                inDegree.put(child, inDegree.get(child) - 1);
                /* if the in-degree of a child becomes zero, add it to the sources queue */
                if (inDegree.get(child) == 0)
                    sourceNodes.add(child);
            }
        }

        /* When there's a cyclic dependency, the sorted Order will not contain all the characters. */        
        if (sortedOrder.length() != graph.size())
            return "";

        return sortedOrder.toString();        
    }
    
}