class TWOSUM:
    def two_sum(self, nums, target):
        complement_dict = {}

        for i, currentNum in enumerate(nums): # idiomatic line
            
            complement = target - currentNum

            if complement in complement_dict:
                return [complement_dict[complement],i]
            
            complement_dict[currentNum] = i
        return []
if __name__ == "__main__":    
    nums = [2, 7, 11, 15]
    target = 9
    twosum = TWOSUM()
    result = twosum.two_sum(nums, target)
    print(result)