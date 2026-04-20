class TreeNode:
    def __init__(self, key=0, val=0, left=None, right=None):
        self.key = key
        self.val = val
        self.left = left
        self.right = right

class TreeMap:
    
    def __init__(self):
        self.root = None

    def insert(self, key: int, val: int) -> None:
        self.root = self.insertHelper(self.root, key, val)
        print(self.getInorderKeys())
    def insertHelper(self, root:TreeNode, key:int, val:int) -> TreeNode:
        if not root:
            return TreeNode(key, val)
        print(root.key)
        if root.key > key:
            root.left = self.insertHelper(root.left, key, val)
        elif root.key < key:
            root.right = self.insertHelper(root.right, key, val)
        else:
            root.val = val
        return root



    def get(self, key: int) -> int:
       node = self.searchNodeByKey(self.root, key)
       if node:
            return node.val
       else:
            return -1


    def searchNodeByKey(self, root: TreeNode, key:int) -> TreeNode:
        if not root:
            return None
        
        if root.key > key:
            return self.searchNodeByKey(root.right, key)
        elif root.key < key:
            return self.searchNodeByKey(root.left, key)
        else:
            return root



    def getMin(self) -> int:
        if not self.root:
            return -1
        return self.minHelper(self.root).val
        
    
    def minHelper(self, root:TreeNode) -> TreeNode:        
        if not root:
            return None
        while root and root.left:
            root = root.left
        return root



    def getMax(self) -> int:
        curr = self.root
        if not curr:
            return -1
        while curr and curr.right:
            curr = curr.right
        return curr.val


    def remove(self, key: int) -> None:
        self.root = self.removeHelper(self.root, key)

    def removeHelper(self, root:TreeNode, key:int) -> TreeNode:
        if not root:
            return None
        
        if root.key < key:
            root.right = self.removeHelper(self.root.right,key)
        elif root.key > key:
            root.left = self.removeHelper(self.root.left,key)
        else:
            if not root.left:
                return root.right
            elif not root.right:
                return root.left
            else:
                minNode = self.minHelper(root.right)
                root.key = minNode.key
                root.val = minNode.val
                root.right = self.removeHelper(root.right, minNode.key)
        return root

    def getInorderKeys(self) -> List[int]:
        res = []
        self.inorderTraversal(self.root, res)
        return res

    def inorderTraversal(self, root: TreeNode, res: List[int]):
        if not root:
            return
        # print(root)
        self.inorderTraversal(root.left, res)
        res.append(root.key)
        self.inorderTraversal(root.right, res)
        return


