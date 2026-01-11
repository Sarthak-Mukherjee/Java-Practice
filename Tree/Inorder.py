class Node:
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

    def inorder(self, root):
        if root is None:
            return
        self.inorder(root.left)
        print(root.data, end = ' ')
        self.inorder(root.right)


    def main(self):
        root = Node(1)
        root.left = Node(2)
        root.right = Node(3)

        self.inorder(root)

if __name__ == "__main__":
    obj = Node(0)
    obj.main()