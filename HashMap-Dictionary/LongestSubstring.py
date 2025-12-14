class TwoSum:
    def longest_consecutive(self, nums):
        numSet = set(nums)
        longestStreak = 0

        for num in numSet:
            if (num-1) not in numSet:
                current_num = num
                current_streak = 1

                while (current_num+1) in numSet:
                    current_num += 1
                    current_streak += 1

                longestStreak = max(longestStreak, current_streak)
        return longestStreak
    
if __name__ == "__main__":
    nums = [100, 4, 200, 1, 3, 2]
    result = TwoSum()
    output = result.longest_consecutive(nums)
    print(output)