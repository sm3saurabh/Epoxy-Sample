package com.epoxysample.epoxy

import com.airbnb.epoxy.EpoxyController
import com.epoxysample.LayoutElfModelBindingModel_
import com.epoxysample.domains.Domain
import com.epoxysample.domains.Dwarf
import com.epoxysample.domains.Elf
import com.epoxysample.domains.Neanderthal
import com.epoxysample.epoxy.models.NeanderthalEpoxyModel_
import com.epoxysample.epoxy.view.CustomDwarfViewModel_

class SampleController(var data: Domain): EpoxyController() {



    override fun buildModels() {
        data.lifeForms.forEach { lifeForm ->
            when (lifeForm) {
                is Elf -> buildElf(lifeForm)
                is Dwarf -> buildDwarf(lifeForm)
                is Neanderthal -> buildNeanderthal(lifeForm)
            }
        }
    }

    private fun buildElf(elf: Elf) {
        LayoutElfModelBindingModel_()
            .id(elf.uniqueId)
            .elf(elf)
            .addTo(this)
    }

    private fun buildDwarf(dwarf: Dwarf) {
        CustomDwarfViewModel_()
            .id(dwarf.uniqueId)
            .dwarf(dwarf)
            .addTo(this)
    }

    private fun buildNeanderthal(neanderthal: Neanderthal) {
        NeanderthalEpoxyModel_()
            .id(neanderthal.uniqueId)
            .neanderthal(neanderthal)
            .addTo(this)
    }
}