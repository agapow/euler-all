// print the sum of numbers less than 1000 that are divisble by 5 or 3

object Ex1 {
	def main() = {
		val range = 0.until (1000)
		x = range.filter { i => (it % 3 == 0) || (it % 5 == 0) }
		sum = x.reduceLeft[Int](_+_)
		println (sum)
		// => 233168
	}
}

