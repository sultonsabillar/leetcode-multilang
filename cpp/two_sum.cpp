// Two Sum - https://leetcode.com/problems/two-sum/
// Diberikan array integer nums dan integer target, kembalikan indeks dua angka yang jika dijumlahkan hasilnya target.
#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> lookup;
    for (int i = 0; i < nums.size(); ++i) {
        int complement = target - nums[i];
        if (lookup.count(complement)) {
            return {lookup[complement], i};
        }
        lookup[nums[i]] = i;
    }
    return {};
}

int main() {
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> result = twoSum(nums, target);
    cout << "[" << result[0] << ", " << result[1] << "]" << endl;
    return 0;
} 