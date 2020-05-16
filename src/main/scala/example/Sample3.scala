package example

import cats.{Applicative, Functor, Traverse}

class Sample3[F[_]: Traverse: Applicative](data: Option[Sample1[F]]) {
  cats.instances.option.catsStdInstancesForOption
    .traverse(data)(a => Applicative[F].fmap(a.hoge)(_ => ()))
}
