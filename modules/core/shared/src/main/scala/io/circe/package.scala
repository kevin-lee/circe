package io

// scalastyle:off
/**
 * ==Overview==
 *
 *  This is the API documentation for [[http://circe.io circe]], a JSON library for
 *  Scala and Scala.js.
 *
 *  The library is divided into a number of modules that either provide core
 *  functionality, support additional features via third-party dependencies, or
 *  facilitate integration with other libraries or frameworks.
 *
 *   - [[io.circe.numbers numbers]]: core facilities for representing and parsing
 *     JSON numbers.
 *   - [[io.circe core]]: our JSON abstract syntax tree, our zipper-like cursor
 *     types, and our encoding and decoding type classes (and instances).
 *   - [[https://github.com/circe/circe/blob/master/modules/parser/jvm/src/main/scala/io/circe/parser/package.scala parser]]: JSON parsing support for both the Java Virtual
 *     Machine (using Jawn) and Scala.js (using the native JavaScript JSON parser).
 *   - [[io.circe.testing testing]]: ScalaCheck `Arbitrary` instances for circe's
 *     JSON AST and other types, as well as other useful testing tools.
 *   - [[io.circe.literal literal]]: JSON string interpolation and encoder and
 *     decoder instances for literal types.
 *   - [[io.circe.generic generic]]: Shapeless-powered
 *     [[https://circe.github.io/circe/codec.html generic derivation]] for case
 *     classes and sealed trait hierarchies.
 *   - [[io.circe.generic.extras generic-extras]]: additional experimental generic
 *     derivation functionality (including some configurability).
 *   - [[io.circe.shapes shapes]]: encoders and decoders for
 *     [[https://github.com/milessabin/shapeless Shapeless]] hlists, coproducts, records, and sized collections.
 *   - [[https://github.com/circe/circe/blob/master/modules/scodec/shared/src/main/scala/io/circe/scodec/package.scala scodec]]: encoders and decoders for
 *     [[https://github.com/scodec/scodec-bits Scodec]]'s `BitVector` and `ByteVector`.
 *   - [[https://github.com/circe/circe/blob/master/modules/refined/shared/src/main/scala/io/circe/refined/package.scala refined]]: encoders and decoders for [[https://github.com/fthomas/refined refined]] types.
 *   - [[https://github.com/circe/circe-spray/blob/master/core/src/main/scala/io/circe/spray/JsonSupport.scala]]: Spray marshaller conversions for circe's type classes.
 *
 *  Please refer to the [[https://circe.github.io/circe/ documentation]] for a more
 *  detailed introduction to the library.
 */
// scalastyle:on
package object circe {
  @deprecated("Use Encoder.AsRoot", "0.12.0")
  type RootEncoder[A] = Encoder.AsRoot[A]
  @deprecated("Use Encoder.AsRoot", "0.12.0")
  val RootEncoder = Encoder.AsRoot

  @deprecated("Use Encoder.AsArray", "0.12.0")
  type ArrayEncoder[A] = Encoder.AsArray[A]
  @deprecated("Use Encoder.AsArray", "0.12.0")
  val ArrayEncoder = Encoder.AsArray

  @deprecated("Use Encoder.AsObject", "0.12.0")
  type ObjectEncoder[A] = Encoder.AsObject[A]
  @deprecated("Use Encoder.AsObject", "0.12.0")
  val ObjectEncoder = Encoder.AsObject
}
