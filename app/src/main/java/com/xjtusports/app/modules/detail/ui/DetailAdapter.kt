package com.xjtusports.app.modules.detail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.xjtusports.app.R
import com.xjtusports.app.databinding.RowDetailBinding
import com.xjtusports.app.modules.detail.`data`.model.DetailRowModel
import kotlin.Int
import kotlin.collections.List

class DetailAdapter(
  var list: List<DetailRowModel>
) : RecyclerView.Adapter<DetailAdapter.RowDetailVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail,parent,false)
    return RowDetailVH(view)
  }

  override fun onBindViewHolder(holder: RowDetailVH, position: Int) {
    val detailRowModel = DetailRowModel()
    // TODO uncomment following line after integration with data source
    // val detailRowModel = list[position]
    holder.binding.detailRowModel = detailRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DetailRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DetailRowModel
    ) {
    }
  }

  inner class RowDetailVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDetailBinding = RowDetailBinding.bind(itemView)
  }
}
