package com.epoxysample.epoxy.models


import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.epoxysample.R
import com.epoxysample.domains.Neanderthal

@EpoxyModelClass(layout = R.layout.neanderthal_model)
abstract class NeanderthalEpoxyModel: EpoxyModelWithHolder<NeanderthalEpoxyModel.NeanderthalViewHolder>() {

    @EpoxyAttribute lateinit var neanderthal: Neanderthal

    override fun bind(holder: NeanderthalViewHolder) {
        val context = holder.nameView.context

        val name = context.getString(R.string.neanderthal_name, neanderthal.name)
        val age = context.getString(R.string.age, neanderthal.age)
        val bmi = context.getString(R.string.bmi, neanderthal.bmi)

        holder.nameView.text = name
        holder.ageView.text = age
        holder.bmiView.text = bmi
    }

    inner class NeanderthalViewHolder: EpoxyHolder() {

        lateinit var nameView: TextView
        lateinit var ageView: TextView
        lateinit var bmiView: TextView


        override fun bindView(itemView: View) {
            nameView = itemView.findViewById(R.id.neanderthal_name_view)
            ageView = itemView.findViewById(R.id.neanderthal_age_view)
            bmiView = itemView.findViewById(R.id.neanderthal_bmi_view)
        }

    }
}