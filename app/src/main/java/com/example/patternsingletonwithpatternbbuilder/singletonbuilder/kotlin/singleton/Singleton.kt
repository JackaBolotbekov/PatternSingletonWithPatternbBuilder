package com.example.patternsingletonwithpatternbbuilder.singletonbuilder.kotlin.singleton

import com.example.patternsingletonwithpatternbbuilder.singletonbuilder.kotlin.builder.Builder

class Singleton {

    object Singleton {

        fun getData(): String {

            val builder =
                Builder()
                    .PatternBuilder()
                    .number(100)
                    .sensitivity(200)
                    .build()

            return " ${builder.number}" +
                    ", ${builder.sensitivity}"
        }
    }
}
