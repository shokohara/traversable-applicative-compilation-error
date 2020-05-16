package example

import cats.{Applicative, Traverse}

case class Sample1[F[_]: Traverse: Applicative](hoge: F[Unit])
