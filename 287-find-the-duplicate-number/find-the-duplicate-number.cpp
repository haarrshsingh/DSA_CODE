class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_map<int, int> freq;
        
        for(int num : nums) {  
            freq[num]++;
        }
    
        for(auto& pair : freq) {
            if(pair.second > 1) {
                return pair.first;  
            }
        }

        return -1; 
    }
};