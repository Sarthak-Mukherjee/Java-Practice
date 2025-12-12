class CountFrequency:
    def count_freq(self, arr):
        frequency = {}
    
        for strings in arr:
            if strings in frequency:
                frequency[strings] += 1
            else:
                frequency[strings] = 1
    
        return frequency
    
if __name__ == "__main__":
    input = ["apple", "orange", "banana", "banana", "apple", "grapes"]
    freq = CountFrequency()
    print(f"Frequency counts: {freq.count_freq(input)}")

    

