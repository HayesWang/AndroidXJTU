package com.xjtusports.app.modules.dhi15.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDhi15Binding
import com.xjtusports.app.modules.dhi15.`data`.model.Dhi1RowModel
import com.xjtusports.app.modules.dhi15.`data`.viewmodel.Dhi15VM
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Dhi15Activity : BaseActivity<ActivityDhi15Binding>(R.layout.activity_dhi_15) {
  private val viewModel: Dhi15VM by viewModels<Dhi15VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val adapter = Adapter(viewModel.List.value?:mutableListOf())
    binding.recycler.adapter = adapter
    adapter.setOnItemClickListener(
    object : Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dhi1RowModel) {
        onClickRecycler(view, position, item)
      }
    }
    )
    viewModel.List.observe(this) {
      adapter.updateData(it)
    }
    binding.dhi15VM = viewModel
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
    item: Dhi1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DHI15ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi15Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
