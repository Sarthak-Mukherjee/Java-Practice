class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

    def preorder_traversal(self, root):
        if root is None:
            return
        print(root.data, end =" ")
        self.preorder_traversal(root.left)
        self.preorder_traversal(root.right)

    def main(self):
        root = Node(1)
        root.left = Node(2)
        root.right = Node(3)

        self.preorder_traversal(root)

if __name__ == "__main__":
    obj = Node(0)
    obj.main()
