package com.example.patternsingletonwithpatternbbuilder.singletonbuilder.kotlin.builder

class Builder
    (
    val number: Int = 0,
    val sensitivity: Int = 0,
) {

    inner class PatternBuilder {

        var number: Int = 0
        var sensitivity: Int = 0

        fun sensitivity(value: Int): PatternBuilder {
            this.sensitivity = value
            return this
        }

        fun number(value: Int): PatternBuilder {
            this.number = value
            return this
        }

        fun build(): Builder = Builder(
            number = number,
            sensitivity = sensitivity
        )
    }
}