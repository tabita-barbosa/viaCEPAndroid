package com.example.viacep.presenter.list.adapter

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class VerticalSpaceItemDecoration(
    private val verticalSpaceHeight: Int,
    private val firstItemTopMargin: Int,
    private val lastItemBottomMargin: Int
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)
        val itemCount = parent.adapter?.itemCount ?: 0

        if (position == 0) {
            outRect.top = firstItemTopMargin
        }

        if (position == itemCount - 1) {
            outRect.bottom = lastItemBottomMargin
        }

        outRect.top += verticalSpaceHeight / 2
        outRect.bottom += verticalSpaceHeight / 2
    }
}
