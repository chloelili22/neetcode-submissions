class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # (0 / 3) * 3 + (0 / 3) = 0
        # (0 / 3) * 3 + (4 / 3) = 4/3= 1
        #  set is unique value, no duplicates
        # add value into Hash set -> add
        # add value into Hash Map -> append
        
        cols = defaultdict(set)
        rows = defaultdict(set)
        squares = defaultdict(set) # key is (r // 3, c // 3)

        for r in range(9):
            for c in range(9):
                if board[r][c] == ".":
                    continue
                if (board[r][c] in cols[c]
                    or board[r][c] in rows[r]
                    or board[r][c] in squares[(r // 3, c // 3)]):
                    return False
                cols[c].add(board[r][c])
                rows[r].add(board[r][c])
                squares[(r // 3, c // 3)].add(board[r][c])
                
        return True

        