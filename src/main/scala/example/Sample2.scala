package example

import cats.{Applicative, Traverse}

class Sample2[F[_]: Traverse: Applicative](data: Sample1[F]) {
  data.hoge.fmap(_ => ())
}
