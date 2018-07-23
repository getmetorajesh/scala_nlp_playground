import breeze.linalg._

val m = DenseMatrix.zeros[Int](5,4)

m.rows
m.cols

m(::,1)

m(4, ::) := DenseVector(1,2,3,4).t

m