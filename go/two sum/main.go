package main

import "fmt"

func twoSumBruteForce(nums []int, target int) []int {
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i]+nums[j] == target {
				return []int{i, j}
			}
		}
	}
	return nil
}

func twosumHashmap(nums []int, target int) []int {
	seen := make(map[int]int) // map[number] = index

	for i, num := range nums {
		complement := target - num
		if idx, found := seen[complement]; found {
			return []int{idx, i}
		}
		seen[num] = i
	}
	return nil
}

func main() {
	nums := []int{2, 7, 11, 15}
	target := 9

	fmt.Println("Brute Force", twoSumBruteForce(nums, target))
	fmt.Println("Hashmap", twosumHashmap(nums, target))
}
