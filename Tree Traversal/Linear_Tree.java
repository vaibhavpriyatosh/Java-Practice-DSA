import java.util.*;
class Linear_Trree{

	public static TreeNode LinearTraversal(TreeNode root){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> levelNodeMap = new HashMap<>();
        Queue<Integer> levels = new LinkedList<Integer>();

        queue.offer(root);
        levels.offer(0);
        Integer minLevel=0;
        Integer maxLevel=0;

        while(!queue.isEmpty()){
            Node node = queue.poll();
            Integer level = levels.poll();
            minLevel = Math.min(level, minLevel);
            maxLevel = Math.max(maxLevel, level);

            if(!levelNodeMap.containsKey(level)){
                levelNodeMap.put(level, new ArrayList<Integer>());
            }
            levelNodeMap.get(level).add(node.data);
            if(node.left != null) {
                queue.offer(node.left);
                levels.offer(level - 1);
            }
            if(node.right != null) {
                queue.offer(node.right);
                levels.offer(level + 1);
            }
        }

        for(int level = minLevel; level <= maxLevel; ++level){
            if(levelNodeMap.containsKey(level)){
                ArrayList<Integer> nodes = levelNodeMap.get(level);
                result.addAll(nodes);
            }
        }

        return result;
		

	}
}