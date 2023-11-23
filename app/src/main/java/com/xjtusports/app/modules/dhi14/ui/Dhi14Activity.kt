package com.xjtusports.app.modules.dhi14.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDhi14Binding
import com.xjtusports.app.modules.dhi14.`data`.model.Dhi0RowModel
import com.xjtusports.app.modules.dhi14.`data`.viewmodel.Dhi14VM
import com.xjtusports.app.modules.dhi15.ui.Dhi15Activity
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Dhi14Activity : BaseActivity<ActivityDhi14Binding>(R.layout.activity_dhi_14) {
  private val viewModel: Dhi14VM by viewModels<Dhi14VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val adapter = Adapter(viewModel.List.value?:mutableListOf())
    binding.recycler.adapter = adapter
    adapter.setOnItemClickListener(
    object : Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dhi0RowModel) {
        onClickRecycler(view, position, item)
      }
    }
    )
    viewModel.List.observe(this) {
      adapter.updateData(it)
    }
    binding.dhi14VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignUp.setOnClickListener {
      val destIntent = Dhi15Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecycler(
    view: View,
    position: Int,
    item: Dhi0RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DHI14ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi14Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
