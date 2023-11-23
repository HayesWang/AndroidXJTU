package com.xjtusports.app.modules.dhi16.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDhi16Binding
import com.xjtusports.app.modules.dhi16.`data`.model.Dhi2RowModel
import com.xjtusports.app.modules.dhi16.`data`.viewmodel.Dhi16VM
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Dhi16Activity : BaseActivity<ActivityDhi16Binding>(R.layout.activity_dhi_16) {
  private val viewModel: Dhi16VM by viewModels<Dhi16VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val adapter = Adapter(viewModel.List.value?:mutableListOf())
    binding.recycler.adapter = adapter
    adapter.setOnItemClickListener(
    object : Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dhi2RowModel) {
        onClickRecycler(view, position, item)
      }
    }
    )
    viewModel.List.observe(this) {
      adapter.updateData(it)
    }
    binding.dhi16VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecycler(
    view: View,
    position: Int,
    item: Dhi2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DHI16ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi16Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
