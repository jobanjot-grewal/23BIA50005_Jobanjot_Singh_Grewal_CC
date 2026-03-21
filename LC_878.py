class Solution:
    def nthMagicalNumber(self, n: int, a: int, b: int) -> int:
        mod = 10**9 + 7

        l = min(a,b)
        r = n * min(a,b)
        lcm = math.lcm(a,b)

        #print(lcm)

        while l < r :
            mid = l + ( r - l) // 2

            count_div_a = mid // a
            count_div_b = mid // b
            count_comm = mid // lcm

            if n <= ( count_div_a + count_div_b - count_comm) :
                r = mid
            else :
                l = mid + 1
        
        return l % mod
