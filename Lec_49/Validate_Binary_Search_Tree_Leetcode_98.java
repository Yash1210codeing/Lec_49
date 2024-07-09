package Lec_49;
import Lec_49.Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal_Leetcode_105.TreeNode;
public class Validate_Binary_Search_Tree_Leetcode_98 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){			
		}
		TreeNode(int val){
			this.val=val;
		}
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}
	class solution{
//		public boolean isvalidBST(TreeNode root) {
//			return validbst(root).isbst;
//		}
		public BstPair validbst(TreeNode root) {
			if(root==null) {
				return new BstPair();
			}
			BstPair lbstp=validbst(root.left);
			BstPair rbstp=validbst(root.right);
			BstPair sbstp=new BstPair();
			sbstp.min=Math.min(root.val,Math.min(lbstp.min,rbstp.min));
			sbstp.max=Math.min(root.val,Math.max(lbstp.max,rbstp.max));
			sbstp.isbst=lbstp.isbst&&rbstp.isbst&&root.val>lbstp.max&&root;
			if(sbstp.isbst) {
				sbstp.size=lpstp.size+rbstp.size+1;
			}else {
				sbstp.size=lpstp.size+rbstp.size+1;
			}
			//boolean f=lbstp.isbst&&rbstp.isbst&&root.val>lbstp.max&&root.val<rbstp.min;
			return sbstp;
		}
	}
	class BstPair{	
		boolean isbst=true;
	}
	class BSTPair{
		boolean isbst;
		long min=Long.MAX_VALUE;
		long max=Long.MIN_VALUE;
		int size=0;
	}
}
