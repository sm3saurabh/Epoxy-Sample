package com.epoxysample.domains

import java.util.concurrent.atomic.AtomicLong

val epoxyIdGenerator = AtomicLong(1)

data class Domain(
    val lifeForms: List<IntelligentLifeForm>
)

sealed class IntelligentLifeForm

data class Dwarf(
    val name: String,
    val age: Int,
    val bmi: Float,
    val uniqueId: Long
) : IntelligentLifeForm()

data class Elf(
    val name: String,
    val age: Int,
    val bmi: Float,
    val uniqueId: Long
) : IntelligentLifeForm()

data class Neanderthal(
    val name: String,
    val age: Int,
    val bmi: Float,
    val uniqueId: Long
) : IntelligentLifeForm()


fun createDomain(): Domain {
    return Domain(
        lifeForms = dumbFunctionToCreateIntelligentLifeForms()
    )
}

fun dumbFunctionToCreateIntelligentLifeForms(): List<IntelligentLifeForm> {
    val dwarfs: List<Dwarf> = getDummyDwarfs()
    val elves: List<Elf> = getDummyElves()
    val neanderthals: List<Neanderthal> = getDummyNeanderthal()

    val lifeForms = dwarfs + elves + neanderthals

    return lifeForms.shuffled()
}

fun getDummyDwarfs(): List<Dwarf> {
    return listOf(
        Dwarf(
            name = "Azaghâl",
            age = 473,
            bmi = 2.0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Dwarf(
            name = "Balin",
            age = 27,
            bmi = 2.0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Dwarf(
            name = "Bifur",
            age = 54,
            bmi = 2.0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Dwarf(
            name = "Blacklocks",
            age = 76,
            bmi = 2.0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Dwarf(
            name = "Bodruith",
            age = 43,
            bmi = 2.0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Dwarf(
            name = "Bofur",
            age = 73,
            bmi = 2.0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Dwarf(
            name = "Bombur",
            age = 48,
            bmi = 2.0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        )

    )
}

fun getDummyElves(): List<Elf> {
    return listOf(
        Elf(
            name = "Figwit",
            age = 22,
            bmi = 3.38f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Elf(
            name = "Haldir",
            age = 22,
            bmi = 3.38f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Elf(
            name = "Thranduil",
            age = 22,
            bmi = 3.38f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Elf(
            name = "Celebrimbor",
            age = 22,
            bmi = 3.38f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Elf(
            name = "Legolas",
            age = 22,
            bmi = 3.38f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Elf(
            name = "Glorfindel",
            age = 22,
            bmi = 3.38f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Elf(
            name = "Galadriel",
            age = 22,
            bmi = 3.38f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        )
    )
}

fun getDummyNeanderthal(): List<Neanderthal> {
    return listOf(
        Neanderthal(
            name = "unknown",
            age = 0,
            bmi = 0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Neanderthal(
            name = "unknown",
            age = 0,
            bmi = 0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Neanderthal(
            name = "unknown",
            age = 0,
            bmi = 0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Neanderthal(
            name = "unknown",
            age = 0,
            bmi = 0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Neanderthal(
            name = "unknown",
            age = 0,
            bmi = 0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Neanderthal(
            name = "unknown",
            age = 0,
            bmi = 0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        ), Neanderthal(
            name = "unknown",
            age = 0,
            bmi = 0f,
            uniqueId = epoxyIdGenerator.getAndIncrement()
        )
    )
}

