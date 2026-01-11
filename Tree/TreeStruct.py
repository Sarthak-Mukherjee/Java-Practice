class TREENODE:
    def __init__(self, data=0, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right
    
    def main():
        root = TREENODE(10)
        root.left = TREENODE(5)
        root.right = TREENODE(15)

        print(f"{root.data} -> {root.left.data} -> {root.right.data}")

if __name__ == "__main__":
    TREENODE.main()