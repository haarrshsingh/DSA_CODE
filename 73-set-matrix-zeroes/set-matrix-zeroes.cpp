class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
     int m = matrix.size(), n = matrix[0].size();
    bool firstRowZero = false, firstColZero = false;

    // Step 1: Identify zeros in the first row and column
    for (int i = 0; i < m; i++) {
        if (matrix[i][0] == 0) firstColZero = true;
    }
    for (int j = 0; j < n; j++) {
        if (matrix[0][j] == 0) firstRowZero = true;
    }

    // Step 2: Use first row and column to mark zeros
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0; // Mark row
                matrix[0][j] = 0; // Mark column
            }
        }
    }

    // Step 3: Set matrix elements to zero based on markers
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // Step 4: Handle first row and column separately
    if (firstColZero) {
        for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }
    if (firstRowZero) {
        for (int j = 0; j < n; j++) matrix[0][j] = 0;
    }
}
};