package com.xjtusports.app.modules.peclasses.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityPeClassesBinding
import com.xjtusports.app.modules.dhi14.ui.Dhi14Activity
import com.xjtusports.app.modules.info.ui.InfoActivity
import com.xjtusports.app.modules.peclasses.`data`.model.PeClassesRowModel
import com.xjtusports.app.modules.peclasses.`data`.viewmodel.PeClassesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PeClassesActivity : BaseActivity<ActivityPeClassesBinding>(R.layout.activity_pe_classes) {
  private val viewModel: PeClassesVM by viewModels<PeClassesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val peClassesAdapter = PeClassesAdapter(viewModel.peClassesList.value?:mutableListOf())
    binding.recyclerPeClasses.adapter = peClassesAdapter
    peClassesAdapter.setOnItemClickListener(
    object : PeClassesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PeClassesRowModel) {
        onClickRecyclerPeClasses(view, position, item)
      }
    }
    )
    viewModel.peClassesList.observe(this) {
      peClassesAdapter.updateData(it)
    }
    binding.peClassesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignInForTodaysLesson.setOnClickListener {
      val destIntent = Dhi14Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPeClasses(
    view: View,
    position: Int,
    item: PeClassesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PE_CLASSES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PeClassesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
