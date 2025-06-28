# Two Sum - https://leetcode.com/problems/two-sum/
# Diberikan array integer nums dan integer target, kembalikan indeks dua angka yang jika dijumlahkan hasilnya target.

def two_sum(nums, target):
    lookup = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in lookup:
            return [lookup[complement], i]
        lookup[num] = i
    return []

# Contoh penggunaan:
if __name__ == "__main__":
    result = two_sum([2, 7, 11, 15], 9)
    print(result)  # Output: [0, 1] 