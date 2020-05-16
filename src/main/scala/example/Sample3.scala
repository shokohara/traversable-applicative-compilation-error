package example

import cats.{Applicative, Traverse}
import cats.implicits._

class Sample3[F[_]: Traverse: Applicative](data: Option[Sample1[F]]) {
  cats.instances.option.catsStdInstancesForOption
    .traverse(data)(_.hoge.fmap(_ => ()))
}
