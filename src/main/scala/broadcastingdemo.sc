import breeze.linalg._
import breeze.stats.mean

//adapting a matrix so that operations can be applied column-wise or row-wise is called broadcasting
// "* is the broadcasting operator"

val dm = DenseMatrix((1.0, 2.0, 3.0), (4.0,5.0, 6.0))

println(dm(::,*) + DenseVector(10.0, 20.0))

val res = dm(::,*) + DenseVector(10.0, 20.0)

res(::,*):=DenseVector(4.0, 5.0)
println(res)

mean(dm(::,*))

mean(dm(*, ::))
