class Solution {
    func getFactors(_ n: Int, _ start: Int = 2) -> [[Int]] {
    if n == 2 {
        return []
    }
    var ans = [[Int]]()
    for i in stride(from: start, through: n/2, by: 1) {
        if (n%i) == 0 {
            let next = n/i
            if next >= i {
                var temp = getFactors(next, i) + [[next]]
                temp = temp.map {
                    return ([i] + $0)
                }
                ans += temp
            }
        }
    }
    return ans
}
}
