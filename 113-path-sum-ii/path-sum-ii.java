/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res =  new ArrayList<>();
        List<Integer> Path = new ArrayList<>();
        findPath(root,Path,targetSum,res);
        return res;
    }
    public void findPath(TreeNode root,List<Integer> path,int targetSum,List<List<Integer>> res){
        if(root == null) return;

        path.add(root.val);
        targetSum -= root.val;

        if(root.left == null && root.right == null && targetSum == 0){
            res.add(new ArrayList<>(path));
        }

        findPath(root.left,path,targetSum,res);
        findPath(root.right,path,targetSum,res);


        path.remove(path.size() - 1);
    }
}