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
    public void leaf(ArrayList<Integer> arr, TreeNode root){
        if( root != null && root.left == null && root.right == null){
            arr.add(root.val);
            return;
        }
        if(root !=null ){
            leaf(arr,root.left);
            leaf(arr,root.right);
        }
        else{
            return;
        }
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        
            leaf(arr,root1);
            leaf(arr1,root2);
            if(arr.equals(arr1)){
                return true;
            }
            else{
                return false;
            }
       
    }
}
