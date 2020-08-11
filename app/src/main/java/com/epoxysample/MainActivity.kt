package com.epoxysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.epoxysample.databinding.ActivityMainBinding
import com.epoxysample.domains.createDomain
import com.epoxysample.epoxy.SampleController
import com.epoxysample.epoxy.SampleTypedEpoxyController

class MainActivity : AppCompatActivity() {

  private var _binding: ActivityMainBinding? = null
  private val binding: ActivityMainBinding
    get() = _binding!!

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    setupRecyclerView()

    setupController()

    //setupTypedController()

  }

  private fun setupRecyclerView() {
    binding.recyclerView.run {
      layoutManager = LinearLayoutManager(this@MainActivity)
      setHasFixedSize(true)
    }
  }

  private fun setupController() {
    val domain = createDomain()
    val controller = SampleController(domain)
    binding.recyclerView.adapter = controller.adapter

    controller.requestModelBuild()
  }

  private fun setupTypedController() {
    val controller = SampleTypedEpoxyController()

    binding.recyclerView.adapter = controller.adapter

    controller.setData(createDomain())

    binding.recyclerView.withModels {



    }
  }

  override fun onDestroy() {
    super.onDestroy()
    _binding = null
  }
}