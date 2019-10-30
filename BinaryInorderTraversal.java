class BinaryInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode p = root;
       
        while(p != null){
            s.push(p);
            p = p.left;
        }
        while(!s.isEmpty()){
            TreeNode t = s.pop();
            result.add(t.val);
            t = t.right;
                while(t != null){
                    s.push(t);
                    t = t.left;
                }
        }
        return result;
    }
}