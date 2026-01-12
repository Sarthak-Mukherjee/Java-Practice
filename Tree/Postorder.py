class Node:
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

    def postorder(self, root):
        if root is None:
            return
        self.postorder(root.left)
        self.postorder(root.right)
        print(root.data, end = ' ')
        


    def main(self):
        root = Node(1)
        root.left = Node(2)
        root.right = Node(3)

        self.postorder(root)

if __name__ == "__main__":
    obj = Node(0)
    obj.main()