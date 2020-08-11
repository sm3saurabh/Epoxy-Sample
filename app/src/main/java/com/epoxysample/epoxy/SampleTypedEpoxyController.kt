package com.epoxysample.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import com.epoxysample.domains.Domain
import com.epoxysample.domains.Dwarf
import com.epoxysample.domains.Elf
import com.epoxysample.domains.Neanderthal
import com.epoxysample.epoxy.models.neanderthal
import com.epoxysample.epoxy.view.customDwarfView
import com.epoxysample.layoutElfModel

class SampleTypedEpoxyController : TypedEpoxyController<Domain>() {


    override fun buildModels(data: Domain?) {
        data?.let {
            buildItems(it)
        }
    }

    private fun buildItems(domain: Domain) {
        domain.lifeForms.forEach { lifeForm ->

            when (lifeForm) {
                is Elf -> buildElf(lifeForm)
                is Dwarf -> buildDwarf(lifeForm)
                is Neanderthal -> buildNeanderthal(lifeForm)
            }

        }
    }

    private fun buildElf(elf: Elf) {
        layoutElfModel {
            id(elf.uniqueId)
            elf(elf)
        }
    }

    private fun buildDwarf(dwarf: Dwarf) {
        customDwarfView {
            id(dwarf.uniqueId)
            dwarf(dwarf)
        }
    }

    private fun buildNeanderthal(neanderthal: Neanderthal) {
        neanderthal {
            id(neanderthal.uniqueId)
            neanderthal(neanderthal)
        }
    }


}