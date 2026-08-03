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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        
        findPath(root,"",res);
        return res;
    }

    public void findPath(TreeNode root,String path,List<String> res){
        if(root == null)  return;

        if(path.isEmpty()){
            path = String.valueOf(root.val);
        }else{
            path = path+"->"+String.valueOf(root.val);
        }

        if(root.left == null && root.right == null){
            res.add(path);
            return;
        }
        findPath(root.left,path,res);
        findPath(root.right,path,res);

    }
}