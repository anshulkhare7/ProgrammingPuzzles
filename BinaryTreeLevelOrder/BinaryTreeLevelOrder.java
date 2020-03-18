import java.util.*;

class BinaryTreeLevelOrder {

    public List<Double> getLevelAverages(TreeNode root){
        List<Double> result = new ArrayList<>();
        if(root==null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverseFlag = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();            
            double sum = 0.0;
            for(int i=0; i <levelSize; i++){
                
                TreeNode thisNode = queue.poll();

                sum = sum + (double)thisNode.val;
                                
                if(thisNode.left!=null)
                    queue.offer(thisNode.left);
                if(thisNode.right!=null)
                    queue.offer(thisNode.right);                
                
            }            
            double average = sum / levelSize;
            result.add(average);            
        }

        return result;
    }

    public List<Integer> getLevelMax(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverseFlag = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();            
            int max = 0;
            for(int i=0; i <levelSize; i++){
                
                TreeNode thisNode = queue.poll();

                max = Math.max(max, thisNode.val);
                                
                if(thisNode.left!=null)
                    queue.offer(thisNode.left);
                if(thisNode.right!=null)
                    queue.offer(thisNode.right);                
                
            }            
            result.add(max);            
        }

        return result;
    }

    public List<List<Integer>> getLevel(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();            
            List<Integer> thisLevel = new ArrayList<>(levelSize);
            for(int i=0; i <levelSize; i++){
                
                TreeNode thisNode = queue.poll();
                thisLevel.add(thisNode.val);

                if(thisNode.left!=null)
                    queue.offer(thisNode.left);
                if(thisNode.right!=null)
                    queue.offer(thisNode.right);

            }
            result.add(thisLevel);
        }

        return result;
    }

    public List<List<Integer>> getLevelReverse(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();            
            List<Integer> thisLevel = new ArrayList<>(levelSize);
            for(int i=0; i <levelSize; i++){
                
                TreeNode thisNode = queue.poll();
                thisLevel.add(thisNode.val);

                if(thisNode.right!=null)
                    queue.offer(thisNode.right);
                if(thisNode.left!=null)
                    queue.offer(thisNode.left);

            }
            result.add(thisLevel);
        }

        return result;
    }        

    public List<List<Integer>> getLevelZigzag(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverseFlag = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();            
            List<Integer> thisLevel = new ArrayList<>(levelSize);
            for(int i=0; i <levelSize; i++){
                
                TreeNode thisNode = queue.poll();

                if(reverseFlag)
                    thisLevel.add(thisNode.val);
                else
                    thisLevel.add(0,thisNode.val);
                    
                                
                if(thisNode.left!=null)
                    queue.offer(thisNode.left);
                if(thisNode.right!=null)
                    queue.offer(thisNode.right);                
                
            }            
            result.add(thisLevel);
            reverseFlag = !reverseFlag;
        }

        return result;
    }          

    public Integer getMinimumDepth(TreeNode root){
        Integer result = 0;
        if(root==null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverseFlag = true;
        while(!queue.isEmpty()){
            result++;
            int levelSize = queue.size();                        
            for(int i=0; i <levelSize; i++){
                
                TreeNode thisNode = queue.poll();
                                
                if(thisNode.left==null && thisNode.right==null)
                    return result;
                    
                if(thisNode.left!=null)
                    queue.offer(thisNode.left);
                if(thisNode.right!=null)
                    queue.offer(thisNode.right);
                
            }                        
        }

        return result;
    }

    public TreeNode getLevelOrderSuccessor(TreeNode root, int node){
        Integer result = 0;
        if(root==null)
            return new TreeNode(0);
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.left!=null)
                queue.offer(currentNode.left);
            if(currentNode.right!=null)
                queue.offer(currentNode.right);
            
            if(currentNode.val==node)
                break;
        }    
        return queue.peek();
    }
}