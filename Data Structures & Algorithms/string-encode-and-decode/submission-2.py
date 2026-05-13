class Solution:

    def encode(self, strs: List[str]) -> str:
        # ["Hello","World"]. => "5#Hello5#World"
        result = ""
        for s in strs:
            result += str(len(s)) + "#" + s
        return result

    def decode(self, s: str) -> List[str]:
        # "5#Hello5#World" => ["Hello","World"]
        #  i
        #  j
        #   j
        #  length = int(str[i:j])
        #    i      i = j+1
        #         j   = i + length
        #         i = j
        #  string = str[j+1+length]
        #  reset i: i = j + 1 + length
        
        result, i = [], 0

        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            i = j + 1
            j = i + length
            result.append(s[i:j])
            i = j

        return result