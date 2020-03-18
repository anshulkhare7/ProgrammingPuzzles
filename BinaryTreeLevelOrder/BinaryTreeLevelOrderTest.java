import java.util.*;

class BinaryTreeLevelOrderTest {

    private BinaryTreeLevelOrder binaryTreeLevelOrder;

    BinaryTreeLevelOrderTest(){
        binaryTreeLevelOrder = new BinaryTreeLevelOrder();
    }

    public static void main(String[] args) {

        BinaryTreeLevelOrderTest btot = new BinaryTreeLevelOrderTest();
        
        btot.testGetLevel();
        btot.testGetLevelReverse();
        btot.testGetLevelZigzag();        
        btot.testGetLevelMax();
        btot.testGetLevelAverages();                        
        btot.testGetMinimumDepth();
        btot.testGetLevelOrderSuccessor();
    }

    void testGetLevel(){
        TreeNode root = new TreeNode(13);
        
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(6);
        
        List<List<Integer>> expected =  new ArrayList<>();
        expected.add(new ArrayList<Integer>(Arrays.asList(13)));
        expected.add(new ArrayList<Integer>(Arrays.asList(8,2)));
        expected.add(new ArrayList<Integer>(Arrays.asList(10,11,6)));

        List<List<Integer>> result =  this.binaryTreeLevelOrder.getLevel(root);        

        if(result.equals(expected))
            System.out.println("Test Case testGetLevel Passed.");                
        else
            System.out.println("Test Case testGetLevel Failed. Expected: "+expected.toString()+" Actual: "+result.toString());
    }

    void testGetLevelReverse(){
        TreeNode root = new TreeNode(13);
        
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(6);
        
        List<List<Integer>> expected =  new ArrayList<>();
        expected.add(new ArrayList<Integer>(Arrays.asList(13)));
        expected.add(new ArrayList<Integer>(Arrays.asList(2,8)));
        expected.add(new ArrayList<Integer>(Arrays.asList(6,11,10)));

        List<List<Integer>> result =  this.binaryTreeLevelOrder.getLevelReverse(root);
        
        if(result.equals(expected))
            System.out.println("Test Case testGetLevelReverse Passed.");
        else
            System.out.println("Test Case testGetLevelReverse Failed. Expected: "+expected.toString()+" Actual: "+result.toString());                            
    }

    void testGetLevelZigzag(){
        TreeNode root = new TreeNode(13);
        
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(6);
        
        List<List<Integer>> expected =  new ArrayList<>();
        expected.add(new ArrayList<Integer>(Arrays.asList(13)));
        expected.add(new ArrayList<Integer>(Arrays.asList(2,8)));
        expected.add(new ArrayList<Integer>(Arrays.asList(10,11,6)));

        List<List<Integer>> result =  this.binaryTreeLevelOrder.getLevelZigzag(root);        

        if(result.equals(expected))
            System.out.println("Test Case testGetLevelZigzag Passed.");
        else
            System.out.println("Test Case testGetLevelZigzag Failed. Expected: "+expected.toString()+" Actual: "+result.toString());                
    }

    void testGetLevelMax(){
        TreeNode root = new TreeNode(13);
        
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(21);
        root.right.left.right = new TreeNode(18);
        
        List<Integer> expected =  new ArrayList<>(Arrays.asList(13,8,11,21));

        List<Integer> result =  this.binaryTreeLevelOrder.getLevelMax(root);

        if(result.equals(expected))
            System.out.println("Test Case testGetLevelMax Passed.");
        else
            System.out.println("Test Case testGetLevelMax Failed. Expected: "+expected.toString()+" Actual: "+result.toString());                
    }        
    
    void testGetLevelAverages(){
        TreeNode root = new TreeNode(13);
        
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(6);        
        
        List<Double> expected =  new ArrayList<>(Arrays.asList(13.0,5.0,9.0));

        List<Double> result =  this.binaryTreeLevelOrder.getLevelAverages(root);

        if(result.equals(expected))
            System.out.println("Test Case testGetLevelAverages Passed.");
        else
            System.out.println("Test Case testGetLevelAverages Failed. Expected: "+expected.toString()+" Actual: "+result.toString());                
         
    }

    void testGetMinimumDepth(){
        TreeNode root = new TreeNode(13);
        
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(21);
        root.right.left.right = new TreeNode(18);
        
        Integer expected =  3;

        Integer result =  this.binaryTreeLevelOrder.getMinimumDepth(root);

        if(result.equals(expected))
            System.out.println("Test Case testGetMinimumDepth Passed.");
        else
            System.out.println("Test Case testGetMinimumDepth Failed. Expected: "+expected.toString()+" Actual: "+result.toString());  
                        
    }

    void testGetLevelOrderSuccessor(){
        TreeNode root = new TreeNode(13);
        
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(21);
        root.right.left.right = new TreeNode(18);        

        int expected =  21;
        TreeNode result =  this.binaryTreeLevelOrder.getLevelOrderSuccessor(root, 6);

        if(result.val==expected)
            System.out.println("Test Case testGetLevelOrderSuccessor Passed.");
        else
            System.out.println("Test Case testGetLevelOrderSuccessor Failed. Expected: "+expected+" Actual: "+result);  

    }
}