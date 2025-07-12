package com.example.daily_quotes.DTO.response

import com.google.gson.annotations.SerializedName

data class QuoteResponse(

	@field:SerializedName("QuoteResponse")
	val quoteResponse: List<QuoteDTO?>? = null
)

data class QuoteDTO(

	@field:SerializedName("q")
	val q: String? = null,

	@field:SerializedName("a")
	val a: String? = null,

	@field:SerializedName("h")
	val h: String? = null
)
