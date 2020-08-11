package com.epoxysample.epoxy.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.epoxysample.R
import com.epoxysample.databinding.LayoutDwarfModelBinding
import com.epoxysample.domains.Dwarf


@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class CustomDwarfView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null
) : FrameLayout(context, attributeSet) {

    private val dwarfView: LayoutDwarfModelBinding =
        LayoutDwarfModelBinding.inflate(LayoutInflater.from(context), this, true)

    @ModelProp fun setDwarf(dwarf: Dwarf) {
        val name = context.getString(R.string.dwarf_name, dwarf.name)
        val age = context.getString(R.string.age, dwarf.age)
        val bmi = context.getString(R.string.bmi, dwarf.bmi)

        dwarfView.dwarfNameView.text = name
        dwarfView.dwarfAgeView.text = age
        dwarfView.dwarfBmiView.text = bmi
    }
}