def i = 1
assert 1 == i++
assert 3 == ++i

def x = ""
// StringBuilder, StringBuffer
// x += "Hello" same as x = x + "Hello"
3.times { x += "Hello" }
assert x == "HelloHelloHello"

/*for(int i = 1; i <= 10;i++) {
    println(i + ". Chcem zit nonstop...")
}*/

3.times({x += "Hello"})
3.times() { x += "Hello" }

def total = 0
1.upto(3) { total += it }
assert total == 1 + 2 + 3



def countDown = []
5.downto 1, { countDown << "$it ..." }
assert countDown == ['5 ...', '4 ...', '3 ...', '2 ...']





def odds = []
(1..10).step(2) { odds << it }
assert odds == [1, 3, 5, 7, 9]