package com.xjtusports.app.modules.detail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDetailBinding
import com.xjtusports.app.modules.detail.`data`.model.DetailRowModel
import com.xjtusports.app.modules.detail.`data`.viewmodel.DetailVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DetailActivity : BaseActivity<ActivityDetailBinding>(R.layout.activity_detail) {
  private val viewModel: DetailVM by viewModels<DetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val detailAdapter = DetailAdapter(viewModel.detailList.value?:mutableListOf())
    binding.recyclerDetail.adapter = detailAdapter
    detailAdapter.setOnItemClickListener(
    object : DetailAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DetailRowModel) {
        onClickRecyclerDetail(view, position, item)
      }
    }
    )
    viewModel.detailList.observe(this) {
      detailAdapter.updateData(it)
    }
    binding.detailVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDetail(
    view: View,
    position: Int,
    item: DetailRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
