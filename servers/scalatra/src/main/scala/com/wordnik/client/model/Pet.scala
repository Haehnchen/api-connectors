package com.wordnik.client.model

import com.wordnik.client.model.Category
import com.wordnik.client.model.Tag
case class Pet(
  id: Long, // unique identifier for the pet

  category: Option[Category],

  name: String,

  photoUrls: Option[List[String]],

  tags: Option[List[Tag]],

  status: Option[String] // pet status in the store
  )

