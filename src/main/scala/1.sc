import breeze.linalg._

val x = DenseVector.zeros[Double](5)
/* equivalent to
DenseVector(1,2,3) or with

*/

DenseVector.fill(5)(0.0)

// unlike scala all vectors are column vectors

// slicing, slices with range are much faster than arbirary seq
x(3 to 4) := 0.5
println(x)

// slice op constructs a read thro and write thro view
// values using the vectorized set op :=
x(0 to 1) := DenseVector(0.1, 0.2)
