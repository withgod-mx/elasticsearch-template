package kz.dar.tech.elasticsearch.template.util

import kz.dar.tech.elasticsearch.template.model.PostModel

trait Codec {

  implicit val userEncodeDecode: EncoderDecoder[PostModel] = DerivedEncoderDecoder[PostModel]




}
