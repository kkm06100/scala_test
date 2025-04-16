package functor

trait Monad[M[_]] extends Functor[M[_]] {

  def unit[A]: M[A]

  def flat[A](mma: M[M[A]]): M[A]

  def flatLift[T, U](f: T => M[U]): M[T] => M[U]
}
